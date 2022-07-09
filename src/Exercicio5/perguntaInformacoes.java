package Exercicio5;

import java.util.Scanner;

// O programa vai perguntar o nome, a idade e se pratica algum esporte
// Autor: Marina Larissa Carpes Röhrig

public class perguntaInformacoes {
    public static void main(String[] args) {
        // Declaração e inicialização do scanner
        Scanner scanner = new Scanner(System.in);

        // Interação com o usuário e inicialização das variáveis
        System.out.println("Olá! Informe o seu nome, por gentileza:");
        String nome = scanner.nextLine();

        System.out.printf("Qual a sua idade, %s? %n",nome);
        int idade = scanner.nextInt();

        // Aqui não fiz controle de entrada para o boolean, bem limitado :/ se não digitar true ou false, vai dar erro.
        System.out.printf("Você pratica algum esporte, %s? Por favor responda com TRUE para sim e FALSE para não. %n",nome);
        boolean praticaEsporte = scanner.nextBoolean();

        if (praticaEsporte == true) {
            System.out.printf("%s tem %d de idade e pratica esportes!", nome, idade);
        } else {
                System.out.printf("%s tem %d de idade e não pratica esportes!  :( %n",nome,idade);
            }
    }
}
