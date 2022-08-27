/*Diseña una función que calcule el sumatorio de la diferencia entre números contiguos en una lista.
Por ejemplo, para la lista [1, 3, 6, 10] devolverá 9, que es 2+3+4
(el 2 resulta de calcular 3 − 1, el 3 de calcular 6 − 3 y el 4 de calcular 10 − 6).*/

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alcides Sainz
 */
public class Main {
    public static int DifSumList(){
        ArrayList<Integer>numList = new ArrayList<>();
        ArrayList<Integer>difList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int  sum = 0;
        System.out.println("Ingrese el numero de elementos que va a tener la lista: ");
        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Ingrese un valor a la lista: ");
            int save = sc.nextInt();
            numList.add(save);

        }
        for (int i = 0; i < numList.size()-1; i++) {
            difList.add(numList.get(i+1) - numList.get(i));

        }
        System.out.println("La diferencia de los numeros contigos de la lista es: " + difList);
        for (int i = 0; i < difList.size(); i++) {
            sum+= difList.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("La suma de la diferencia de los numeros contiguos de la lista es: "+ DifSumList());


    }
}
