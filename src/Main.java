// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 33, "123456789");

        /*
        persona1.mostrarDatos();
        persona1.esMayorDeEdad();
        persona1.setEdad(15);
        persona1.setNombre("Pablo");
        persona1.setIdentificacion("101776666");
        persona1.mostrarDatos();
        persona1.esMayorDeEdad();
        */

        Cuenta cuenta1 = new Cuenta("Juan Pablo", 25000);

        System.out.println(cuenta1.mostrarDatos());
        cuenta1.ingresarSaldo(5000);
        System.out.println(cuenta1.mostrarDatos());
        cuenta1.retirarSaldo(20000);
        System.out.println(cuenta1.mostrarDatos());
        cuenta1.retirarSaldo(20000);
        System.out.println(cuenta1.mostrarDatos());
    }
}