package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {
	public static void main(String[] args) {
		System.out.println("Hellowww salve mundo");

		Paciente paciente1 = new Paciente();
		paciente1.name = "Bob";
		paciente1.height = 1.65;
		paciente1.weight = 55;
		paciente1.phone = "Não tem celular" ;
		paciente1.birthDate = LocalDate.of(2000, 2, 19);
		
		paciente1.showPacientProfile();
		
		
		Paciente paciente2 = new Paciente();
		paciente2.name = "Sou Paciente Não";
		paciente2.height = 1.70;
		paciente2.weight = 59;
		paciente2.phone = "11 40028922" ;
		paciente2.birthDate = LocalDate.of(2002, 9, 23);

		paciente2.showPacientProfile();
		
		Paciente paciente3 = new Paciente();
		Paciente paciente4 = new Paciente();
		Paciente paciente5 = new Paciente();
		Paciente paciente6 = new Paciente();
		Paciente paciente7 = new Paciente();
		
		System.out.println(paciente1);
		System.out.println(paciente2);


		
		//creating a patient object
		
		
	}

}
