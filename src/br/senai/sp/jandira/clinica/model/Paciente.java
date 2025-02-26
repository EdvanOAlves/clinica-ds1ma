package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

/*
 * Programador: Edvan
 * Data: 26/02/2025
 * Empresa: SENAI
 */


public class Paciente{
		
	private String name;
	public LocalDate birthDate;
	public int weight;
	private double height;
	public String phone;
	private double imc;
	
	public void setName(String name) {
		
		if (name.length() >= 3){
			this.name = name.toUpperCase();
		}
		else {			
			System.out.println("O nome " + name + " deve conter pelo menos 3 caracteres");
		}
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHeight(double height) {
		if (height <= 0) {
			//Numero invalido
			System.out.println("Altura "+ height + " do(a) paciente"+ name + " inválida \nO programa não aceita valores menores que 0.");
		}
		else if (height < 1) {
			//Abaixo do range
			System.out.println("Altura "+ height + " do(a) paciente" + name + " inválida \n O mínimo é 1 metro.");
		}
		
		else if (height > 3) {
			//Acima do Range
			System.out.println("Altura "+ height + " do(a) paciente" + name + " inválida \n O mínimo é 1 metro.");
			
		}
		
		else if (height >= 1 && height <= 3) {
			//TRUE (Está dentro do range)
			this.height = height;
		}
		else {
			System.out.println("Altura inválida.");
		}
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public void setWeight(int weight) {
		if (weight < 30) {
			//Abaixo do Range
			System.out.println("Peso "+ weight + " do(a) paciente" + name + " inválido, o programa só aceita a partir de 30kg.");
		}
		else if (weight > 500) {
			//Acima do Range
			System.out.println("Peso "+ weight + " do(a) paciente" + name + " inválido, o programa só aceita abaixo de 500kg.");
		}
		else {
			//TRUE
			this.weight = weight;
		}
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void calculateAge() {
		
		
		
	}
	
	private double calculateImc() {
		imc = (weight/ (Math.pow(height, 2)));
		return imc;
	}
	
	public void classifyImc() {
		
	}
	
	public void showPatientProfile() {
		calculateImc();
		System.out.println("=======================");
		System.out.println("FICHA DO PACIENTE");
		System.out.println("=======================");
		System.out.println("Nome: "+ name);
		System.out.println("Peso: "+ weight);
		System.out.println("Altura: "+ height);
		System.out.println("IMC: "+ String.format("%.2f", calculateImc()));
		System.out.println("Telefone: "+ phone);
		System.out.println("=======================");
		System.out.println();
		
	}
	

}
