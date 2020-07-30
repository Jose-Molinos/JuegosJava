package com.company;

import com.company.interfaces.Jugable;
import com.company.numeros.JuegoAdivinaImpar;
import com.company.numeros.JuegoAdivinaPar;

import java.util.Scanner;

public class Aplicacion {//antes era main (se cambio el nombre)

    public static void main(String[] args) {
	// write your code here
        Scanner leer=new Scanner(System.in);
        String seguir;
        do {
            Jugable juego = EligeJuego();
            juego.MuestraNombre();
            juego.MuestraInfo();
            juego.Juega();
            System.out.println("Seguir jugando s/n \n");
            seguir=leer.nextLine();
        }while (seguir.equals("s"));

      /*  JuegoAdivinaNumero juego=new JuegoAdivinaNumero(5,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3,5);
        juego.MuestraNombre();
        juego.MuestraInfo();
        juego.Juega();
        juego2.MuestraNombre();
        juego2.MuestraInfo();
        juego2.Juega();
        juego3.MuestraNombre();
        juego3.MuestraInfo();
        juego3.Juega();*/

    }

    public static Jugable EligeJuego(){
        JuegoAdivinaNumero juego1=new JuegoAdivinaNumero(5,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3,5);
        Jugable [] juegos=new Jugable[3];
        juegos[0]=juego1;
        juegos[1]=juego2;
        juegos[2]=juego3;
        Scanner leer=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Selecciona un Juego\n" +
                    "0. Juego Adivina un numero\n" +
                    "1. Juego Adivina un numero Par\n" +
                    "2. Juego Adivina un numero Impar\n");
            opcion=leer.nextInt();
            leer.nextLine();
        }while(!(opcion<=2 & opcion>=0));
        return juegos[opcion];
    }
}


       /* Juego juego1=new Juego(5);
        juego1.ActualizaRecord();
        Juego juego2=new Juego(5);
        juego1.QuitaVida();
        juego2.ActualizaRecord();
        juego1.MuestraVidasRestantes();
        juego1.ReiniciarPartida();
        juego1.MuestraVidasRestantes();
        juego1.ActualizaRecord();*/


// Este era el main dentro de la clase juego
        /*Juego juego1=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego1.vidas--;
        Juego juego2=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego2.MuestraVidasRestantes();
    }*/




