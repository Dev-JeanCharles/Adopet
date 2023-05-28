package com.fourtk.Adopet.services;

import com.fourtk.Adopet.dtos.requests.TutorRequest;
import com.fourtk.Adopet.entities.Tutor;
import com.fourtk.Adopet.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    @Autowired
    private TutorRepository repository;

    public TutorRequest insertTutor(TutorRequest request) {

        Tutor entity = new Tutor();

        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setEmail(request.getEmail());
        entity.setAddress(request.getAddress());
        entity.setCity(request.getCity());
        entity.setCpf(request.getCpf());
        entity.setPassword(request.getPassword());
        entity.setImage(request.getImage());
        entity.setUf(request.getUf());
        entity.setPhone(request.getPhone());

        entity = repository.save(entity);

        return new TutorRequest(entity);
    }
}
