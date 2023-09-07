package s01n01ex8;

public class MainReverse {
    public static void main(String[] args) {
        //instancea de la interfaz con una lambda que invierte la cadena
        StringReverse reverser = (entrada) -> {
            StringBuilder invertido = new StringBuilder(entrada);
            return invertido.reverse().toString();
        };

        //invocamos al método reverse() de la instancea
        String original = "Hola";
        String resultado = reverser.reverse(original);

        System.out.println("Cadena original: " + original);

        System.out.println("Cadena invertida: " + resultado);
    }
}

/*Crea una Functional Interface que contenga un método llamado reverse(). Este método debe recibir y debe devolver
un String. En el main() de la clase principal, inyecta a la interfaz creada mediante una lambda,
el cuerpo del método, de modo que devuelva la misma cadena que recibe como parámetro pero al revés.
Invoca la instancia de la interfaz pasándole una cadena y comprueba si el resultado es correcto.*/
