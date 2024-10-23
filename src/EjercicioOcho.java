import java.util.ArrayList;

public class EjercicioOcho {

    public static void main(String[] args) {

        //Se crea el array con las palabras repetidas
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Carro");
        palabras.add("Bus");
        palabras.add("Camion");
        palabras.add("Tractomula");
        palabras.add("Carro");
        palabras.add("Tractomula");
        palabras.add("Tractomula");

        //Se crea una variable para contener la palabra que mas se repite
        String BuscarPalabra = "Tractomula";
        //Se crea una variable para almacenar las veces que se repite
        int contador=0;
        //Se crea un bucle y condicion para imprimir la palabra que mas se repite y cuantas veces
        for (String palabra:palabras){

            if (palabra.equals(BuscarPalabra)){
                contador++;
            }
        }

        //Se imprime el resultado
        System.out.println("La palabra que mas aparece es " + BuscarPalabra + " y las veces que aparecen son: "+ contador );


    }
}
