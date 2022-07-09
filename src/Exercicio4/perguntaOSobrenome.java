package Exercicio4;

import java.util.Scanner;
// O programa vai perguntar o �ltimo sobrenome do usu�rio e exibir ele em mai�sculas e informar o n�mero de letras
// Autor: Marina Larissa Carpes R�hrig

public class perguntaOSobrenome {
    public static void main(String[] args) {

        // Declara��o e inicializa��o do scanner
        Scanner scanner = new Scanner(System.in);
        // Intera��o com o usu�rio e inicializa��o das vari�veis e transforma em mai�scula caso n�o esteja
        System.out.println("Ol�! Informe o seu sobrenome, por gentileza: ");
        // Aqui pega a pr�xima linha digitada pelo usu�rio e guarda em mai�sculas, o trim tira os espa�os em branco.
        String sobrenome = scanner.nextLine().toUpperCase().trim();
        int quantidadeLetrasSemEspaco = sobrenome.replace(" ", "").length();
        //Informa o resultado para o usu�rio
        System.out.printf("Obrigada pela informa��o, seu sobrenome: %s, cont�m %d letras. %n",sobrenome,quantidadeLetrasSemEspaco);

    }
}
