package s01n01ex2;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ListaString2 obj1 = new ListaString2();
        List<String> listaDeCadenas = Arrays.asList("Hola","Carolina","Java","Lambdas","Ordenador");

        System.out.println("-----Cadenas que contienen 'o'----- ");

        obj1.filtrarCadenasConOyMasDe5Letras(listaDeCadenas).forEach(cadenas -> System.out.println(cadenas));

    }
}

/*Tienes que hacer lo mismo que en el punto anterior, pero ahora, el método debe devolver una lista con los Strings que además de contener la letra “o” también tienen más de 5 letras.
Imprime el resultado.
.
 */
