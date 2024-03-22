public class Kucing {

    private String nama;
    private int usia;
    private String warnaBulu;
    private String jenis;

    public Kucing(String nama, int usia, String warnaBulu, String jenis) {
        this.nama = nama;
        this.usia = usia;
        this.warnaBulu = warnaBulu;
        this.jenis = jenis;
    }

    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan);
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }

    public void mengeong() {
        System.out.println(nama + " sedang mengeong");
    }

    public void infoKucing() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Warna Bulu: " + warnaBulu);
        System.out.println("Jenis: " + jenis);
    }
}