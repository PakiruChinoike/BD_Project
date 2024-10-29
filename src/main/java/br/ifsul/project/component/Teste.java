package br.ifsul.project.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ifsul.project.domain.Cliente;
import br.ifsul.project.repository.ClienteRepository;
import jakarta.annotation.PostConstruct;

@Component
public class Teste {
    
    @Autowired
    private ClienteRepository repository;

    // @PostConstruct
    // private void run() {
    //     Cliente c = new Cliente();
    //     c.setPrimeiroNome("Jonas");
    //     c.setUltimoNome("Pedro");
    //     c.setEmail("jonas@pedro");
    //     c.setTelefone("2345meia78");

    //     repository.save(c);
    //     List<Cliente> list = repository.findAll();
    //     for (Cliente cliente : list) {
    //         System.out.println(cliente);
    //     }

    // }

}
