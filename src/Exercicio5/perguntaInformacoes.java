package Exercicio5;

import java.util.Scanner;

// O programa vai perguntar o nome, a idade e se pratica algum esporte
// Autor: Marina Larissa Carpes R�hrig

public class perguntaInformacoes {
    public static void main(String[] args) {
        // Declara��o e inicializa��o do scanner
        Scanner scanner = new Scanner(System.in);

        // Intera��o com o usu�rio e inicializa��o das vari�veis
        System.out.println("Ol�! Informe o seu nome, por gentileza:");
        String nome = scanner.nextLine();

        System.out.printf("Qual a sua idade, %s? %n",nome);
        int idade = scanner.nextInt();

        // Aqui n�o fiz controle de entrada para o boolean, bem limitado :/ se n�o digitar true ou false, vai dar erro.
        System.out.printf("Voc� pratica algum esporte, %s? Por favor responda com TRUE para sim e FALSE para n�o. %n",nome);
        boolean praticaEsporte = scanner.nextBoolean();

        if (praticaEsporte == true) {
            System.out.printf("%s tem %d de idade e pratica esportes!", nome, idade);
        } else {
                System.out.printf("%s tem %d de idade e n�o pratica esportes!  :( %n",nome,idade);
            }
    }
}
