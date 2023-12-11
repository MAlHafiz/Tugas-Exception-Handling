import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            
            System.out.print("Masukkan nomor HP: ");
            String noHp = scanner.nextLine();

            System.out.print("Masukkan nama Kasir: ");
            String namaKasir = scanner.nextLine();

            Penjualan penjualan = new Penjualan(namaPelanggan, noHp, namaKasir);

            System.out.print("Masukkan nama barang: ");
            penjualan.namaBarang(scanner.nextLine());

            System.out.print("Masukkan harga barang: ");
            penjualan.hargaBarang(Double.parseDouble(scanner.nextLine()));

            System.out.print("Masukkan jumlah beli: ");
            penjualan.jumlahBeli(Integer.parseInt(scanner.nextLine()));

            // Menampilkan informasi
            System.out.println("\nACIAK MART");
            System.out.println("================================");
            System.out.println("DATA PELANGGAN");
            System.out.println("----------------------");
            System.out.println("Nama Pelanggan: " + penjualan.nama);
            System.out.println("Nomor HP: " + penjualan.noHp);
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("----------------------");
            System.out.println("Nama Barang: " + penjualan.namaBarang);
            System.out.println("Harga Barang: " + penjualan.hargaBarang);
            System.out.println("Jumlah Beli: " + penjualan.jumlahBeli);
            System.out.println("Total Bayar: " + penjualan.totalBayar());
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("kasir: " + penjualan.kasir );

            scanner.close();
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
