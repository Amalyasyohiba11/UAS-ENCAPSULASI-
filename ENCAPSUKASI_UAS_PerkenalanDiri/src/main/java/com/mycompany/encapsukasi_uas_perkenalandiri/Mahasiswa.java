/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsukasi_uas_perkenalandiri;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
     private String jurusan;
    private String matkul;
    private String nama;
    private String nim;
    
    public void setjurusan(String newValue){
        jurusan =newValue;
    }
    public void setmatkul(String newValue){
        matkul =newValue;
    }
    public void setnama(String newValue){
        nama =newValue;
    }
    public void setnim(String newValue){
        nim =newValue;
    }
    
    public String getjurusan(){
        return jurusan;
    }
    public String getmatkul(){
        return matkul;
    }
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
}
