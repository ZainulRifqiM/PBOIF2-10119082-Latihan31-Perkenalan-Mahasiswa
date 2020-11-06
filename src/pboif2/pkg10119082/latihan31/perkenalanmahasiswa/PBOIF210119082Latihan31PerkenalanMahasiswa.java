/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Perkenalan Mahasiswa
 */
public class PBOIF210119082Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa ();
        
        mhs.nim = "10119081";
        mhs.nama = "Muhammad Elza";
        mhs.perkenalkanDiri();
        
        mhs.nim = "10119082";
        mhs.nama = "Zainul Rifqi";
        mhs.perkenalkanDiri();

        mhs.nim = "10119083";
        mhs.nama = "Rafsan Zen";
        mhs.perkenalkanDiri();

        mhs.nim = "10110904";
        mhs.nama = "Idris Mardefi";
        mhs.perkenalkanDiri();

        
        
    }
    
}
