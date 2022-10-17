package Tugas4Polymorphism;

import java.sql.Time;

public class JadwalApp {

    public static void main(String[] args) {
        //Pemanggilan Overriding

        Mahasiswa mhs = new Mahasiswa("Ario Febri");
        mhs.info();

        mhs = new Dosen("Alun Sujjada M.Kom");
        mhs.info();

        mhs = new MataKuliah("Pemrograman berorientasi Objek");
        mhs.info();

        waktu(100);
        waktu("10 Desember 2022");
        waktu("Rabu",7, "Pagi");
    }

    // =========== Overloading ==============
    static void waktu(int Wkt){
        System.out.println("Waktu Kuliah/M \t : " + Wkt);
    }

    static void waktu(String Wkt){
        System.out.println("Pada Tanggal \t : " + Wkt);
    }

    static void waktu(String hari, int Wkt, String waktu){
        System.out.println("Waktu \t\t\t : " + hari + ", Pukul " + Wkt + " " + waktu);
    }


}
