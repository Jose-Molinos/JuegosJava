package com.company.numeros;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
        if(num%2==0){
            return true;
        }else {
            System.out.println("Error");
            return false;
        }
    }
    public void MuestraNombre(){
        System.out.printf("Juego adivina numero par ");
    }
    public void MuestraInfo() {
        System.out.printf("Tienes que adivinar el numero antes de quedarte sin vidas, solo tienes 3 vidas");
        this.MuestraVidasRestantes();
}}
