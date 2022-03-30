package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList <Cliente> misClientes = new ArrayList<>();

        misClientes.add(new Cliente("Jesuuuuu", "464666463D", 20));
        misClientes.add(new Cliente("Eva", "9874561A", 42));
        misClientes.add(new Cliente("Carmen", "49117682D", 19));

        Cliente tontin = new Cliente("Lucia", "873569269S", 19);
        misClientes.add(tontin);

        Cliente tonton = new Cliente("Pancracio", "3543543W", 75);

        //para quitar un objeto de array

        //misClientes.remove(tontin);
        //misClientes.remove(2);

        //para imprimir el array
        for (Cliente cliente : misClientes){
            System.out.println(cliente.toString());
        }

        //para saber el numero de posiciones ocupadas de array
        System.out.println("Hay " + misClientes.size()+ " clientes");

        //para saber si el array esta vacio
        System.out.println("El array está vacío? Sí=True, No=False \n" + misClientes.isEmpty());

        //para averiguar si el dni de un cliente se encuentra dentro del array
        System.out.println("El array contiene al cliente Pancracio? Sí=True, No=False \n" + misClientes.contains(tonton));
        System.out.println("El array contiene al cliente Lucía? Sí=True, No=False \n" + misClientes.contains(tontin));

        System.out.println("El array contiene al cliente con dni 5464646D? Sí=True, No=False \n" + misClientes.contains(new Cliente("5464646D")));

        //imprimir el array de forma fea
        System.out.println(misClientes);
        System.out.println("");

        //iterator
        Iterator iterator = misClientes.listIterator();

        System.out.println("Borramos a los clientes mayores de 25 años");
        System.out.println("");

        for(; iterator.hasNext();){

            Cliente p = (Cliente) iterator.next();

            if (p.getEdad()>25){
                iterator.remove();
            }
        }

        System.out.println(misClientes);

        ListIterator <Cliente> listIterator = misClientes.listIterator();

        //recorrer la lista hacia delante
        System.out.println("\nRecorremos hacia delante la lista\n");
        for (;listIterator.hasNext();){
            System.out.println(listIterator.next());
        }

        //recorrer la lista hacia atrás
        System.out.println("Recorremos hacia atrás la lista\n");
        for (;listIterator.hasPrevious();){
            System.out.println(listIterator.previous());
        }

        ArrayList <Integer> num1 = new ArrayList<>();

        num1.add(5);
        num1.add(10);
        num1.add(15);
        num1.add(20);
        num1.add(25);
        System.out.println("Vamos a imprimir un array de enteros");
        System.out.println(num1);

        System.out.println("Cambiamos el numero en la posición 2 por un 14" );
        num1.set(2,14);
        System.out.println(num1);



    }
}
