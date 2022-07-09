package Exercicio6;
// O programa vai perguntar o nome, o ano de nascimento e ano atual e informar a idade do usuário
// Autor: Marina Larissa Carpes Röhrig

import java.util.Scanner;

public class calculaIdade {
    public static void main(String[] args) {
        // Declaração e inicialização do scanner
        Scanner scanner = new Scanner(System.in);

        // Interação com o usuário e inicialização das variáveis
        System.out.println("Olá! Qual o seu nome?");
        String nome = scanner.nextLine();
        // Aqui vai aceitar APENAS INT, se digitar outra coisa vai dar erro, sem tratamento.
        System.out.printf("%s, em qual ano você nasceu?%n",nome);
        int anoDeNascimento = scanner.nextInt();
        System.out.printf("%s, em qual ano estamos?%n",nome);
        int anoAtual = scanner.nextInt();

        System.out.printf("%s, a sua idade é %d anos, caso já tenha feito aniversário esse ano e %d anos, caso ainda não tenha feito.",nome,anoAtual-anoDeNascimento,anoAtual-anoDeNascimento-1);
    }
}
