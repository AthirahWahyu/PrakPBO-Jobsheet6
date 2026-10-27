public class Main {
    public static void main(String[] args) {
        // Instansiasi objek child class menggunakan constructor berparameter
        Mobil mobil1 = new Mobil("Palisade", "Hitam", 2025, 4);

        // Memanggil method override untuk mencetak informasi objek
        System.out.println("--- INFO MOBIL ---");
        mobil1.tampilkanInfo();
    }
}