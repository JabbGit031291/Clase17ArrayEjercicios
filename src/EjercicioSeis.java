import java.util.ArrayList;
import java.util.Collections;

public class EjercicioSeis {
    public static void main(String[] args) {
        //Se crea el Array con las 5 ciudades
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Bogota");
        ciudades.add("Medellin");
        ciudades.add("Cali");
        ciudades.add("Cartagena");
        ciudades.add("Bucaramanga");

        //Se imprimen las ciudades antes de mezclarlas
        System.out.println("Se imprimen las ciudades antes de la mezcla: " + ciudades);

        //Se utiliza el Collections para realizar la mezcla
        Collections.shuffle(ciudades);

        //Se imprime las ciudades mezcladas
        System.out.println("Se imprimen las ciudades despues de mezclar: " + ciudades);
    }
}
