package s01n01ex6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainLista {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add(25);
        lista.add("Banana");
        lista.add("Fresa");
        lista.add(10);
        lista.add("Uva");

        lista.sort(Comparator.comparing(obj -> { //para determinar el orden de los elementos en la lista
            if(obj instanceof String){ //validamos que sea un String
            return ((String)obj).length(); //obtenemos la longitud de en caso de ser una cadena
        }else{
            return 0;
        }
        }));

        System.out.println("Lista ordenada por longitud de cadenas");

        lista.forEach(System.out::println);
    }
}

/*Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.
 */
