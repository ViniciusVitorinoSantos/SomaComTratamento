/*O codigo foi desenvolvido pois quando faço somas simples com java e coloco o ponto
o codigo quebra e sai do terminal.*/
package com.vxvitevilcorp.tstscanner;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class TstScanner {

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
