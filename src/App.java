public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.edad = 21;
        cliente.telefono = 6363636;
        cliente.nombre = "Juanes Rojas";
        cliente.credito = 120000;

        System.out.println("DATOS CLIENTE \n");
        System.out.println("Edad: " +cliente.edad);
        System.out.println("Telefono: " +cliente.telefono);
        System.out.println("Nombre: " +cliente.nombre);
        System.out.println("Credito: " +cliente.credito+"\n");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 32;
        trabajador.telefono = 123456;
        trabajador.nombre = "Lionel Messi";
        trabajador.salario = 2000;

        System.out.println("DATOS TRABAJADOR \n");
        System.out.println("Edad: " +trabajador.edad);
        System.out.println("Telefono: " +trabajador.telefono);
        System.out.println("Nombre: " +trabajador.nombre);
        System.out.println("Salario: " +trabajador.salario+"$");
    }
}

class Persona{
    int edad, telefono;
    String nombre;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
