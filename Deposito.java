class Deposito extends Rekening {
    private int jangkaWaktuBulan;
    private double sukuBunga;

    public Deposito(String namaPemilik, String nomorRekening, double saldo, int jangkaWaktuBulan, double sukuBunga) {
        super(namaPemilik, nomorRekening, saldo);
        this.jangkaWaktuBulan = jangkaWaktuBulan;
        this.sukuBunga = sukuBunga;
    }

    @Override
    public void tarik(double jumlah) {
        // Penarikan sebelum jatuh tempo dikenakan denda
        if (jumlah > 0 && jangkaWaktuBulan > 0) {
            double denda = jumlah * 0.1; // Denda 10%
            System.out.println("Tarik sebelum jatuh tempo, denda: Rp " + denda);
            if (jumlah + denda <= getSaldo()) {
                super.tarik(jumlah + denda);
            } else {
                System.out.println("Saldo tidak cukup untuk melakukan penarikan dan denda.");
            }
        } else {
            System.out.println("Tarikan tidak valid.");
        }
    }

    public void hitungBunga() {
        double bungaDiterima = (getSaldo() * sukuBunga / 100);
        setor(bungaDiterima);
        System.out.println("Bunga yang diterima: Rp " + bungaDiterima);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jangka Waktu: " + jangkaWaktuBulan + " bulan");
        System.out.println("Suku Bunga: " + sukuBunga + "%");
    }
}