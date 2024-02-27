import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {

        //Creamos un scanner para solicitar valores por teclado
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("**** Aplicación Calculadora ****");

            //Mostramos el menú
            mostrarMenu();

            //chequeamos que el usuario eligió una opción válida y operamos
            try {

                var operacion = Integer.parseInt(teclado.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, teclado);

                } else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }

                //se imprime un salto (linea vacia) antes de repetir el ciclo
                System.out.println();
            } //fin try
            catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }//fin catch
        } //fin de while
    }//fin de main

    private static void mostrarMenu(){
        // Se puede escribir de dos formas
        //System.out.println("1. Suma \n2. Resta...");
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);

        //El usuario debe elegir entre las opciones disponibles
        System.out.print("Operación a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner teclado){
        //agregamos las variables
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(teclado.nextLine());

        //determinamos el resultado y lo imprimimos
        double resultado;
        switch (operacion) {
            case 1 -> { //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { //Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { //Multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> { //División
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado División: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
            }
            default ->
                    System.out.println("Opción errónea: " + operacion);
        }
    }

}//fin de clase
