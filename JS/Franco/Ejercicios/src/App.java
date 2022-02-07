import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // int n1,n2,suma;
        // n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un
        // numero"));
        // n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca otro
        // numero"));
        // suma = n1+n2;
        // System.out.println("La suma es: "+suma);

        // Al ingresar una edad que sea igual a 15, mostrar el mensaje "niña bonita".

        // int edad;
        // edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca una
        // edad: "));
        // if(edad==15){
        // System.out.println("Niña bonita.");
        // }else{
        // System.out.println("Ingrese una edad correcta.");
        // }

        // 1) Crea un array de 10 posiciones de números con valores pedidos por teclado.
        // Muestra por consola el indice y
        // el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
        // otro para mostrar.

        final int capacidad = 10;
        int lista[] = new int[capacidad];
        for (int i = 0; i < lista.length; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            lista[i] = sc.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }

}