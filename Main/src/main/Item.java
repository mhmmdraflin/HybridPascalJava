/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author NITRO 5
 */
public class Item {
    private final String nama;
    private final double harga;

    public Item(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanItem() {
        System.out.println("Nama Item: " + nama + " | Harga: Rp" + harga);
    }
}

