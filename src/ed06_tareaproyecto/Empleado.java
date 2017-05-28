/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Empleado {

    public static void setDatos(Empleado empleado1) {
        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);
    }
    /**
     *<b> Incluimos un comentario para comprobar que las modificaciones se actualizan
     * en nuestro repositorio GIT</b>
     * Definimos los atributos de la clase empleado
     * @param dni
     * @param nombre
     * @param direccion
     * @param cargo
     * @param numHijos
     * @author ED06
     */
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    
    /**
     * Constructor de la clase Empleado
     * Asignamos a los atributos los datos que nos entran como parametros
     * @param dni
     * @param nombre
    */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    /**
     * 
     * Metodo que imprime los datos de empleado
     * con el siguiente formato:
     * DNI:*****
     * @param empleado1
     */
    protected static void imprime_emp(Empleado empleado1) {
        System.out.println("DNI: " + empleado1.getDni());
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Cargo: " + empleado1.getCargo());
        System.out.println("Nº de hijos: " + empleado1.getNumHijos());
        System.out.println("Sueldo: " + empleado1.calcula_sueldo(1200));
    }

    /**
     * Funcion que devuelve el valor de dni
     * @return  dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set asigna el valor a dni del parametro que recibe
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return función que devuelve la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre asignamos a nombre el valor que recibimos mediante l parametro de la función
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return función que devuelve la variable direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion asignamos a direccion el valor que recibimos mediante l parametro de la función
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return función que devuelve el valor de cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set asigna el valor a dni del parametro que recibe
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return funcion que devulve el valor de numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos asignamos a numhijos el valor que recibimos mediante l parametro de la función
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    /**
     * Funcion que mediante la llamada a distintos metodos de la clase Empleado calcula el sueldo
     * 
     * 
     * @param base
     * @return  el valor de total que será el sueldo
     */
    
    public double calcula_sueldo(double base){
        double total=base;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }
}
