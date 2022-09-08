package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.dominio.Pessoa;

public class CalcIMC {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Olá, digite seu nome: ");
			p.setNome(sc.nextLine());
			
			System.out.println("Digite o peso em kg de " + p.getNome());
			p.setPeso(sc.nextDouble());
			
			System.out.println("Digite a altura em metros de " + p.getNome());
			p.setAltura(sc.nextDouble());

			double IMC = p.getPeso()/Math.pow(p.getAltura(), 2);
			
			System.out.println("O IMC de " + p.getNome() + " é: " + IMC);
			
			if(IMC < 17) {
				System.out.println(p.getNome() + " está muito abaixo do peso! Aviso para sua saude, procure um nutricionista.");
			} else if(IMC >= 17 && IMC< 18.5) {
				System.out.println(p.getNome() + " está abaixo peso ideal!");
			} else if(IMC >= 18.5 && IMC< 25) {
				System.out.println(p.getNome() + " está no peso ideal.");
			} else if (IMC >= 25 && IMC < 30) {
				System.out.println(p.getNome() + " está acima do peso ideal!");
			} else if (IMC >=30 && IMC < 35) {
				System.out.println(p.getNome() + " está com Obesidade! Procure um nutricionista.");
			} else if (IMC >=35 && IMC < 40) {
				System.out.println(p.getNome() + " está com Obesidade Severa! Aviso para sua saude, procure um nutricionista.");
			} else {
				System.out.println(p.getNome() + " está com Obesidade Mórbida! Aviso para sua saude, procure um nutricionista.");
			}
		} finally {
			sc.close();
		}
	}
}
