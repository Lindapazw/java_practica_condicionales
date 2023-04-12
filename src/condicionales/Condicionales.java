
package condicionales;


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
    }
    
}
