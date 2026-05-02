public class Main {

    // Método solicitado
    public static void cambiarValores(int x, Persona persona) {

        System.out.println("\n--- Dentro del método ---");

        // Intentar modificar primitivo
        x = 99;
        System.out.println("x dentro del método: " + x);

        // Cambiar atributo del objeto
        persona.setNombre("Luis");
        System.out.println("Nombre dentro del método (modificado): " + persona.getNombre());

        // Reasignar el objeto
        persona = new Persona("Ana");
        System.out.println("Nombre dentro del método (reasignado): " + persona.getNombre());
    }

    public static void main(String[] args) {

        int a = 10;
        Persona p = new Persona("Carlos");

        System.out.println("===== ANTES DE LLAMAR AL MÉTODO =====");
        System.out.println("Valor de a: " + a);
        System.out.println("Nombre de p: " + p.getNombre());

        cambiarValores(a, p);

        System.out.println("\n===== DESPUÉS DE LLAMAR AL MÉTODO =====");
        System.out.println("Valor de a: " + a);
        System.out.println("Nombre de p: " + p.getNombre());
    }
}