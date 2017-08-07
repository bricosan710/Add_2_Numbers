
/**
 * Write a description of class SUMA_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SUMA_2
{
     public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);
    int suma = 0;
    int numero = 0;
    String linea = "1 2";
    String[] arre=linea.split("\\s+");

   for (int a=0;a<arre.length;a++){
        System.out.println("Ingrese dos numeros "+arre[a]);
        numero=entrada.nextInt ();
        suma = suma + numero;
    } 
    
    System.out.print ("La suma de los dos numeros es: " + suma);
    }
}
