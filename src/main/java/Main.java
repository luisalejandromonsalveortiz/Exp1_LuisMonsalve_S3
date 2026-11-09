import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("    SISTEMA DE GESTIÓN DE PERSONAS - LLANQUIHUE TOUR     ");
        System.out.println("=========================================================\n");

        // 1. Creación de direcciones usando el objeto de composición
        Direccion dir1 = new Direccion("San Pedro", "450", "Puerto Varas", "Los Lagos");
        Direccion dir2 = new Direccion("Los Alerces", "1210", "Puerto Montt", "Los Lagos");
        Direccion dir3 = new Direccion("Vicente Pérez Rosales", "89", "Llanquihue", "Los Lagos");

        // 2. Instanciación de objetos usando las clases estructuradas
        Persona cliente = new Persona("12.345.678-9", "María José Flores", "maria.flores@email.com", "+56911112222", dir1);
        Empleado guia = new Empleado("18.765.432-1", "Carlos Delgado", "carlos.guia@llanquihuetour.cl", "+56933334444", dir2, "Guía Turístico Extremo", 850000);
        Empleado operador = new Empleado("15.987.654-K", "Ana Luisa Gómez", "ana.operaciones@llanquihuetour.cl", "+56955556666", dir3, "Operador de Logística", 920000);

        // 3. Despliegue de información legible por consola usando toString()
        System.out.println("--- Registro de Clientes ---");
        System.out.println(cliente);
        System.out.println();

        System.out.println("--- Registro de Colaboradores e Internos ---");
        System.out.println(guia);
        System.out.println(operador);
        
        System.out.println("\n=========================================================");
        System.out.println("       Estructura de datos inicializada con éxito        ");
        System.out.println("=========================================================");
    }
}
