/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

import entities.LaundryOrder;
import java.util.ArrayList;

public class LaundryManager {
    private final ArrayList<LaundryOrder> orders;

    // Constructor
    public LaundryManager() {
        orders = new ArrayList<>();
    }

    // Menambah pesanan laundry
    public void addOrder(LaundryOrder order) {
        orders.add(order);
        System.out.println("Pesanan berhasil ditambahkan.");
    }

    // Menghapus pesanan laundry berdasarkan ID
    public void removeOrder(String orderId) {
        boolean found = false;
        for (LaundryOrder order : orders) {
            if (order.getOrderId().equals(orderId)) {
                orders.remove(order);
                System.out.println("Pesanan dengan ID: " + orderId + " berhasil dihapus.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pesanan dengan ID: " + orderId + " tidak ditemukan.");
        }
    }

    // Menampilkan semua pesanan laundry
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Tidak ada pesanan yang tersedia.");
        } else {
            System.out.println("Daftar Pesanan Laundry:");
            for (LaundryOrder order : orders) {
                System.out.println(order.displayOrderInfo());
            }
        }
    }

    // Memperbarui pesanan berdasarkan ID
    public void updateOrder(String orderId, String newServiceType) {
        boolean found = false;
        for (LaundryOrder order : orders) {
            if (order.getOrderId().equals(orderId)) {
                // Update jenis layanan
                order.setServiceType(newServiceType);
                System.out.println("Pesanan dengan ID: " + orderId + " berhasil diperbarui.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pesanan dengan ID: " + orderId + " tidak ditemukan.");
        }
    }
}
