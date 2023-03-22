class Mobil {
    private String nama;
    private int tahun;
    private int harga;

    public Mobil(String nama, int tahun, int harga) {
        this.nama = nama;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int gettahun() {
        return tahun;
    }

    public void settahun(int tahun) {
        this.tahun = tahun;
    }

    public int getharga() {
        return harga;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }
}
