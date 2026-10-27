public class Kendaraan {
    // 3 Atribut pada parent class
    protected String merk;
    protected String warna;
    protected int tahunProduksi;

    // Constructor 1: Tanpa Parameter (Overloading)
    public Kendaraan() {
        this.merk = "Belum ditentukan";
        this.warna = "Belum ditentukan";
        this.tahunProduksi = 0;
    }

    // Constructor 2: Berparameter (Overloading)
    public Kendaraan(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Method yang akan dioverride
    public void tampilkanInfo() {
        System.out.println("Merk           : " + merk);
        System.out.println("Warna          : " + warna);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}