package Exercicio3;

import java.util.Scanner;
// Programa que vai perguntar sobrenome e nome e informar as letras inicais de ambos
// Autor: Marina Larissa Carpes R�hrig
public class exibeIniciais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ol�! Informe o seu sobrenome, por gentileza: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Agora informe o seu nome, por gentileza: ");
        String nome = scanner.nextLine();

        System.out.printf("Obrigada pelas informa��es, %s %s. A primeira letra do seu nome �: %s, a do seu sobrenome �: %s",nome,sobrenome,nome.substring(0,1),sobrenome.substring(0,1));
    }
}
