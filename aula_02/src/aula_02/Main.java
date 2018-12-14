package aula_02;

import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		
		*String nome = in.nextLine();
		
		*System.out.println("Meu nome é : "+nome);
		
		*System.out.println("Digite sua idade");
		*int idade = in.nextInt();
		*Date data = new Date(System.currentTimeMillis());;
		
		*int var_final = (data.getYear() - idade);
		
		*System.out.println("Ano de nascimento é : " + var_final);
		*/
		/*
		 * Inicio de um programa com condições
		 */
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem-vindo ao jogo!");
		System.out.println("Insira seu nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem vindo "+nome);
		System.out.println("Você deseja avançar para qual direção?(w,s,a,d)");
		String comando = in.nextLine();
		
		if(comando.equals("w")){
			System.out.println("Você está indo para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer?(a,c)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Você venceu!");
				}else {
					System.out.println("Você perdeu!");
				}
			}else {
				System.out.println("Você correu! O jogo acabou!");
			}
			
		}else if(comando.equals("s")) {
			System.out.println("Você foi para outro mapa!");
		}else if(comando.equals("a") || comando.equals("d")) {
			System.out.println("Você desviou de um inimigo");
			System.out.println("Você caiu do penhasco :( ");
			System.out.println("Você perdeu!");
		}
			
		
		
		
		
		
	}
	
	
}
