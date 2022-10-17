package Tugas4Polymorphism;

public class Dosen extends Mahasiswa{
    String nama;

    Dosen(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama Dosen \t\t : " + this.nama);
    }
}
