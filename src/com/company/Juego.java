package com.company;

public class Juego {
    public int vidas;

    public Juego(int vidas){
        this.vidas=vidas;
    }
    public void MuestraVidasRestantes(){
        System.out.println("Numero de vidas restantes:"+vidas);
    }

    public static void main(String[] args) {
        Juego juego1=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego1.vidas--;
        Juego juego2=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego2.MuestraVidasRestantes();
    }

}

