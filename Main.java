package Atividade7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor de um lado do quadrado");
        double lado = sc.nextDouble();
        
        double area = lado * lado;
        double dobro = area * 2;
        
        System.out.println("O lado do quadrado é: " + lado);
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área é: " + dobro);

        sc.close();

    } 

}
