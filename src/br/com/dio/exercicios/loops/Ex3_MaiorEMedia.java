package br.com.dio.exercicios.loops;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior = 0;
        double media = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Insíra o número "+ (i+1) + ":");
            numeros[i] =  scan.nextInt();
            if (i == 0)
                maior = numeros[i];
            else if (maior < numeros[i])
                maior = numeros[i];
            media += numeros[i];
        }
        media /= 5;
        System.out.println("O maior entre os números é o " + maior);
        System.out.println("A média dos números é " + media);
        
    }
}
