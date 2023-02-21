/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi_uas;

/**
 *
 * @author ASUS
 */
public class LingkaranPublic {
   public double r;
    public double luas;
    
    public void LingkaranPublic(int r) {
        this.r = r;
    }
    public double r() {
        return r;
    } 
    public double Luas() {
        luas = 3.14 * r * r;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Jari-jari           : "+r+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
        return luas;
    } 
}
