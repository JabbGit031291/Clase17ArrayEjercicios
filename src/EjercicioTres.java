import java.util.ArrayList;

public class EjercicioTres {

    public static void main(String[] args) {

        //Crea un ArrayList de números enteros.
        ArrayList<Integer> numeros = new ArrayList<>();

        int numeros1 = 1;
        int numeros2 = 2;
        int numeros3 = 3;
        int numeros4 = 4;
        int numeros5 = 5;
        int numeros6 = 6;
        int numeros7 = 7;
        int numeros8 = 8;
        int numeros9 = 9;
        int numeros10 = 10;

        //Llénalo con los números 1 a 10.
        numeros.add(numeros1);
        numeros.add(numeros2);
        numeros.add(numeros3);
        numeros.add(numeros4);
        numeros.add(numeros5);
        numeros.add(numeros6);
        numeros.add(numeros7);
        numeros.add(numeros8);
        numeros.add(numeros9);
        numeros.add(numeros10);

        //Filtra los números pares en una nueva lista llamada evenNumbers.
        ArrayList evenNumbers = new ArrayList();

        //Imprime la lista original y la lista de números pares.
        for (int number: numeros){
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
            System.out.println("Lista original: "+number);
            System.out.println("Lista pares: " + evenNumbers);
        }


    }
}
