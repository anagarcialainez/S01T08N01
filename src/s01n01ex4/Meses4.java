package s01n01ex4;

import java.util.Arrays;
import java.util.List;

public class Meses4 {
    public static void main(String[] args) {
        List<String> meses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        System.out.println("---Imprimiendo meses del año utilizando con method reference----");

        meses.forEach(System.out::println);
    }
}
