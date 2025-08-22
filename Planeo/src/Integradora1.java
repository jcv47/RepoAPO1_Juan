import java.time.LocalDate;
import java.util.Scanner;

public class Integradora1{

    // Función para registrar UN curso
    public static void registrarCurso(Scanner sc, String[] codigoCurso, String[] nombreCurso, int[] creditosCurso, String[] profesorCurso, String[] salonCurso) {
        System.out.println("Ingrese el codigo del curso a registrar:");
        codigoCurso[0] = sc.nextLine();
        System.out.println("Ingrese el nombre del curso:");
        nombreCurso[0] = sc.nextLine();
        System.out.println("Ingrese los créditos del curso:");
        creditosCurso[0] = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el nombre del profesor del curso:");
        profesorCurso[0] = sc.nextLine();
        System.out.println("Ingrese el salón del curso:");
        salonCurso[0] = sc.nextLine();
    }

    // Función para registrar actividades
    public static double registrarActividades(Scanner sc, String[] nombreActividad, LocalDate[] fechaEntrega, double[] porcentajeActividad, int numActividades) {
        double totalPorcentaje = 0.0;
        for (int i = 0; i < numActividades; i++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre de la actividad " + (i + 1) + ":");
            nombreActividad[i] = sc.nextLine();
            System.out.println("Ingrese la fecha de entrega (YYYY-MM-DD) de la actividad " + (i + 1) + ":");
            fechaEntrega[i] = LocalDate.parse(sc.nextLine());
            System.out.println("Ingrese el porcentaje de la actividad " + (i + 1) + ":");
            porcentajeActividad[i] = sc.nextDouble();
            totalPorcentaje += porcentajeActividad[i];
        }
        return totalPorcentaje;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] codigoCurso = new String[1];
        String[] nombreCurso = new String[1];
        int[] creditosCurso = new int[1];
        String[] profesorCurso = new String[1];
        String[] salonCurso = new String[1];
        String[] nombreActividad = new String[5];
        LocalDate[] fechaEntrega = new LocalDate[5];
        double[] porcentajeActividad = new double[5];
        int numActividades = 0;
        boolean cursoRegistrado = false;
        boolean actividadesRegistradas = false;

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Curso");
            System.out.println("2. Registrar Actividades");
            System.out.println("3. Ingresar Notas a Actividades");
            System.out.println("4. Visualizar Actividades");
            System.out.println("5. Consultar Promedio Ponderado del Curso");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarCurso(sc, codigoCurso, nombreCurso, creditosCurso, profesorCurso, salonCurso);
                    cursoRegistrado = true;
                    break;
                case 2:
                    if (!cursoRegistrado) {
                    System.out.println("Primero debe registrar un curso antes de agregar actividades.");
                    break;
                    }

                    boolean porcentajeValido = false;
                    while (!porcentajeValido) {
                    System.out.println("¿Cuántas actividades desea registrar? (máximo 5):");
                    numActividades = sc.nextInt();

                    double totalPorcentaje = registrarActividades(sc, nombreActividad, fechaEntrega, porcentajeActividad, numActividades);

                    if (totalPorcentaje != 100.0) {
                     System.out.println("Error: El porcentaje total de las actividades debe ser 100%. Actualmente es: " + totalPorcentaje + "%, por favor repita el registro de actividades.");
                     } 
                     else {
                        porcentajeValido = true;
                        System.out.println("\n--- Actividades Registradas al curso " + nombreCurso[0] + " ---");
                        for (int i = 0; i < numActividades; i++) {
                        System.out.println("Actividad " + (i + 1) + ":");
                        System.out.println("  Nombre: " + nombreActividad[i]);
                        System.out.println("  Fecha de Entrega: " + fechaEntrega[i]);
                        System.out.println("  Porcentaje: " + porcentajeActividad[i] + "%");
                        }
                        actividadesRegistradas = true;
                    }
                    }
                    break;   
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}