//Codigo foi montado pois quando eu clico no (.) ao invés da (,) o programa para e sai do terminal.
//Dessa forma faço como forma de treino a tratativa de erro try catch e vejo seu funcionanmento na pratica.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        float n1 = 0, n2 = 0;
        boolean entradaValida = false;

        // Entrada do primeiro número
        while (!entradaValida) {
            try {
                System.out.println("Digite um número (use vírgula para decimais): ");
                String entrada = x.nextLine();
                if (entrada.contains(".")) {
                    throw new IllegalArgumentException("Por favor, utilize vírgula (,) em vez de ponto (.) para separar decimais.");
                }
                n1 = Float.parseFloat(entrada.replace(",", ".")); // Converte para float após ajustar a vírgula
                entradaValida = true; // Sai do loop se for válido
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        entradaValida = false; // Resetando para o próximo número

        // Entrada do segundo número
        while (!entradaValida) {
            try {
                System.out.println("Digite outro número (use vírgula para decimais): ");
                String entrada = x.nextLine();
                if (entrada.contains(".")) {
                    throw new IllegalArgumentException("Por favor, utilize vírgula (,) em vez de ponto (.) para separar decimais.");
                }
                n2 = Float.parseFloat(entrada.replace(",", ".")); // Converte para float após ajustar a vírgula
                entradaValida = true; // Sai do loop se for válido
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // Soma e exibição do resultado
        float sum = n1 + n2;
        System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " é igual a " + sum);

        x.close();
    }
}