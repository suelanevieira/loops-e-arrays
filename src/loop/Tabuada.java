package loop;
/*
Desevolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
o usuario deve informar de qual numero ele deseja  ver a tabuada.
A saida deve ser conforme o exemplo abaixo:
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
