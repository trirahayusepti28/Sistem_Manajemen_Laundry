/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

import entities.LaundryOrder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaundryManager manager = new LaundryManager();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            while (running) {
                System.out.println("\n=== Sistem Manajemen Laundry ===");
                System.out.println("1. Tambah Pesanan");
                System.out.println("2. Hapus Pesanan");
                System.out.println("3. Tampilkan Semua Pesanan");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Menangani newline character
                
                switch (choice) {
                    case 1 -> {
                        // Tambah pesanan
                        System.out.print("Masukkan ID Pesanan: ");
                        String orderId = scanner.nextLine();
                        System.out.print("Masukkan Nama Pelanggan: ");
                        String customerName = scanner.nextLine();
                        System.out.print("Masukkan Jenis Layanan (Cuci Kering/Setrika/Dry Cleaning): ");
                        String serviceType = scanner.nextLine();
                        LaundryOrder order = new LaundryOrder(orderId, customerName, serviceType);
                        manager.addOrder(order);
                    }
                        
                    case 2 -> {
                        // Hapus pesanan
                        System.out.print("Masukkan ID Pesanan yang akan dihapus: ");
                        String removeId = scanner.nextLine();
                        manager.removeOrder(removeId);
                    }
                        
                    case 3 -> // Tampilkan semua pesanan
                        manager.displayOrders();
                        
                    case 4 -> {
                        // Keluar
                        System.out.println("Keluar dari sistem.");
                        running = false;
                    }
                        
                    default -> System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }
}

