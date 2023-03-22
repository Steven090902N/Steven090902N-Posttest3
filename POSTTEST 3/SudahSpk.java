public class SudahSpk extends Mobil {
    private String status = "Sudah Spk";
    String StatusSpk;
    boolean isRegistered;

    public SudahSpk(String nama, int tahun, int harga, String StatusSpk, boolean isRegistered) {
        super(nama, tahun, harga);
        this.StatusSpk = StatusSpk;
        this.isRegistered = isRegistered;
    }

    public String getstatuS() {
        return status;
    }

    public String getStatusSpk() {
        return StatusSpk;
    }

    public void setStatusUkt(String StatusSpk) {
        this.StatusSpk = StatusSpk;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public void getSudahSpk() {
        if (isRegistered == true) {
            System.out.println("Sudah Spk");

        } else {
            System.out.println("Belum Spk");
        }
    }
}
