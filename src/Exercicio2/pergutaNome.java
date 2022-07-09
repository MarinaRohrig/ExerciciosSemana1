package Exercicio2;

import java.util.Scanner;

// Programa que vai perguntar o nome do usuario e informar a quantidade de letras que tem no nome dele
// Autor: Marina Larissa Carpes Röhrig

public class pergutaNome {
    public static void main(String[] args) {
        // Declara e inicia variável para pegar informação digitada pelo usuário
        Scanner scanner = new Scanner(System.in);
        // Pega as informações e usa .lenght para verificar o espaço 0 da string, a primeira letra
        System.out.println("Olá! Informe o seu nome, por gentileza: ");
        String nome = scanner.nextLine();
        int quantidadeLetras = nome.length();
        System.out.printf("Olá,%s, tudo bem com você?%nO seu nome possuí %d letras contabilizando os espaços em branco. %n",nome,quantidadeLetras);
        int quantidadeLetrasSemEspaco = nome.replace(" ", "").length(); // tira os espaços, se houverem
        System.out.printf("E possuí %d letras sem contar os espaços em branco. %n",quantidadeLetrasSemEspaco);
    }
}
