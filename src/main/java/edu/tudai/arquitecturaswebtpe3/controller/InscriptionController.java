package edu.tudai.arquitecturaswebtpe3.controller;

import edu.tudai.arquitecturaswebtpe3.model.InscriptionAto;
//import edu.tudai.arquitecturaswebtpe3.service.InscriptionService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/inscriptions")
public class InscriptionController {

//    @Autowired
//    private InscriptionService inscriptionService;

    /**
     * b) matricular un estudiante en una carrera
     *
     * @param inscriptionAto
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InscriptionAto createInscription(@RequestBody @Validated InscriptionAto inscriptionAto) {
        //return inscriptionService.createInscription(inscriptionAto);
        return InscriptionAto.builder().build();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InscriptionAto> getInscriptions() {
        //return inscriptionService.getInscriptions();
        return Collections.EMPTY_LIST;
    }
}
