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

        Trigonometrica miTrigo;
        miTrigo = new Trigonometrica();

        System.out.println("Para sumar escriba 1.");
        System.out.println("Para restar escriba 2.");
        System.out.println("Para sacar coseno escriba 3.");

        int entrada;
        entrada = miEscaner.nextInt();

        switch (entrada) {

            case 1: {
                
                System.out.println("Ingrese primer digito.");
                entrada = miEscaner.nextInt();
                miCalculadora.setX(entrada);
                System.out.println("Ingrese segundo digito.");
                entrada = miEscaner.nextInt();
                miCalculadora.setY(entrada);
                miCalculadora.sumar();
                System.out.println(miCalculadora.getR());

            }

            case 2: {

                System.out.println("Ingrese primer digito.");
                entrada = miEscaner.nextInt();
                miCalculadora.setX(entrada);
                System.out.println("Ingrese segundo digito.");
                entrada = miEscaner.nextInt();
                miCalculadora.setY(entrada);

                miCalculadora.restar();

                System.out.println(miCalculadora.getR());

            }

            case 3: {

                System.out.println("Ingrese la cantidad.");
                entrada = miEscaner.nextInt();
                miTrigo.setX(entrada);

                System.out.println(miTrigo.coseno());

            }
            
            
        }
    }
}
