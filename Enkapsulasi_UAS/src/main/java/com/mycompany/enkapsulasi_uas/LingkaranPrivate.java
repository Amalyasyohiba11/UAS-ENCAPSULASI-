/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi_uas;

/**
 *
 * @author ASUS
 */
public class LingkaranPrivate {
    private double r;
    private double luas;
    
    private void LingkaranPublic(int r) {
        this.r = r;
    }
    private double r() {
        return r;
    } 
    private double Luas() {
        luas = 3.14 * r * r;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Jari-jari           : "+r+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
        return luas;
    }
    public static void main(String[] args) {
        LingkaranPublic luas = new LingkaranPublic();
        luas.LingkaranPublic(7);
        luas.Luas();
    }

}
