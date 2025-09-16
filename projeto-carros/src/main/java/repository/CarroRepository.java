package com.seuprojeto.projetocarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.projetocarros.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
