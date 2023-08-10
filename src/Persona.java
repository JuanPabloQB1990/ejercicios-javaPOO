public class Persona {
    private String nombre;
    private int edad;
    private String identificacion;

    public Persona (){

    }
    public Persona(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    private String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void mostrarDatos() {
        System.out.println("nombre: "+ getNombre() + " edad: "+ getEdad()+" identificación: "+ getIdentificacion());

    }

    public void esMayorDeEdad() {
        if(this.edad > 18){
            System.out.println(getNombre() + " es mayor de edad");
        } else {
            System.out.println(getNombre() + " es menor de edad");
        }
    }

}
