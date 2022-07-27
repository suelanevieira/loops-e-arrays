package loop;



/*Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade,
        (pare o programa inserindo o valor 0 no campo nome)*/

import java.util.Scanner;

public class NomEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        String endereço;
        int CPF;

        while (true) {
            System.out.println("nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("endereço: ");
            endereço = scan.next();

            System.out.println("CPF: ");
            CPF = scan.nextInt();

        }

        System.out.println("Continue aqui... ");
    }
}
