package com.fourtk.Adopet.repositories;

import com.fourtk.Adopet.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {
    Tutor findByCpf(String cpf);

}
