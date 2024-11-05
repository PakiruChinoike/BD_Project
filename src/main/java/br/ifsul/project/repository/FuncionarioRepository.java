package br.ifsul.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.ifsul.project.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
    
    @Query("select f from Funcionario f where f.primeiroNome like %:name% or f.ultimoNome like %:name%")
    public List<Funcionario> findAllByNameLike(@Param("name") String name);

    @Query("select f from Funcionario f where f.salario between :minimo and :maximo")
    public List<Funcionario> findAllBetweenSalario(@Param("minimo") int minimo, @Param("maximo") int maximo);

}
