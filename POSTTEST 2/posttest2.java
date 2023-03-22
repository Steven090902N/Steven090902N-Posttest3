import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class posttest2 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Mobil> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println(
                    " 1. Tambah Data Mobil \n 2. Melihat Data Mobil \n 3. Ubah Data Mobil \n 4. Hapus Data Mobil \n 5. Keluar \n Masukkan Pilihan Anda : ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> System.out.println("PILIHAN SALAH!");
            }
            System.out.println("\n\n");
        }
    }

    static void tambah() throws IOException {
        System.out.println("Masukkan Nama Mobil : ");
        String nama = br.readLine();

        System.out.println("Masukkan Tahun Keluar : ");
        int tahun = Integer.parseInt(br.readLine());

        System.out.println("Masukkan Harga : ");
        int harga = Integer.parseInt(br.readLine());

        Mobil Mbl = new Mobil(nama, tahun, harga);
        list.add(Mbl);
        System.out.println("Data Berhasil Ditambahkan.");
    }

    static void tampil() {
        if (list.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("\n");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(i + 1 + "\nNama Mobil\t:");
                System.out.print(list.get(i).getNama() + "\nTahun Keluar\t:");
                System.out.print(list.get(i).gettahun() + "\nHega Mobil \t:Rp.");
                System.out.println(list.get(i).getharga());
            }
        }
    }

    static void ubah() throws IOException {
        tampil();
        System.out.println("\nMau Ubah Data Ke Berapa : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -= 1;

        System.out.println("Nama Mobil Baru: ");
        list.get(pilihan).setNama(br.readLine());

        System.out.println("tahun Keluar Baru: ");
        list.get(pilihan).settahun(Integer.parseInt(br.readLine()));

        System.out.println("harga Mobil Baru: ");
        list.get(pilihan).setharga(Integer.parseInt(br.readLine()));

        System.out.println("\nData Berhasil Diubah...");
    }

    static void hapus() throws IOException {
        tampil();
        System.out.println("\nMau Hapus Data Ke Berapa : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -= 1;

        list.remove(pilihan);
        System.out.println("\nData Berhasil Dihapus");
    }

}