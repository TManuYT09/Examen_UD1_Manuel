package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        int num=0;
        boolean comp = true;//Declaro las varialbles

        while(comp){
            try{
                System.out.println("Introduce un número...");
                num = entrada.nextInt(); //Pido que meta un numero
                comp = false; //Condicion para romper el bucle
            }catch(InputMismatchException err){ //Si mete algo que no es numero salta a esta parte
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }
        if (num < 0){ //Si el numero es negativo lo convierte en positivo
            num = num*(-1);
        }
        System.out.println("El valor absoluto es "+num); //Dice el valor absolute del numero introducido
    }
    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        float anchpar=0;
        float larpar=0;
        float anchazu=0;
        float larazu=0;
        boolean comp = true;

        System.out.println("Introduce tu nombre:"); //Pido el nombre del usuario
        String nombre = entrada.next();
        System.out.println("La obra de "+nombre);
        while (comp){
            try{
                System.out.println("Introduce el ancho de la pared..."); //Empiezo a pedir 4 numeros
                anchpar = entrada.nextInt();
                System.out.println("Introduce el largo de la pared...");
                larpar = entrada.nextInt();
                System.out.println("Introduce el ancho del azulejo...");
                anchazu = entrada.nextInt();
                System.out.println("Introduce el largo del azulejo...");
                larazu = entrada.nextInt();
                comp=false;
            }catch (InputMismatchException err){
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }

        if(anchpar==0 || larpar==0 || anchazu==0 || larazu==0){
            System.out.println("No se puede calcular con uno de los numeros introducidos si es igual a 0");
        }else{
            if (anchazu!=larazu){ //Si el ancho y largo del azulejo son iguales se corta el programa
                if (anchazu < anchpar || larazu < larpar){ //Si el azulejo es mas grande que la pared se corta el programa
                    float resul = (anchpar*larpar)/(anchazu*larazu);
                    System.out.println("Se necesitan "+resul+" azulejos."); //Se muestran cuantos azulejos se necesitan para rellenar la pared
                }else{
                    System.out.println("El azulejo no puede ser más grande que la pared");
                }
            }else{
                System.out.println("El azulejo no puede ser cuadrado.");
            }
        }


    }
}
