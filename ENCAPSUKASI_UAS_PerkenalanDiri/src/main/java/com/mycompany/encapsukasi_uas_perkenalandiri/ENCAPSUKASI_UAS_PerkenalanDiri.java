/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.encapsukasi_uas_perkenalandiri;

/**
 *
 * @author ASUS
 */
public class ENCAPSUKASI_UAS_PerkenalanDiri {

    public static void main(String[] args) {
       Mahasiswa m = new Mahasiswa();
        m.setnama           ("AMALYA SYOHIBA");
        m.setjurusan        ("Rekayasa Perangkat Lunak");
        m.setmatkul         ("Pemrograman Berorientasi Objek");
        m.setnim            ("21090081");
        
        System.out.println("Nama    : "+m.getnama());
        System.out.println("Jurusan : "+m.getjurusan());
        System.out.println("Matkul  : "+m.getmatkul());
        System.out.println("Nim     : "+m.getnim());
           
    }
}
