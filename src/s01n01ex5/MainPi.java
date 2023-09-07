package s01n01ex5;

public class MainPi {
    public static void main(String[] args) {
        //instanceamos la interfaz y asignamos el valor de pi
        PiProvider piProvider = () -> 3.1415;

        //invocamos el método getPiValue() e imprimimos el resultado
        double piValue = piProvider.getPiValue();

        System.out.println("El valor de Pi es: " + piValue);

    }
}

/*Crea una Functional Interface con un método llamado getPiValue() que debe devolver un double.
Desde el main() de la clase principal, instancia la interfaz y asignarle el valor 3.1415.
Invoca el método getPiValue() e imprime el resultado.
 */
