package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n===== SISTEMA ACADÉMICO =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Actualizar estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

           try {
            opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                  System.out.println("Debe ingresar un número válido.");
                  opcion = -1;
            }

            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 4:
                    actualizarEstudiante();
                    break;
                case 5:
                    eliminarEstudiante();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
    
  public static void registrarEstudiante() {

    System.out.print("Código: ");
    String codigo = scanner.nextLine();

    // Validar que no exista el código
    for (Estudiante e : listaEstudiantes) {
        if (e.getCodigo().equalsIgnoreCase(codigo)) {
            System.out.println("Error: Ya existe un estudiante con ese código.");
            return;
        }
    }

    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();

    int edad;

    while (true) {
        try {
            System.out.print("Edad: ");
            edad = Integer.parseInt(scanner.nextLine());

            if (edad < 0) {
                System.out.println("La edad no puede ser negativa.");
            } else {
                break;
            }

        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido.");
        }
    }

    Estudiante estudiante = new Estudiante(codigo, nombre, edad);
    listaEstudiantes.add(estudiante);

    System.out.println("Estudiante registrado correctamente.");
}
    
    public static void listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : listaEstudiantes) {
                System.out.println(e);
            }
        }
    }
    
    public static void buscarEstudiante() {
        System.out.print("Ingrese código a buscar: ");
        String codigo = scanner.nextLine();

        for (Estudiante e : listaEstudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Estudiante encontrado:");
                System.out.println(e);
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
    
   public static void actualizarEstudiante() {

    System.out.print("Ingrese código del estudiante a actualizar: ");
    String codigo = scanner.nextLine();

    for (Estudiante e : listaEstudiantes) {
        if (e.getCodigo().equalsIgnoreCase(codigo)) {

            System.out.print("Nuevo nombre: ");
            e.setNombre(scanner.nextLine());

            int nuevaEdad;

            while (true) {
                try {
                    System.out.print("Nueva edad: ");
                    nuevaEdad = Integer.parseInt(scanner.nextLine());

                    if (nuevaEdad < 0) {
                        System.out.println("La edad no puede ser negativa.");
                    } else {
                        break;
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Debe ingresar un número válido.");
                }
            }

            e.setEdad(nuevaEdad);

            System.out.println("Estudiante actualizado correctamente.");
            return;
        }
    }

    System.out.println("Estudiante no encontrado.");
}
    
    public static void eliminarEstudiante() {
        System.out.print("Ingrese código del estudiante a eliminar: ");
        String codigo = scanner.nextLine();

        for (Estudiante e : listaEstudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                listaEstudiantes.remove(e);
                System.out.println("Estudiante eliminado correctamente.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
}

