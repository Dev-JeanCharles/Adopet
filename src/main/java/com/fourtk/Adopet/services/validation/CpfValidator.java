package com.fourtk.Adopet.services.validation;

import com.fourtk.Adopet.configs.FieldMessage;
import com.fourtk.Adopet.dtos.requests.TutorRequest;
import com.fourtk.Adopet.entities.Tutor;
import com.fourtk.Adopet.repositories.TutorRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CpfValidator implements ConstraintValidator<CpfValid, TutorRequest> {
    @Autowired
    private TutorRepository repository;

    @Override
    public void initialize(CpfValid constraintAnnotation) {
    }

    @Override
    public boolean isValid(TutorRequest tutorRequest, ConstraintValidatorContext constraintValidatorContext) {
        List<FieldMessage> list = new ArrayList<>();

        Tutor tutor = repository.findByCpf(tutorRequest.getCpf());
        if (tutor != null) {
            list.add(new FieldMessage("Cpf", "Cpf already exists"));
        }
        for (FieldMessage e : list) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName()).addConstraintViolation();
        }
        return list.isEmpty();
    }
}
