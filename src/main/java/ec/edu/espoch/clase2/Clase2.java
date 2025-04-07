package ec.edu.espoch.clase2;

import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        System.out.println("Escoja una opcion");
        System.out.println("1.Suma");
        System.out.println("2.resta");
        System.out.println("3.Multiplicacion");
        int opcion = e.nextInt();
        int a;
        int b;
        int suma;
        int multiplicacion;
        switch (opcion) {
            case 1:

                System.out.println("Ingrese el primer numero");
                a= e.nextInt();
                
                System.out.println("Ingrese el segundo numero");
                b= e.nextInt();
                suma= a + b;
                System.out.println("La suma es: " +suma);
            case 2:
                System.out.println("Ingrese el primer numero");
                a= e.nextInt();
                
                System.out.println("Ingrese el segundo numero");
                b= e.nextInt();
                int resta= a - b;
                System.out.println("El resultado es "+resta);
                break;
            case 3:
                System.out.println("Ingrese el primer numero");
                a= e.nextInt();
                
                System.out.println("Ingrese el segundo numero");
                b= e.nextInt();
                multiplicacion= a * b;
                System.out.println("El resultado es "+multiplicacion);
                break;
            default:
                System.out.println("Opcion incorrecta");;
        }

        
            }
}
