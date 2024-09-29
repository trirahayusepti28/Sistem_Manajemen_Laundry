/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

public class LaundryOrder {
    private final String orderId;
    private final String customerName;
    private String serviceType;
    public static int totalOrders = 0;

    // Constructor
    public LaundryOrder(String orderId, String customerName, String serviceType) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.serviceType = serviceType;
        totalOrders++;
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    // Setter for updating service type
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    // Method untuk menampilkan informasi pesanan
    public String displayOrderInfo() {
        return "ID: " + orderId + ", Pelanggan: " + customerName + ", Layanan: " + serviceType;
    }
}
