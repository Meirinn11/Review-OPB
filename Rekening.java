public class Rekening {
    private String namaPemilik;
    private String nomorRekening;
    private double saldo;

    public void Rekening ( String namaPemilik, String nomorRekening, double saldo){
        this.namaPemilik= namaPemilik;
        this.nomorRekening= nomorRekening;
        this.saldo = saldo;
    }
    public String getnamaPemilik(){
        return namaPemilik;
    }
    public String getnomorRekening(){
        return nomorRekening;
    }
    public double getsaldo(){
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setor (double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println ("Setor : Rp "+ jumlah ){
        else (jumlah =< 0)
            saldo -= jumlah;
            System.out.println( "Setoran harus lebih dari 0");
        }
    }

    public void tarik (double jumlah){
    
    }

        //Tampilkan Info
        public void TampilkanInfo(){
            System.out.println ("================Informasi Bank====================");
            System.out.println ("Nama Rekening =" + namaPemilik);
            System.out.println("Nomor Rekening="+ nomorRekening);
            System.out.println ("Jumlah Saldo sekarang="+ saldo);
            System.out.println ("==================================================");
        }
    }