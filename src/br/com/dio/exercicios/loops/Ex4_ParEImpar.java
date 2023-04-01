package br.com.dio.exercicios.loops;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;
    int numero, pares = 0, impares = 0;
    
    System.out.println("Quantos números deseja verificar?");
    n = scan.nextInt();

    for (int i = 0; i < n; i++)
    {
        System.out.println("Digite o numero "+ (i+1) +":");
        numero = scan.nextInt();

        if (numero % 2 == 0)
            pares++;
        else
            impares++;
    }

    System.out.println("Há " + pares + " números pares.");
    System.out.println("Há " + impares + " números impares.");
    }
}
