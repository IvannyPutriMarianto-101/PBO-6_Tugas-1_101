//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instantiation dengan 3 objek berbeda
        Kucing kucing1 = new Kucing("Kiyowo", 3, "Putih", "Anggora");
        Kucing kucing2 = new Kucing("Apricot", 2, "Abu-abu", "Persia");
        Kucing kucing3 = new Kucing("Melon", 1, "Coklat", "Domestik");

        // Memanggil method infoKucing untuk setiap objek
        kucing1.infoKucing();
        System.out.println();
        kucing2.infoKucing();
        System.out.println();
        kucing3.infoKucing();
    }
}