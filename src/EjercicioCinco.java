import java.util.ArrayList;

public class EjercicioCinco {
    public static void main(String[] args) {

        //Crea un ArrayList de enteros con los valores del 1 al 5.
        ArrayList<Integer> number = new ArrayList<>();
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;

        //Convierte este ArrayList en un array de tipo Integer[].
        Integer[] array = new Integer[number.size()];
        array=number.toArray(array);

        //Imprime el contenido del array usando un bucle for.
        for (int i=0;i<array.length;i++){
            System.out.println("El contenido : " + array[i]);
        }
    }
}
