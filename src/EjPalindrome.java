
import java.util.Scanner;
public class EjPalindrome {

    public static String esPalindroma(String palabra){
        String palabraSinEspacios = palabra.replaceAll("\\s+", "").toLowerCase();
        int longitud = palabraSinEspacios.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            if (palabraSinEspacios.charAt(i) != palabraSinEspacios.charAt(longitud - 1 - i)) {
                return "La palabra '" + palabra + "' no es un palíndromo.";
            }
        }
        return "La palabra '" + palabra + "' es un palíndromo.";

    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra para verificar si es un palíndromo: ");
        String palabra = sc.nextLine();
        
        String resultado = esPalindroma(palabra);
        System.out.println(resultado);
        sc.close();
    }
}

    

