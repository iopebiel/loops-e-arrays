package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Insira a nota:");
            nota = scan.nextInt();
            if(nota <= 10 && nota >= 0)
                break;
            
            System.out.println("Nota inválida!");
        }

        System.out.println("Nota cadastrada com sucesso!");
    
    }
}
