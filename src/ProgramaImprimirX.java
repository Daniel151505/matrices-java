/*
Escribir un programa que imprima una X construida a base de la letra X
en las diagonales de la matriz y utilizar el carácter guion bajo como relleno.
El tamaño de la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.

El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

Por ejemplo para n=5 se obtiene:

X___X
_X_X_
__X__
_X_X_
X___X
Por ejemplo para n=6 se obtiene:

X____X
_X__X_
__XX__
__XX__
_X__X_
X____X
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */

import java.util.Scanner;

public class ProgramaImprimirX {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado ;

        System.out.println("Ingresa el tamaño de la X");
        numeroIngresado = scanner.nextInt();
        
        if(numeroIngresado == 0) {
            System.err.println("Debes poner un tamaño mayor a 0");
            main(args);
            System.exit(0);
        } else {

            for (int i = 0; i < numeroIngresado; i++) {
                for (int j = 0; j < numeroIngresado; j++) {
                    if (i == j || (j == (numeroIngresado - i - 1)) ) {
                        System.out.print("X");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
            
        }
        
    }
}
