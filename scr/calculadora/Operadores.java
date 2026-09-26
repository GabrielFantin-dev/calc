package scr.calculadora;

public class Operadores {
   private double num1;
    private double num2;

    private double adição;
    private double subtração;
    private double multiplicação;
    private double divisão;
   
    public  int adição(int num1, int num2) {
		int soma = num1 + num2;
		
		return soma;

    }

    public  int subtração(int num1, int num2){
		int menos = num1 - num2;
		
		return menos;
	}

    public  int multiplicação(int num1,int num2) {
		int vezes = num1 * num2;
		
		return vezes;
	}
    public static double divisão(int num1, int num2) {
		int dividir = num1 / num2;
		return dividir;
	}
}