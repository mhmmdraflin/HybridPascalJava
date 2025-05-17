/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author NITRO 5
 */
public class Main {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Belanja belanja = new Belanja();

        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlah = input.nextInt();
        input.nextLine(); // mengonsumsi newline

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nItem ke-" + i);
            System.out.print("Nama item: ");
            String nama = input.nextLine();
            System.out.print("Harga item (Rp): ");
            double harga = input.nextDouble();
            input.nextLine(); // mengonsumsi newline

            belanja.tambahItem(nama, harga);
        }

        belanja.tampilkanDaftarBelanja();
        System.out.println("\nTotal biaya belanja: Rp" + belanja.hitungTotal());
    }
}