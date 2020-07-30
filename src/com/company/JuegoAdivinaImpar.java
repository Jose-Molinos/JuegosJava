package com.company;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
        if(num%2==0){
            System.out.println("Error");
            return false;
        }else {

            return true;
        }
    }
    public void MuestraNombre(){
        System.out.printf("Juego adivina numero impar ");
}
    public void MuestraInfo() {
        System.out.printf("Tienes que adivinar el numero antes de quedarte sin vidas, solo tienes 3 vidas");
        this.MuestraVidasRestantes();
    }}