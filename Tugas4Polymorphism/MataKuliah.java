package Tugas4Polymorphism;

public class MataKuliah extends Dosen{
    String nama;

    MataKuliah(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Mata Kuliah \t : " + this.nama);
    }
}
