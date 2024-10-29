package br.ifsul.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.project.domain.Fatura;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Integer>{
    
}
