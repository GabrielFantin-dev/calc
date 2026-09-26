package scr.calculadora;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
		
		Operadores op = new Operadores();
		Scanner entrada = new Scanner(System.in);
		boolean rodando = true;
		
		while(rodando) {

		System.out.println("========================");	
		System.out.println("Qual o primeiro numero?");
		System.out.println("========================");	
		int num1 = entrada.nextInt();
		
		System.out.println("========================");	
		System.out.println("Qual o segundo numero?");
		System.out.println("========================");	
		int num2 = entrada.nextInt();
		
		System.out.println("==================");	
		System.out.println("Qual operador?");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		int operacao = entrada.nextInt();
		
		if (operacao == 1) {
			int resultado = op.adição(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}else if(operacao == 2) {
			int resultado = op.subtração(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}else if (operacao == 3) {
			int resultado = op.multiplicação(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}else if (operacao == 4) {
			double resultado = op.divisão(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}
			System.out.println("Deseja continuar? (s/n): ");
			char s = entrada.next().charAt(0);
			
			if ( s == 'S') {
				
			}else {
				System.out.println("A calculadora foi encerrada");
				rodando = false;
        }
		}
	}

	}

