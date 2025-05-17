/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;
/**
 *
 * @author NITRO 5
 */
public class Belanja {
    private final ArrayList<Item> daftarItem;

    public Belanja() {
        daftarItem = new ArrayList<>();
    }

    public void tambahItem(String nama, double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak valid. Item tidak ditambahkan.");
            return;
        }
        Item item = new Item(nama, harga);
        daftarItem.add(item);
    }

    public void tampilkanDaftarBelanja() {
        System.out.println("\n=== Daftar Belanja ===");
        for (Item item : daftarItem) {
            item.tampilkanItem();
        }
    }

    public double hitungTotal() {
        double total = 0;
        for (Item item : daftarItem) {
            total += item.getHarga();
        }
        return total;
    }
}