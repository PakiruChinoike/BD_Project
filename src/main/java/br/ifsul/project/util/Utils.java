package br.ifsul.project.util;

import java.util.Random;
import java.math.BigDecimal;

public final class Utils {

	private static String[] _nomes = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena",
			"Igor", "Juliana", "Lucas", "Mariana", "Nicolas", "Olivia", "Paulo", "Quenia", "Renato", "Sara", "Tiago",
			"Viviane" };

	private static String[] _sobrenomes = { "Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa", "Rodrigues",
			"Almeida", "Nascimento", "Lima", "Araujo", "Fernandes", "Barbosa", "Vieira", "Carvalho", "Ribeiro",
			"Martins", "Gomes", "Mendes", "Freitas" };

	private static String[] _profissoes = { "Engenheiro(a)", "Médico(a)", "Advogado(a)", "Professor(a)", "Arquiteto(a)",
			"Enfermeiro(a)", "Farmacêutico(a)", "Dentista", "Psicólogo(a)", "Veterinário(a)", "Jornalista", "Designer",
			"Programador(a)", "Analista", "Eletricista", "Carpinteiro(a)", "Mecânico(a)", "Chefe de Cozinha",
			"Motorista", "Contador(a)" };

	public static String getRandomName() {

		Random r = new Random();

		int randomValue = r.nextInt(20);
		String firstName = _nomes[randomValue];

        randomValue = r.nextInt(20);
        String lastName = _sobrenomes[randomValue];

		return firstName + " " + lastName;
	}

	public static String getRandomProfession() {

		Random r = new Random();

        int randomValue = r.nextInt(20);
        String profession = _profissoes[randomValue];

		return profession;
	}

    public static BigDecimal getRandomSalary() {
        Random r = new Random();

        int randomValue = r.nextInt(2000, 20000);
        BigDecimal salary = new BigDecimal(randomValue);

        return salary;
    }
}
