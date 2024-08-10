import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		try {
            System.out.println("\nDigite o primeiro número:");
            int primeiroNumero = scanner.nextInt();
            
            System.out.println("\nDigite o segundo número:");
            int segundoNumero = scanner.nextInt();
		
			contar(primeiroNumero, segundoNumero);
            System.out.println("\nContagem encerrada!\n");
		} catch (ParametrosInvalidosException exception) {
			System.err.println("\nO segundo número deve ser maior que o primeiro.");
        } catch(InputMismatchException exception) {
            System.err.println("\nDigite apenas um número inteiro em algarismo numérico.");
		} finally {
            System.out.println("\nPor favor, execute o programa novamente!");
        }
		
        scanner.close();
	}

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (segundoNumero < primeiroNumero) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("\nIniciando a contagem:\n");
        
        int contagem = segundoNumero - primeiroNumero;
        
        for (int numero = 0; numero < contagem; numero++) {
            System.out.println("Imprimindo o número " + numero);
        }
    }
}
