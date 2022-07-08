package Exercicio2;

import java.util.Scanner;

// Programa que vai perguntar o nome do usuario e informar a quantidade de letras possuí o nome dele
// Autor: Marina Larissa Carpes Röhrig

public class pergutaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Informe o seu nome, por gentileza: ");
        String nome = scanner.nextLine();
        int quantidadeLetras = nome.length();
        System.out.printf("Olá,%s, tudo bem com você? O seu nome possuí %d letras contabilizando os espaços em branco. %n",nome,quantidadeLetras);
        int quantidadeLetrasSemEspaco = nome.replace(" ", "").length(); // tira os espaços, se houverem
        System.out.printf("E possuí %d letras sem contar os espaços em branco. %n",quantidadeLetrasSemEspaco);
    }
}
