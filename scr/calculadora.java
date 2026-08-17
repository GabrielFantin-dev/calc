package calc;

import java.util.Scanner;

public class calculadora {

	public static int adição(int num1, int num2) {
		int soma = num1 + num2;
		
		return soma;
	
	}
	
	public static int subtração(int num1, int num2){
		int menos = num1 - num2;
		
		return menos;
	}
	
	public static int multiplicação(int num1,int num2) {
		int vezes = num1 * num2;
		
		return vezes;
	}
	
	public static double divisão(int num1, int num2) {
		int dividir = num1 / num2;
		return dividir;
	}
	
	public static void main(String[] args) {
		
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
		System.out.println("==================");	
		Sysem.out.println("Opção invalida!");
		int operacao = entrada.nextInt();
		
		if (operacao == 1) {
			int resultado = adição(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}else if(operacao == 2) {
			int resultado = subtração(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}else if (operacao == 3) {
			int resultado = multiplicação(num1, num2);
			System.out.println("Resultado: " + resultado);
			
		}else if (operacao == 4) {
			double resultado = divisão(num1, num2);
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





