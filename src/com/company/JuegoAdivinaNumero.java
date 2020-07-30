package com.company;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable {
    private int numeroAdivinar;

    public JuegoAdivinaNumero(int vidas, int numero) {
        super(vidas);
        this.numeroAdivinar = numero;

    }

    @Override
    public void Juega() {
        this.ReiniciarPartida();
        System.out.println("Adivina un numero entre 0 y 10");
        int numero;
        boolean seguir = true;
        do {
            Scanner leer = new Scanner(System.in);
            numero=leer.nextInt();
            leer.nextLine();
            if(ValidaNumero(numero)) {
                if (numero == numeroAdivinar) {
                    System.out.println("Acertaste");
                    ActualizaRecord();
                    seguir = false;
                } else {
                    if (QuitaVida()) {
                        if (numero > numeroAdivinar) {
                            System.out.println("El numero es menor");
                        } else {
                            System.out.println("El numero es mayor");
                        }
                        System.out.println("Intentalo de nuevo");
                    } else {
                        seguir = false;
                    }
                }
            }
        } while (seguir);
    }

    @Override
    public void MuestraNombre() {
        System.out.printf("Juego Adivina Numeró");
    }

    @Override
    public void MuestraInfo() {
        System.out.printf("Tienes que adivinar el numero antes de quedarte sin vidas, solo tienes 3 vidas");
        this.MuestraVidasRestantes();

    }

    public boolean ValidaNumero (int num){
        return true;
    }

}