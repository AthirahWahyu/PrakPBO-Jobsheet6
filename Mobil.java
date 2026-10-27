public class Mobil extends Kendaraan {
    // 1 Atribut pada child class
    private int jumlahPintu;

    // Constructor 1 : tanpa parameter (Overloading)
    public Mobil() {
        super(); // Memanggil constructor tanpa parameter milik parent class
        this.jumlahPintu = 0;
    }

    // Constructor 2 : berparameter (Overloading)
    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu) {
        // Memanggil constructor berparameter milik parent class (super)
        super(merk, warna, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    // Method Overriding (Nama dan signature sama dengan method di parent class)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method milik parent class
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}