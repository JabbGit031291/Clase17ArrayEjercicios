import java.util.ArrayList;

public class EjercicioDies {
    public static void main(String[] args) {

        //Se crea la lista con los animales
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Loro");
        animales.add("Elefante");
        animales.add("Leon");
        animales.add("Tigre");

        //Se crea una variable con el animal que se va a buscar
        String buscarAninal="Elefante";

        //Se crea una condicion para buscar el animal de la lista
        if (animales.contains(buscarAninal)){
            System.out.println("El animal " + buscarAninal + "Se ecuentra en la lista");
        }else {
            System.out.println("El animal " + buscarAninal + "Se no se encuentra en la lista");
        }
    }
}
