import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main(String[] args) {

        String fruta1 = "Apple";
        String fruta2= "Banana";
        String fruta3= "Cherry";

        List<String> fruits = new ArrayList<>();

        //Agregar elementos
        fruits.add(fruta1);
        fruits.add(fruta2);
        fruits.add(fruta3);

        //Todos los elementos
        System.out.println("Los elementos de la lista son " + fruits);
        //Tamaño
        System.out.println("El tamaño de la lista es: "+ fruits.size());

        //Elimina "Banana" de la lista.
        fruits.remove("Banana");
        System.out.println(fruits);

        //Cambia el valor de "Cherry" por "Orange".
        fruits.add(2,"Cherry");
        fruits.set(2,"Orange");
        System.out.println("la lista resultante.: " + fruits);

    }

}
