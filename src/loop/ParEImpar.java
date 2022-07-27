package loop;
/* Faça um programa que peça N inteiros, calcule e mostre
a quantidade de numeros pares e a quantidade de numeros impares.
 */

import java.util.Scanner;

public class ParEImpar  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int quantNumeros;
       int numero;
       int quantPares = 0, quantImpares = 0;

        System.out.println("quantidade de números: ");
        quantNumeros = scan.nextInt();

        int cout = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2==0) quantPares++;
            else quantImpares++;

            cout++;
        } while (cout < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}
