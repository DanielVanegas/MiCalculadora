package Calculadora;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        //Crear objeto clase *calculadora*

        Calculadora miCalculadora;  //Definicion objeto
        miCalculadora = new Calculadora(); //Contruccion objeto

        //Forma de crear un objeto de la clase escanner
        Scanner miEscaner;
        miEscaner = new Scanner(System.in);
        
        Scanner miEscaner2;
        miEscaner2 = new Scanner(System.in);

        int entrada;
        String operac;
        
        operac = miEscaner2.nextLine();

        entrada = miEscaner.nextInt();
        miCalculadora.setX(entrada);

        entrada = miEscaner.nextInt();
        miCalculadora.setY(entrada);
        
        miCalculadora.sumar();
        
        System.out.println(miCalculadora.getR());

        CalculadoraTrigonometrica miTrigo=new CalculadoraTrigonometrica();
    }

}
