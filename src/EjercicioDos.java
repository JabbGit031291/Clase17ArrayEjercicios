import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        int numbers1 = 1;
        int numbers2 = 2;
        int numbers3 = 3;
        int numbers4 = 4;
        int numbers5 = 5;

        numbers.add(numbers1);
        numbers.add(numbers2);
        numbers.add(numbers3);
        numbers.add(numbers4);
        numbers.add(numbers5);

        //Usa un bucle for para imprimir cada número.
        for (int i = 0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        //Usa un bucle for-each para imprimir los mismos números.
        for (int number: numbers){
            System.out.println(number);
        }
        //Usa un bucle while para imprimir los números en orden inverso.

    }
}
