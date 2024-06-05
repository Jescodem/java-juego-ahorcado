import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner para lectura de datos
        Scanner console = new Scanner(System.in);

        // Declaracion y asignacion de variables
        String palabraSecreta;
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Solicitar palabra al usuario
        System.out.println("Digite la palabra secreta: ");
        palabraSecreta = console.nextLine().toLowerCase();

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa(Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa(Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce 1 letra, por favor");
            // Captura de primera letra ingresada
            char letra = console.next().toLowerCase().charAt(0);

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta! Te quedan " + (intentosMaximos - intentos) + " intentos.");

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades adivinaste la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("GAME OVER");
        }

        console.close();

    }
}
