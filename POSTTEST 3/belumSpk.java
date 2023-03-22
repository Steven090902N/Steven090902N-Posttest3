public class belumSpk extends Mobil {
    private String status = "Belum Spk";
    String notrady;

    public belumSpk(String nama, int tahun, int harga, String notrady) {
        super(nama, tahun, harga);
        this.notrady = notrady;
    }

    public String getstatuS() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public String getnotrady() {
        return notrady;
    }

    public void setnotrady(String notrady) {
        this.notrady = notrady;
    }
}
