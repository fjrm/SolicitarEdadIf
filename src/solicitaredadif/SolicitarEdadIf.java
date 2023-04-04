package solicitaredadif;

import java.util.Scanner;

public class SolicitarEdadIf {

    public static void main(String[] args) {
        //Lee la entrada del usuario y lo almacena en la variable consola
        //instanciar la clase con el '= new ...' 
        Scanner consola = new Scanner(System.in); 
        
        int edad;

        System.out.println("Introduzca su edad (entre 0 y 120)");
        edad = consola.nextInt();        
        
        if(edad >= 0 && edad <= 120){
             System.out.println("El valor está dentro del rango admitido. Su edad: " + edad + " años.");
        }else{
            System.out.println("El valor introducido NO está dentro del rango admitido");
        }
    }
    
}
