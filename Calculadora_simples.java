/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vxvitevilcorp.calculadora_simples;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class Calculadora_simples {

    public static void main(String[] args) {
        // Cria um scanner para avaliar as entradas do teclado.
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis
        float n1 = 0, n2 = 0;
        boolean entradaValida = false;

        // Entrada do primeiro número:
        while (!entradaValida) {
            try {
                System.out.println("Use vírgula para decimais! ");
                System.out.println("Digite um número: ");
                String entrada = input.nextLine();
                if (entrada.contains(".")) {
                    throw new IllegalArgumentException("Por favor, utilize vírgula (,) em vez de ponto (.) para separar decimais.");
                }
                n1 = Float.parseFloat(entrada.replace(",", ".")); // Converte para float após ajustar a vírgula
                entradaValida = true; // Sai do loop se for válido
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número válido.");
            } catch (Exception e) {
                System.out.println("Erro " + e.getMessage());
            }
        }

        entradaValida = false; // Resetando para o próximo número

        // Entrada do segundo número
        while (!entradaValida) {
            try {
                System.out.println("Use vírgula para decimais! ");
                System.out.println("Digite um número:");
                String entrada = input.nextLine();
                if (entrada.contains(".")) {
                    throw new IllegalArgumentException("Por favor, utilize vírgula (,) em vez de ponto (.) para separar decimais.");
                }
                n2 = Float.parseFloat(entrada.replace(",", "."));
                entradaValida = true; // Sai do loop se for válido
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número válido.");
            } catch (Exception e) {
                System.out.println("Erro " + e.getMessage());
            }
        }

        // Exibe o menu de operações
        System.out.println("Escolha a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Digite o número da operação: ");
        int operacao = input.nextInt();

        float resultado = 0;

        // Realiza a operação escolhida
        switch (operacao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
    
}
