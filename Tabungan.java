class Tabungan extends Rekening {
    private double bungaTahunan;

    public Tabungan(String namaPemilik, String nomorRekening, double saldo, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.bungaTahunan = bungaTahunan;
    }

    public void hitungBunga(int bulan) {
        double bungaDiterima = (getSaldo() * bungaTahunan / 100) * bulan / 12;
        setor(bungaDiterima);
        System.out.println("Bunga yang diterima: Rp " + bungaDiterima);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }
}
