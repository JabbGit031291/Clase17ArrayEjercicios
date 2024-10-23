import java.util.ArrayList;
import java.util.Collections;

public class EjercicioNueve {
    public static void main(String[] args) {

        //Se crea el array con los dias de la semana
        ArrayList<String> semana = new ArrayList<>();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");

        //Se imprime la lista de los dias de la semana en orden
        System.out.println("Se imprime la lista de los dias de la semanan en orden: " + semana);

        //Se utiliza el Collections para revertir el array
        Collections.reverse(semana);

        //Se imprime la lista de los dias de la semana invertida
        System.out.println("Se imprime la lista de los dias de la semana invertida" + semana);
    }
}
