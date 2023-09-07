package s01n01ex2;

import java.util.List;
import java.util.stream.Collectors;

public class ListaString2 {
    public List<String> filtrarCadenasConOyMasDe5Letras(List<String> listaDeCadenas){
        return listaDeCadenas.stream().filter(cadena -> cadena.contains("o") || cadena.contains("O"))
                .filter(cadena->cadena.length()>5).collect(Collectors.toList());

    }
}
