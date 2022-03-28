package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {

    //atributos

    private String nombre;
    private String dni;
    private int edad;


    //constructor con argumentos

    public Cliente(String nombre, String dni, int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }

    public Cliente(String dni){
        this.dni=dni;
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {

        return "Cliente: " + nombre + ',' +
                "Dni: "+ dni + ',' +
                "Edad: "+ edad;
    }

    @Override
    public boolean equals(Object obj) {
        boolean salir=false;

        if (obj instanceof Cliente o){
            if (Objects.equals(dni, o.dni)){
                salir=true;
            }
        }
        return salir;
    }

}
