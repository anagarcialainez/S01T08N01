package s01n01ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainLista7 {
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
            return -((String)obj).length(); //con el signo "-" se logra que la lista se ordene al revés
        }else{
            return 0;
        }
        }));

        System.out.println("Lista ordenada al revés por longitud de cadenas");

        lista.forEach(System.out::println);
    }
}

/*Con la lista del ejercicio anterior, ahora ordénala al revés, de cadena más larga a más corta.
 */
