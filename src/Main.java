import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 100");
        System.out.println("El máximo de intentos es 5... Buena suerte!");
        int numero = new Random().nextInt(100);
        System.out.println(numero);
        int intento = scanner.nextInt();

        
        for (int i = 0; i < 4; i++) {

            if (numero != intento) {
                System.out.println("El número ingresado es incorrecto, intentelo nuevamente!");
                intento = scanner.nextInt();
            }
            if (intento == numero){
                System.out.println("Felicitaciones! Ha acertado el número");
                break;
            } else if (i==3) {
                System.out.println("Ha agotado los intentos posibles, reinicie el juego para seguir divirtiéndose.");

            }
        }

    }
}