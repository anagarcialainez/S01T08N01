package s01n01ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaString obj1 = new ListaString();
        List<String> listaDeCadenas = Arrays.asList("Hola","Carolina","Java","Lambdas","Ordenador");

        System.out.println("-----Cadenas que contienen 'o'----- ");
        obj1.filtrarCadenasConO(listaDeCadenas).forEach(cadenas -> System.out.println(cadenas));

    }
}

/*Crea una lista de Strings, escribe un método que devuelve una lista de todas las cadenas que contienen la letra ‘o’.
 Imprime el resultado.
 */
