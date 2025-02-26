package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {
	public static void main(String[] args) {
		System.out.println("Hellowww salve mundo");

		Paciente paciente1 = new Paciente();
		paciente1.setName("Bo");
		paciente1.setHeight(1.65);
		paciente1.setWeight(55);
		paciente1.phone = "Não tem celular" ;
		paciente1.birthDate = LocalDate.of(2000, 2, 19);
		
		paciente1.showPatientProfile();
		
		
		Paciente paciente2 = new Paciente();
		paciente2.setName("Edvan");
		paciente2.setHeight(1.70);
		paciente2.setWeight(59);
		paciente2.phone = "(11)4002-8922";
		paciente2.birthDate = LocalDate.of(2002, 9, 23);

		paciente2.showPatientProfile();
		
		Paciente paciente3 = new Paciente();
		Paciente paciente4 = new Paciente();
		Paciente paciente5 = new Paciente();
		Paciente paciente6 = new Paciente();
		Paciente paciente7 = new Paciente();
		
		
	}

}
