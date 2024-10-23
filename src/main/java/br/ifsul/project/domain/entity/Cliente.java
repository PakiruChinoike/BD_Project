package br.ifsul.project.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "primeiro_nome", length = 50, nullable = false)
    private String primeiroNome;

    @Column(name = "ultimo_nome", length = 50, nullable = false)
    private String ultimoNome;

    @Column(name = "email", length = 100, unique = true, nullable = false)
    private String email;

    @Column(name = "telefone", length = 15, unique = true, nullable = true)
    private String telefone;

}
