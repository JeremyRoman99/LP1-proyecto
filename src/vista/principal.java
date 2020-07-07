/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import utils.leer;

/**
 *
 * @author JEREMY
 */
public class principal {
    
    public static void factorial(){
        System.out.println("***factorial***");
        System.out.print("ingrese numero: ");
         int numero = leer.entero();
         int fac = 1;
         for (int i = 1;i<= numero; i++){
             fac*=i;
         }
         System.out.println(numero + "! = " + fac);
    }
    public static void mayordeedad(){
      System.out.println("***mayor de edad***");
      System.out.println("edad:");
        int edad;
        edad = leer.entero();
      if (edad>=18){
          System.out.println("***mayor de edad***");
      }else{
          System.out.println("***menor de edad***");
      }
    }
    public static void parimpar(){
        System.out.println("*** PAR O IMPAR ***");
        int numero;
        System.out.print("Numero: ");
        numero = leer.entero();
        if (numero%2==1) {
            System.out.println("Impar");
        } else if(numero==0){
            System.out.println("Neutro");
        } else{
            System.out.println("Par");
        }
    }
    public static void primo(){
        System.out.print("Ingrese un número: ");
        int numero, c=0;
        numero = leer.entero();
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                c++;
            }
        }
        if( c==2 ){
            System.out.println("El número "+numero+" es primo");
        }
        else{
            System.out.println("El número "+numero+" no es primo");
        } 
    }
    public static void error(){
     System.out.println("error opcion incorrecta");   
    }
    public static void salir(){
      System.out.println("gracias por visitarnos");  
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 FACTORIAL");
        System.out.println("2 MAYOR DE EDAD");
        System.out.println("3 PAR IMPAR");
        System.out.println("4 PRIMO");
        System.out.println("5 SALIR");
        System.out.println("INGRESE OPCION 1 A 5:");
    }
    public static void inicio(){
       int opcion;
do{
menu();
opcion = leer.entero();
switch(opcion){
case 1: factorial();
break;
case 2: mayordeedad();
break;
case 3: parimpar();
break;
case 4: primo();
break;
case 5: salir();
break;
default:error();
}
    }while(opcion!=5);
 }

    public static void main(String[] args) {
        inicio();
    }
}
