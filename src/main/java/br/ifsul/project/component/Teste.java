package br.ifsul.project.component;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ifsul.project.domain.Funcionario;
import br.ifsul.project.repository.FuncionarioRepository;
import br.ifsul.project.util.Utils;
import jakarta.annotation.PostConstruct;

@Component
public class Teste {
    
    @Autowired
    private FuncionarioRepository repository;

    @PostConstruct
    private void run() {

        for (int i = 0; i<100; i++) {
            String[] nomeCompleto = Utils.getRandomName().split(" ");
            String profissao = Utils.getRandomProfession();
            BigDecimal salario = Utils.getRandomSalary();

            Funcionario f = Funcionario.builder()
                .primeiroNome(nomeCompleto[0])
                .ultimoNome(nomeCompleto[1])
                .profissao(profissao)
                .email(nomeCompleto[0]+"."+nomeCompleto[1]+"@gmail.com")
                .salario(salario)
                .dataContratacao(LocalDate.now())
                .build();

            repository.save(f);

            // List<Funcionario> all = repository.findAll();
            // for (Funcionario funcionario : all) {
            //     System.out.println(funcionario.getPrimeiroNome() + " " + funcionario.getUltimoNome() + " " + funcionario.getProfissao()  + " R$" + funcionario.getSalario());
            // }

            List<Funcionario> nameLike = repository.findAllByNameLike("pereira");
            for (Funcionario funcionario : nameLike) {
                System.out.println(funcionario.getPrimeiroNome() + " " + funcionario.getUltimoNome() + " " + funcionario.getProfissao() + " R$" + funcionario.getSalario());
            }

            List<Funcionario> salarioBetween = repository.findAllBetweenSalario(3000, 12000);
            for (Funcionario funcionario : salarioBetween) {
                System.out.println(funcionario.getPrimeiroNome() + " " + funcionario.getUltimoNome() + " " + funcionario.getProfissao()  + " R$" + funcionario.getSalario());
            }
        }
    }

}
