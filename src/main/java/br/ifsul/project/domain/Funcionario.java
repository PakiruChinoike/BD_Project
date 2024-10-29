package br.ifsul.project.domain;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "primeiro_nome", length = 50, nullable = false)
    private String primeiroNome;

    @Column(name = "ultimo_nome", length = 50, nullable = false)
    private String ultimoNome;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "data_contratacao", nullable = false)
    private Date dataContratacao;

    @Column(name = "salario", nullable = false, precision = 10, scale = 2)
    private BigDecimal salario;

}
