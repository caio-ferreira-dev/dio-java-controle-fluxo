import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

        // Getting the inputs from terminal.
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            // Calling the method with the count logic.
			count(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            // Printing the exception message.
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
        terminal.close();
	}
	static void count(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // Validating if parametroUm is higher than parametroDois, and if not throwing the exception. 
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		int count = parametroDois - parametroUm;
        // Running the for loop and printing the numbers based on the counting variable.
        for(int i = 1; i <= count ; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
	}
}