package br.ifsul.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.project.domain.Ativo;

@Repository
public interface AtivoRepository extends JpaRepository<Ativo, Integer>{

}
