import java.time.LocalDate;
import java.util.Scanner;

public class Integradora1 {
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
        double totalPorcentaje = 0.0;

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

        // Preguntamos cuantas actividades desea registrar
        System.out.println("¿Cuántas actividades desea registrar? (máximo 5):");
        int numActividades = sc.nextInt();

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

        if (porcentajeActividad.length > 0 && totalPorcentaje != 100.0) {
            System.out.println("Error: El porcentaje total de las actividades debe ser 100%. Actualmente es: " + totalPorcentaje + "%");
        } else {
            System.out.println("\n--- Resumen del Curso ---");
            System.out.println("Código del Curso: " + codigoCurso[0]);
            System.out.println("Nombre del Curso: " + nombreCurso[0]);
            System.out.println("Créditos del Curso: " + creditosCurso[0]);
            System.out.println("Profesor del Curso: " + profesorCurso[0]);
            System.out.println("Salón del Curso: " + salonCurso[0]);
            System.out.println("\n--- Actividades Registradas ---");
            for (int i = 0; i < numActividades; i++) {
                System.out.println("Actividad " + (i + 1) + ":");
                System.out.println("  Nombre: " + nombreActividad[i]);
                System.out.println("  Fecha de Entrega: " + fechaEntrega[i]);
                System.out.println("  Porcentaje: " + porcentajeActividad[i] + "%");
            }
        }
        sc.close();


        
    }
}
