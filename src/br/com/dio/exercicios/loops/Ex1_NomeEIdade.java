package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scan = new Scanner(System.in);

        while(true){
        System.out.println("Name: ");
        name = scan.next();
        if (name.equals("0")) 
            break;

        System.out.println("Age: ");
        age = scan.nextInt();
        }

        System.out.println("Terminando execução");
    }
}

