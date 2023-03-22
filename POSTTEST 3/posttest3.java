import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class posttest3 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    static ArrayList<SudahSpk> listSpk = new ArrayList<>();
    static ArrayList<belumSpk> listTakSpk = new ArrayList<>();

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
        System.out.println("Sudah Spk / Belum Spk : /\n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            System.out.println("Masukkan Nama Mobil : ");
            String nama = br.readLine();

            System.out.println("Masukkan Tahun Keluar : ");
            int tahun = Integer.parseInt(br.readLine());

            System.out.println("Masukkan Harga : ");
            int harga = Integer.parseInt(br.readLine());

            System.out.println("Status Spk");
            String StatusSpk = br.readLine();

            System.out.println(
                    "Sudah Spk / Belum Spk : /\n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
            int isregis = Integer.parseInt(br.readLine());

            if (isregis == 1) {
                SudahSpk mblA = new SudahSpk(nama, tahun, harga, StatusSpk, true);
                listSpk.add(mblA);
                mblA.notif();
            } else if (isregis == 2) {
                SudahSpk mblA = new SudahSpk(nama, tahun, harga, StatusSpk, false);
                listSpk.add(mblA);
                mblA.notif();
            }
        } else if (pil == 2) {
            System.out.println("Masukkan Nama Mobil : ");
            String nama = br.readLine();

            System.out.println("Masukkan Tahun keluar : ");
            int tahun = Integer.parseInt(br.readLine());

            System.out.println("Masukkan Harga mobil : ");
            Integer harga = Integer.parseInt(br.readLine());

            System.out.println("Kendala Spk");
            String notrady = br.readLine();

            belumSpk mblB = new belumSpk(nama, tahun, harga, notrady);
            listTakSpk.add(mblB);
            mblB.notif();
        } else {
            System.out.println("Yang Dimasukan Salah");
        }
    }

    static void tampil() throws IOException {
        System.out.println("lihat data Sudah Spk / Belum Spk : /\n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            if (listSpk.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("\n");
                for (int i = 0; i < listSpk.size(); i++) {
                    System.out.print(i + 1 + "\nNama Mobil\t:");
                    System.out.print(listSpk.get(i).getNama() + "\nTahun Keluar\t:");
                    System.out.print(listSpk.get(i).gettahun() + "\nHarga Mobil \t:Rp.");
                    System.out.print(listSpk.get(i).getharga() + "\nStatus Spk \t:");
                    System.out.print(listSpk.get(i).getStatusSpk() + "\nKeterangan\t:");
                    listSpk.get(i).getSudahSpk();
                }
            }
        } else if (pil == 2) {
            if (listTakSpk.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("\n");
                for (int i = 0; i < listTakSpk.size(); i++) {
                    System.out.print(i + 1 + "\nNama Mobil\t:");
                    System.out.print(listTakSpk.get(i).getNama() + "\nTahun Keluar\t:");
                    System.out.print(listTakSpk.get(i).gettahun() + "\nHarga Mobil \t:Rp.");
                    System.out.print(listTakSpk.get(i).getharga() + "\nStatus Spk \t:");
                    System.out.print(listTakSpk.get(i).getnotrady());
                }
            }
        }
    }

    static void ubah() throws IOException {
        System.out.println("Sudah Spk / Belum Spk : /\n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            tampil();
            System.out.println("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.println("Nama Mobil Baru: ");
            listSpk.get(pilihan).setNama(br.readLine());

            System.out.println("tahun Keluar Baru: ");
            listSpk.get(pilihan).settahun(Integer.parseInt(br.readLine()));

            System.out.println("harga Mobil Baru: ");
            listSpk.get(pilihan).setharga(Integer.parseInt(br.readLine()));

            System.out.println("\nData Berhasil Diubah...");
        } else if (pil == 2) {
            tampil();
            System.out.println("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.println("Nama Mobil Baru: ");
            listTakSpk.get(pilihan).setNama(br.readLine());

            System.out.println("tahun Keluar Baru: ");
            listTakSpk.get(pilihan).settahun(Integer.parseInt(br.readLine()));

            System.out.println("harga Mobil Baru: ");
            listTakSpk.get(pilihan).setharga(Integer.parseInt(br.readLine()));

            System.out.println("\nData Berhasil Diubah...");
        }

    }

    static void hapus() throws IOException {
        System.out.println("Sudah Spk / Belum Spk : /\n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            tampil();
            System.out.println("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listSpk.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        } else if (pil == 2) {
            tampil();
            System.out.println("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listTakSpk.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        }

    }
}
