package com.company;

public class Aplicacion {//antes era main (se cambio el nombre)

    public static void main(String[] args) {
	// write your code here
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(5,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3,5);
        juego.Juega();
        juego2.Juega();
        juego3.Juega();

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




