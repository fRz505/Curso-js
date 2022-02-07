import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    // 2) Crea un array de números donde le indicamos por teclado el tamaño del
    // array, rellenaremos el array con números aleatorios entre 0 y 9, al final
    // muestra por pantalla el valor de cada posición y la suma de todos los valores
    public static void main(String[] args) {
        String pedir = JOptionPane.showInputDialog("Introduce un tamaño: ");
        int num[] = new int[Integer.parseInt(pedir)];
        numAleatorio(num, 0, 9);
        mostrarArreglo(num);
    }

    public static void numAleatorio(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArreglo(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }

        // 3) Crea un array de números de un tamaño pasado por teclado, por último nos
        // indica cual es el mayor de todos.
        // String pedir = JOptionPane.showInputDialog("Introduzca un tamaño: ");
        // int num[] = new int[Integer.parseInt(pedir)];

    }
}