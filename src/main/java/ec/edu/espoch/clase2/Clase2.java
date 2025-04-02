package ec.edu.espoch.clase2;

public class Clase2 {

    public static void main(String[] args) {
        
        int multiplicador=1;
        int i=0;
        while (multiplicador<=20) { 
            i +=multiplicador;
           
            System.out.println(multiplicador+" X "+ i+" ="+(i*i));
            i++;
            
        }
    }
}
