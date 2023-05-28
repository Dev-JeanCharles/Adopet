package com.fourtk.Adopet.controllers;

import com.fourtk.Adopet.dtos.requests.TutorRequest;
import com.fourtk.Adopet.services.TutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/tutors")
public class TutorController {

    @Autowired
    private TutorService service;

    @PostMapping
    public ResponseEntity<TutorRequest> insertTutors(@Valid @RequestBody TutorRequest request) {

        request = service.insertTutor(request);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(request.getId()).toUri();

        return ResponseEntity.created(uri).body(request);

    }

}
