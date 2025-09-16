package com.seuprojeto.projetocarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.projetocarros.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
