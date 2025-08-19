import java.util.Scanner;
import java.time.LocalDate;

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


        
    }
}
