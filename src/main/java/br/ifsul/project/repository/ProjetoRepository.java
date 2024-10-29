package br.ifsul.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.project.domain.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{
    
}
