package Arrays;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Main {

    public static int [] num1={1,4,8,12,45,0,7,32,62,78,18};

    public static void main(String[] args) {

        //Imprimo el array de enteros
        System.out.println(Arrays.toString(num1));

        //inicializamos la tabla a 5

        //forma1
        Arrays.fill(num1,0,4,5);
        System.out.println("\nIncializo mi tabla a valor 5 desde las posiciones 1 a la 4");
        System.out.println(Arrays.toString(num1));
        System.out.println("");

        //forma2
        Arrays.fill(num1,5);
        System.out.println("Incializo mi tabla a valor 5 en todas las posiciones");
        System.out.println(Arrays.toString(num1));
        System.out.println("");

        //comparo dos tablas con equals
        int[] num2 = {1,4,8,12,45,0,7,32,62,78,18};
        System.out.println("La tabla 2 es:  "+Arrays.toString(num2));
        System.out.println("¿Las tablas 1 y 2 son iguales? False=No, True=Si \n" + Arrays.equals(num1, num2));
        System.out.println("");

        //busco un valor en una tabla ordenada

        char[] abc = {'a','b','c','d','e','f','g'};
        System.out.println("La letra 'd' se encuentra en la posición "+Arrays.binarySearch(abc, 'd'));

        //si no lo encuentra, te da la posición en la que debería estar
        //además hay que restarle -1 a toda la sentencia, así como poner -Arrays
        System.out.println("la letra 'h' no se encuentra en la tabla, pero debería estar en la posición  "
                + (-Arrays.binarySearch(abc,'h')-1));
        System.out.println("");

        //busco un valor en la misma tabla pero
        char[] abc2 = Arrays.copyOf(abc, abc.length+10);
        System.out.println("Copia de abc en abc2 y le aumentamos 10 posiciones");
        System.out.println(Arrays.toString(abc2));
        abc2 = Arrays.copyOfRange(abc,0, abc2.length);
        Arrays.fill(abc2,abc.length, abc2.length, '~');

        System.out.println("En el array 1, encontramos que la letra 'h' debería estar en la posición "
                +Arrays.binarySearch(abc, 'h'));
        System.out.println("En el array 2, encontramso que la letra 'h' debería estar en la posición "
                +Arrays.binarySearch(abc2, 'h'));
        System.out.println("");

        // Busco la posición que debería estar. Hay que diferenciar si ya se encuentra o no
        int ultimaPosicion = abc.length-1;
        int indicePosicion = (Arrays.binarySearch(abc,'b'));

        if (indicePosicion<0){
            indicePosicion = -(indicePosicion)-1;
        }

        // Desplazo desde indice posición hasta el final los elementos una posición para hacer hueco
        for (int i = ultimaPosicion; i >=indicePosicion ; i--) {
            abc2[ultimaPosicion+1]=abc2[ultimaPosicion];
        }
        abc2[indicePosicion]='h';

        System.out.println(Arrays.toString(abc2));



    }
}
