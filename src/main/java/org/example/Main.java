package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int distanciaTotal;
        int consumoCombustible;
        int precioCombustible;
        double combustibleNecesario;
        double costoTotal;

        Scanner keyboard=new Scanner(System.in);

        System.out.println("*****CalcuFast*****");
        System.out.println("*****Bienvenido*****");
        System.out.println("Digita la distancia total del viaje: ");
        distanciaTotal=keyboard.nextInt();
        System.out.println("Digita el consumo de combustible de tu auto: ");
        consumoCombustible=keyboard.nextInt();
        System.out.println("Digita el precio del combustible");
        precioCombustible=keyboard.nextInt();

        combustibleNecesario = (consumoCombustible * distanciaTotal/100);

        costoTotal = (combustibleNecesario * precioCombustible);

        System.out.println("El consumo total de combustible es: "+combustibleNecesario+" litros" );
        System.out.println("El costo total del combustible necesario es: "+costoTotal+"$");
        System.out.println("Gracias por usar nuestro sistema");




    }
}