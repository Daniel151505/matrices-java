/*
Escribir un programa para una matriz de n x n e imprima en ella una silla
(o letra h minúscula) construida a base del numero 1 y utilizar el numero 0 como espacio.
El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a
imprimir en una matriz de n x n.

Por ejemplo para n=5 se obtiene:

10000
10000
11111
10001
10001
Por ejemplo para n=6 se obtiene:

100000
100000
100000
111111
100001
100001
Por ejemplo para n=10 se obtiene:

1000000000
1000000000
1000000000
1000000000
1000000000
1111111111
1000000001
1000000001
1000000001
1000000001
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */

import java.util.Scanner;

public class ProgramaImprimirSilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de la figura");
        int numeroIngresado = scanner.nextInt();

        if (numeroIngresado == 0) {
            System.err.println("Debes poner un tamaño mayor a 0");
            main(args);
            System.exit(0);
        } else {

            for (int i = 0; i < numeroIngresado; i++) {
                for (int j = 0; j < numeroIngresado; j++) {
                    if (i == (numeroIngresado / 2) || j == 0 || j == (numeroIngresado - 1) && i >= numeroIngresado / 2) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }

        }
    }
}
