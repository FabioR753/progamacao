package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numero;
        double dobro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero");
        numero = sc.nextDouble();
        dobro = numero * 2;
        System.out.println("O dobro do numero é igual a" + dobro);


    }
}
