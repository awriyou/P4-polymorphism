package Tugas4Polymorphism;

public class Mahasiswa {
    String nama;

    Mahasiswa(String nama){
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama Mahasiswa \t : " + this.nama);
    }
}
