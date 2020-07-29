package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Juego juego1=new Juego(5);
        juego1.ActualizaRecord();
        Juego juego2=new Juego(5);
        juego1.QuitaVida();
        juego2.ActualizaRecord();
        juego1.MuestraVidasRestantes();
        juego1.ReiniciarPartida();
        juego1.MuestraVidasRestantes();
        juego1.ActualizaRecord();



        /*Juego juego1=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego1.vidas--;
        Juego juego2=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego2.MuestraVidasRestantes();
    }*/

        }
    }


