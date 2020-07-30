package com.company;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
        if(num%2==0){
            return false;
        }else {
            System.out.println("Error");
            return true;
        }
    }
}
