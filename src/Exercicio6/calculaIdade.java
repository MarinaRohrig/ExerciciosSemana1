package Exercicio6;
// O programa vai perguntar o nome, o ano de nascimento e ano atual e informar a idade do usu�rio
// Autor: Marina Larissa Carpes R�hrig

import java.util.Scanner;

public class calculaIdade {
    public static void main(String[] args) {
        // Declara��o e inicializa��o do scanner
        Scanner scanner = new Scanner(System.in);

        // Intera��o com o usu�rio e inicializa��o das vari�veis
        System.out.println("Ol�! Qual o seu nome?");
        String nome = scanner.nextLine();
        // Aqui vai aceitar APENAS INT, se digitar outra coisa vai dar erro, sem tratamento.
        System.out.printf("%s, em qual ano voc� nasceu?%n",nome);
        int anoDeNascimento = scanner.nextInt();
        System.out.printf("%s, em qual ano estamos?%n",nome);
        int anoAtual = scanner.nextInt();

        System.out.printf("%s, a sua idade � %d anos, caso j� tenha feito anivers�rio esse ano e %d anos, caso ainda n�o tenha feito.",nome,anoAtual-anoDeNascimento,anoAtual-anoDeNascimento-1);
    }
}
