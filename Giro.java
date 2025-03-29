class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= getSaldo() + limitPenarikan) {
            super.tarik(jumlah);
        } else {
            System.out.println("Tarikan melebihi limit penarikan.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Limit Penarikan: Rp " + limitPenarikan);
    }
}

