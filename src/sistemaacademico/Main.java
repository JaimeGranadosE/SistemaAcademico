
package sistemaacademico;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    static ArrayList<Nota> notas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== SISTEMA ACADEMICO =====");
            System.out.println("1. Registrar Nota");
            System.out.println("2. Listar Notas");
            System.out.println("3. Buscar Nota");
            System.out.println("4. Actualizar Nota");
            System.out.println("5. Eliminar Nota");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    registrarNota();
                    break;
                case 2:
                    listarNotas();
                    break;
                case 3:
                    buscarNota();
                    break;
                case 4:
                    actualizarNota();
                    break;
                case 5:
                    eliminarNota();

                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:

                    System.out.println("Opción inválida.");

                    System.out.println("Opcion invalida.");

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


    // =========================
    // CREATE
    // =========================
    public static void registrarNota() {

        System.out.println("\n=== REGISTRAR NOTA ===");

        System.out.print("Codigo del estudiante: ");
        String codigoEstudiante = sc.nextLine();

        System.out.print("Codigo de la asignatura: ");
        String codigoAsignatura = sc.nextLine();

        System.out.print("Valor de la nota: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        Nota nuevaNota = new Nota(codigoEstudiante, codigoAsignatura, valor);
        notas.add(nuevaNota);

        System.out.println("Nota registrada correctamente.");
    }

    // =========================
    // READ - LISTAR
    // =========================
    public static void listarNotas() {

        System.out.println("\n=== LISTA DE NOTAS ===");

        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
        } else {
            for (Nota n : notas) {
                System.out.println(n);
            }
        }
    }

    // =========================
    // READ - BUSCAR
    // =========================
    public static void buscarNota() {

        System.out.print("Ingrese codigo del estudiante: ");
        String codigo = sc.nextLine();

        boolean encontrada = false;

        for (Nota n : notas) {
            if (n.getCodigoEstudiante().equals(codigo)) {
                System.out.println("Nota encontrada:");
                System.out.println(n);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontro ninguna nota para ese estudiante.");
        }
    }

    // =========================
    // UPDATE
    // =========================
    public static void actualizarNota() {

        System.out.print("Ingrese codigo del estudiante: ");
        String codigo = sc.nextLine();

        for (Nota n : notas) {
            if (n.getCodigoEstudiante().equals(codigo)) {

                System.out.print("Nuevo valor de la nota: ");
                double nuevoValor = sc.nextDouble();
                sc.nextLine();

                n.setValor(nuevoValor);

                System.out.println("Nota actualizada correctamente.");

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

        System.out.println("No se encontro la nota.");
    }

    // =========================
    // DELETE
    // =========================
    public static void eliminarNota() {

        System.out.print("Ingrese codigo del estudiante: ");
        String codigo = sc.nextLine();

        for (Nota n : notas) {
            if (n.getCodigoEstudiante().equals(codigo)) {
                notas.remove(n);
                System.out.println("Nota eliminada correctamente.");

                return;
            }
        }


        System.out.println("Estudiante no encontrado.");
    }
}


        System.out.println("No se encontro la nota.");
    }
}
