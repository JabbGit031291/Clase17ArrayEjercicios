import java.util.ArrayList;

public class EjercicioCuatro {

    public static void main(String[] args) {

        //Crea dos ArrayList de String llamadas list1 y list2.
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //Llena list1 con: "Apple", "Banana", "Cherry", "Date".
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Dae");

        //Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
        list2.add("Banana");
        list2.add("Date");
        list2.add("ElDerberry");
        list2.add("Fig");

        //Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
        ArrayList<String> commonElements = new ArrayList<>();
        for (String elements: list1){
            if (list2.contains(elements)){
                commonElements.add(elements);
            }
            //Imprime los elementos comunes.
            System.out.println("Los elementos en comunes son: "+commonElements);
        }
    }


}
