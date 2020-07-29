package com.company;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
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
            if (numero == numeroAdivinar) {
                System.out.println("Acertaste");
                ActualizaRecord();
                seguir=false;
            } else {
                if (QuitaVida()) {
                    if (numero > numeroAdivinar) {
                        System.out.println("El numero es menor");
                    } else {
                        System.out.println("El numero es mayor");
                    }
                    System.out.println("Intentalo de nuevo");
                }else {
                    seguir=false;
                }
            }

        } while (seguir);
    }
}