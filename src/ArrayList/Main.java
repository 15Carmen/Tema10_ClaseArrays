package ArrayList;

import java.util.ArrayList;

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
    }
}
