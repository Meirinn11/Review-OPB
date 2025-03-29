import java.util.ArrayList;
import java.util.Scanner;

class Rekening {
    private String namaPemilik;
    private String nomorRekening;
    private double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor : Rp " + jumlah);
        } else {
            System.out.println("Setoran harus lebih dari 0");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik : Rp " + jumlah);
        } else {
            System.out.println("Tarikan tidak valid atau saldo tidak cukup");
        }
    }

    public void tampilkanInfo() {
        System.out.println("================ Informasi Rekening ====================");
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println("========================================================");
    }
}