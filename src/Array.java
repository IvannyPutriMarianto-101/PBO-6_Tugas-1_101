import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        System.out.println("Isi ArrayList: " + numbers);

        int size = numbers.size();
        System.out.println("Jumlah elemen dalam ArrayList: " + size);


        int element = numbers.get(1);
        System.out.println("Elemen pada indeks ke-1: " + element);


        numbers.remove(Integer.valueOf(20));
        System.out.println("Setelah menghapus 20: " + numbers);


        boolean contains = numbers.contains(30);
        System.out.println("Apakah 30 ada dalam ArrayList? " + contains);
    }
}