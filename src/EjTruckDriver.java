import java.util.Scanner;

public class EjTruckDriver {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] conductores = new String[3];
        int[] kmDiarios = new int[3];

        for (int i = 0; i < conductores.length; i++) {
            System.out.println("Ingrese el nombre del conductor " + (i + 1) + ": ");
            conductores[i] = sc.nextLine();
        }

        for (int i = 0; i < kmDiarios.length; i++) {
            System.out.println("Ingrese los kilómetros recorridos por " + conductores[i] + " en un día: ");
            kmDiarios[i] = sc.nextInt();
        }

        int[] kmSemanales = new int[3];
        for (int i = 0; i < kmSemanales.length; i++) {
            kmSemanales[i] = kmDiarios[i] * 7; // Asumimos 7 días a la semana
        }

        System.out.println("Los kilómetros totales recorridos por cada conductor son: ");
        totalKilometrosCadaConductor(conductores, kmSemanales);

        sc.close();
    }

    public static void totalKilometrosCadaConductor(String[] conductores, int[] kmSemanales) {
        for (int i = 0; i < conductores.length; i++) {
            System.out.println("El conductor " + conductores[i] + " ha recorrido un total de " + kmSemanales[i] + " kilómetros.");
        }
    }
}
