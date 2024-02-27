package numeroslimite;

import java.util.Scanner;

public class NumerosLimite {

   public static void main(String[] args) {
       
       //tenemos un limite hasta el que tenemos que contar
       //ingrese ese limite
       System.out.println("Ingrese el límite hasta el que quiere contar");
       Scanner teclado = new Scanner (System.in);
       int limite = teclado.nextInt();
       int cont = 0;
       
       while(cont <= limite){
           System.out.println(cont);
           //cont = cont + 1;
           //cont += 1;
           cont ++;
       }
       
    }
    
}
