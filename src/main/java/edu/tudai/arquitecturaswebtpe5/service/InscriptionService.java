package edu.tudai.arquitecturaswebtpe5.service;

import edu.tudai.arquitecturaswebtpe5.domain.entity.Career;
import edu.tudai.arquitecturaswebtpe5.domain.entity.Inscription;
import edu.tudai.arquitecturaswebtpe5.domain.entity.Student;
import edu.tudai.arquitecturaswebtpe5.domain.repository.CareerRepository;
import edu.tudai.arquitecturaswebtpe5.domain.repository.InscriptionRepository;
import edu.tudai.arquitecturaswebtpe5.domain.repository.StudentRepository;
import edu.tudai.arquitecturaswebtpe5.model.InscriptionAto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CareerRepository careerRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * b) matricular un estudiante en una carrera
     *
     * @param inscriptionAto
     * @return
     */
    public InscriptionAto createInscription(InscriptionAto inscriptionAto) {
        Inscription inscription = modelMapper.map(inscriptionAto, Inscription.class);
        Student student = studentRepository.findById(inscriptionAto.getStudentId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Student not found for for studentId=" + inscriptionAto.getStudentId()));
        inscription.setStudent(student);
        Career career = careerRepository.findById(inscriptionAto.getCareerId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Career not found for careerId=" + inscriptionAto.getCareerId()));
        inscription.setCareer(career);
        inscription = inscriptionRepository.save(inscription);
        return modelMapper.map(inscription, InscriptionAto.class);
    }

    public List<InscriptionAto> getInscriptions() {
        return inscriptionRepository.findAll().stream()
                .map(inscription -> modelMapper.map(inscription, InscriptionAto.class))
                .collect(Collectors.toList());
    }
}
