/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

/**
 *
 * @author JEREMY
 */
public class Prog008 {
    public static void saludo(String nombre){       
        System.out.println("bienvenido" + nombre);
        System.out.println("disfruta tu estadia en este lugar");              
        }
     public static void saludo2(String nombre,String carrera){
        System.out.println("disfruta tu estadia en la carrera de" + carrera);              
        }
     public static void factorial(int num){        
        int fac = 1;
        for(int i=1; i<= num; i++){
            fac*=i;
        }
        System.out.print("factorial de:" +num + " es" +fac);
        }
     public static void main(String[] args){
        saludo("daniel");
        saludo2("juan","ing.sistemas");
        factorial(5);
        }
    
}
