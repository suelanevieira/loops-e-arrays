package loop;
/*
Faça um programa que leia 5 nimeros e informe o maior número e a medica desses números.
 */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;

        int cout = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            cout = cout + 1;
        } while(cout < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
