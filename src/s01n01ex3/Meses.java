package s01n01ex3;

import java.util.*;

public class Meses {
    public static void main(String[] args) {
        List<String> meses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        System.out.println("---Imprimiendo meses del año utilizando lambdas----");

        meses.forEach(mes -> System.out.println(mes));
    }
}
