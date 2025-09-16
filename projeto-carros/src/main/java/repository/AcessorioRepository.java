package com.seuprojeto.projetocarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.projetocarros.model.Acessorio;

public interface AcessorioRepository extends JpaRepository<Acessorio, Long> {
}
