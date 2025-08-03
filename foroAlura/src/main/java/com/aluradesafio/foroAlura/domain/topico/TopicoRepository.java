package com.aluradesafio.foroAlura.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico,Long> {
   Optional<Topico> findById(Long id);
}
