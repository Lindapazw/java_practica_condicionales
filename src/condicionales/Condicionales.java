
package condicionales;

import java.util.Scanner;


public class Condicionales {

    public static void main(String[] args) {
        
        // if 
        int num1 = 5;
        int num2 = 1;
        
        if( num2 < num1){
            System.out.println("El numero 2 es mayor al numero 1");
        }
        
        // if + else
        int num3 = 1;
        int num4 = 10;
        
        if( num3 > num4) {
            System.out.println("El numero 3 es mayor al numero 4 ");
        }
        else {
            System.out.println("El numero 4 es mayor");
        }
        
        // condicionales anidados 
        int num5 = 10;
        int num6 = 11;
        
        
        if(num5 > num6){
            System.out.println("El numero 10 es mayor que 11");
        }
        else {
            if(num5 == num6){
                System.out.println("Los numeros son iguales");
            }
            else{
                System.out.println("El numero 11 es mayor al numero 10");
            }
        }
        
        // switch - multiples sentencias a partir de una condicion
        // ¿Cual es el dia elegido?
        int dia = 2;
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia="Lunes";
            break;
            case 2: nombreDia="Martes";
            break;
            case 3: nombreDia="Miercoles";
            break;
            case 4: nombreDia ="Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sabado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia ="Numero de dia invalido";
            break;
        }
        System.out.println("El dia de la semana elegido es: " + nombreDia);
        
        // Ejercicio de condicionales
        // Calcular el sueldo
        double sueldo = 0;
        int categoria;
        
        System.out.println("Ingrese el tipo de categoria que desea calcular: ");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if(categoria == 1) {
            sueldo = 15890 + (15890*0.10);
        } 
        else {
            if(categoria == 2) {
                sueldo = 25630.89;
            }
            else {
                if(categoria == 3 ){
                    sueldo = 35560.20 - (35560.20*0.11);
                }
                else {
                    System.out.println("Debe ingresar un numero valido");
                }
            }
        }
        
        if(categoria == 1 || categoria == 2 || categoria ==3 ) { 
            System.out.println("El sueldo es " + sueldo);
        }  
        
    }
    
}
