
/**
 * Write a description of class SUMA_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SUMA_2
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        String numero = "";

        System.out.print("\n ingrese dos numeros serparados por un espacio \n ");
        numero = entrada.nextLine();
        String[] datos = numero.split(" ");
        for (int i = 0; i < datos.length; i++) {
            suma = suma + Integer.valueOf(datos[i]);
        }
        System.out.print("La suma de los dos numeros es: " + suma + " \n");
    }
}
