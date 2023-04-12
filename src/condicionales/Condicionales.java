
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
        
        if(categoria == 1 || categoria == 2 || categoria == 3 ) { 
            System.out.println("El sueldo es " + sueldo);
        }  
        
        // while - De 0 a 10
        int count = 0;
        
        while (count <= 10){
            System.out.println("Estoy en la vuelta " + count);
            count = count + 1;
        }
        
        // for - De 0 a 10
        for (int cont=0; cont<=10; cont++) {
            System.out.println("Estoy dando vueltas con el ciclo for: " + cont);
        }
        
        // Arrays - vectores y matrices
        
        // Vector
        
        // Declaracion 
        int vector [] = new int [4]; // crea 4 cajas de 0 a 3
        
        // Asignacion (manual)
        vector[0]=2;
        vector[1]=35;
        vector[2]=48;
        vector[3]=157;
        
        // Recorrido de un vector - tomando en cuenta la longitud del vector
        for(int i=0; i<vector.length; i++){
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado el numero " + vector[i]);
            System.out.println("--------------------------");
        }
        
        // Vector 2
        
        // Declaracion 
        int vector2 [] = new int [4]; // crea 4 cajas de 0 a 3
        
        // Asignacion (por teclado)
        Scanner usuario = new Scanner (System.in);
            for(int indice=0; indice<vector2.length; indice++){
                System.out.println("Ingrese el valor para el indice " + indice);
                vector2[indice] = teclado.nextInt(); // carga valor por teclado
            }
        
        // Recorrido de un vector - tomando en cuenta la longitud del vector
        for(int indice=0; indice<vector2.length; indice++){
            System.out.println("Estoy en el indice: " + indice);
            System.out.println("Tengo guardado el numero " + vector2[indice]);
            System.out.println("--------------------------");
        }
        
        
        
    }
    
}
