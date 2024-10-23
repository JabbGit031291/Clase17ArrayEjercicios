import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EjercicioSiete {
    public static void main(String[] args) {

        //Se crea el array con los numeros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        numeros.add(4);
        numeros.add(1);


        //Se imprimen los numeros originales
        System.out.println("Se imprime la lista de numeros original: " + numeros);

        //Se convierte la lista a un set para eliminar los numeros duplicados
        Set<Integer> numerosDuplicados = new HashSet<>(numeros);

        //Se imprime la nueva lista sin los numeros dupicados
        System.out.println("Se imprime el resultante: " + numerosDuplicados);
    }
}
