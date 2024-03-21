import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan bilangan bulat
        ArrayList<Integer> numbers = new ArrayList<>();

        // Menambahkan elemen ke dalam ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList: " + numbers);

        // Menggunakan method size() untuk mendapatkan jumlah elemen dalam ArrayList
        int size = numbers.size();
        System.out.println("Jumlah elemen dalam ArrayList: " + size);

        // Menggunakan method get() untuk mendapatkan elemen berdasarkan indeks
        int element = numbers.get(1);
        System.out.println("Elemen pada indeks ke-1: " + element);

        // Menggunakan method remove() untuk menghapus elemen berdasarkan nilai
        numbers.remove(Integer.valueOf(20));
        System.out.println("Setelah menghapus 20: " + numbers);

        // Menggunakan method contains() untuk memeriksa apakah elemen tertentu ada dalam ArrayList
        boolean contains = numbers.contains(30);
        System.out.println("Apakah 30 ada dalam ArrayList? " + contains);
    }
}