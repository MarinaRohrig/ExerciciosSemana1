package Exercicio4;

import java.util.Scanner;
// O programa vai perguntar o último sobrenome do usuário e exibir ele em maiúsculas e informar o número de letras
// Autor: Marina Larissa Carpes Röhrig

public class perguntaOSobrenome {
    public static void main(String[] args) {

        // Declaração e inicialização do scanner
        Scanner scanner = new Scanner(System.in);
        // Interação com o usuário e inicialização das variáveis e transforma em maiúscula caso não esteja
        System.out.println("Olá! Informe o seu sobrenome, por gentileza: ");
        // Aqui pega a próxima linha digitada pelo usuário e guarda em maiúsculas, o trim tira os espaços em branco.
        String sobrenome = scanner.nextLine().toUpperCase().trim();
        int quantidadeLetrasSemEspaco = sobrenome.replace(" ", "").length();
        //Informa o resultado para o usuário
        System.out.printf("Obrigada pela informação, seu sobrenome: %s, contém %d letras. %n",sobrenome,quantidadeLetrasSemEspaco);

    }
}
