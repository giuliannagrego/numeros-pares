package app;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//      Faça um programa que leia N números inteiros e armazene-os em um vetor.
//      Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.

        int num, quantPares;

        System.out.print("Quantos números você vai digitar? ");
        num = sc.nextInt();

        int[] vet = new int[num];

        System.out.println();
        System.out.println("Digite em números inteiros: ");

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Dentre esses números, são pares os números: ");

        quantPares = 0;

        for (int j : vet) {
            if ((j % 2) == 0) {
                System.out.printf("%d ", j);
                quantPares++;
            }
        }

        System.out.println();
        System.out.println("Quantidade total de pares: " + quantPares);

        sc. close();
    }
}
