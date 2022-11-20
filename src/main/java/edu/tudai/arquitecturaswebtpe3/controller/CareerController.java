package edu.tudai.arquitecturaswebtpe3.controller;

//import edu.tudai.arquitecturaswebtpe3.domain.dto.CareerCount;
//import edu.tudai.arquitecturaswebtpe3.domain.dto.CareerReportRow;
import edu.tudai.arquitecturaswebtpe3.model.CareerAto;
//import edu.tudai.arquitecturaswebtpe3.service.CareerService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/careers")
public class CareerController {

//    @Autowired
//    private CareerService careerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CareerAto createCareer(@RequestBody @Validated CareerAto careerAto) {
        //return careerService.createCareer(careerAto);
        return CareerAto.builder().build();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CareerAto> getCareers() {
        //return careerService.getCareers();
        return Collections.emptyList();
    }

    /**
     * f) recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
     *
     * @return
     */
//    @GetMapping("/inscriptions")
//    @ResponseStatus(HttpStatus.OK)
//    public List<CareerCount> getCareersByInscriptions() {
//        return careerService.getCareersByInscriptions();
//    }

    /**
     * h) generar un reporte de las carreras, que para cada carrera incluya información de los
     * inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y
     * presentar los años de manera cronológica.
     *
     * @return
     */
//    @GetMapping("/report")
//    @ResponseStatus(HttpStatus.OK)
//    public List<CareerReportRow> getCareersReport() {
//        return careerService.getCareersReport();
//    }
}
