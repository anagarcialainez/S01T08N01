package s01n01ex1;

import java.util.*;
import java.util.stream.Collectors;

public class ListaString {
    public List<String> filtrarCadenasConO(List<String> listaDeCadenas){
        return listaDeCadenas.stream().filter(cadena -> cadena.contains("o") || cadena.contains("O")).collect(Collectors.toList());

    }
}
