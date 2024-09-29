import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Class LaundryItem (representasi dari item laundry)
class LaundryItem {
    private final String customerName;
    private final String itemType;
    private final double weight; // weight in kg

    // Constructor
    public LaundryItem(String customerName, String itemType, double weight) {
        this.customerName = customerName;
        this.itemType = itemType;
        this.weight = weight;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getItemType() {
        return itemType;
    }

    public double getWeight() {
        return weight;
    }

    // Method untuk menampilkan detail item laundry
    public void displayItemDetails() {
        System.out.println("Customer: " + customerName + ", Item: " + itemType + ", Weight: " + weight + "kg");
    }
}

// Class LaundryService (berfungsi untuk melakukan CRUD)
class LaundryService {
    private static final ArrayList<LaundryItem> laundryList = new ArrayList<>();

    // Method untuk menambah item laundry
    public static void addLaundryItem(LaundryItem item) {
        laundryList.add(item);
        System.out.println("\nLaundry item added successfully!");
        displayAllItems(); // Tampilkan data setelah penambahan
    }

    // Method untuk menampilkan semua item laundry
    public static void displayAllItems() {
        if (laundryList.isEmpty()) {
            System.out.println("No laundry items available.");
        } else {
            System.out.println("\n=== All Laundry Items ===");
            for (LaundryItem item : laundryList) {
                item.displayItemDetails();
            }
            System.out.println("===========================");
        }
    }

    // Method untuk menambah data awal (5 record laundry)
    public static void addInitialData() {
        laundryList.add(new LaundryItem("Dinda", "Pakaian", 3.5));
        laundryList.add(new LaundryItem("Wilda", "Selimut", 5.0));
        laundryList.add(new LaundryItem("Rani", "Handuk", 2.3));
        laundryList.add(new LaundryItem("Indah", "Gorden", 6.7));
        laundryList.add(new LaundryItem("Fia", "Seprai", 4.1));
        System.out.println("\n5 Initial laundry items added.");
        displayAllItems(); // Tampilkan data awal
    }

    // Method untuk menghapus item laundry berdasarkan nama pelanggan
    public static void removeLaundryItem(String customerName) {
        boolean found = false;
        for (LaundryItem item : laundryList) {
            if (item.getCustomerName().equalsIgnoreCase(customerName)) {
                laundryList.remove(item);
                System.out.println("Laundry item for " + customerName + " removed successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No laundry item found for customer: " + customerName);
        }
        displayAllItems(); // Tampilkan data setelah penghapusan
    }

    // Method untuk memperbarui berat item laundry berdasarkan nama pelanggan
    public static void updateLaundryItem(String customerName, double newWeight) {
        boolean found = false;
        for (LaundryItem item : laundryList) {
            if (item.getCustomerName().equalsIgnoreCase(customerName)) {
                LaundryItem updatedItem = new LaundryItem(item.getCustomerName(), item.getItemType(), newWeight);
                laundryList.set(laundryList.indexOf(item), updatedItem);
                System.out.println("Laundry item weight updated successfully for " + customerName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No laundry item found for customer: " + customerName);
        }
        displayAllItems(); // Tampilkan data setelah pembaruan
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            // Tambah data awal (5 record)
            LaundryService.addInitialData();
            
            while (running) {
                System.out.println("\n=== Sistem Manajemen Laundry ===");
                System.out.println("1. Tambah Item Laundry");
                System.out.println("2. Lihat Semua Item Laundry");
                System.out.println("3. Hapus Item Laundry");
                System.out.println("4. Update Berat Item Laundry");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                
                int choice = getValidIntInput(scanner);
                
                switch (choice) {
                    case 1 -> {
                        // Tambah Item Laundry
                        System.out.print("Masukkan Nama Pelanggan: ");
                        String customerName = scanner.nextLine();
                        System.out.print("Masukkan Jenis Item (pakaian, selimut, dll): ");
                        String itemType = scanner.nextLine();
                        System.out.print("Masukkan Berat (kg): ");
                        double weight = getValidDoubleInput(scanner);
                        LaundryItem newItem = new LaundryItem(customerName, itemType, weight);
                        LaundryService.addLaundryItem(newItem);
                    }
                    
                    case 2 -> // Lihat Semua Item Laundry
                        LaundryService.displayAllItems();
                        
                    case 3 -> {
                        // Hapus Item Laundry
                        System.out.print("Masukkan Nama Pelanggan untuk dihapus: ");
                        String nameToRemove = scanner.nextLine();
                        LaundryService.removeLaundryItem(nameToRemove);
                    }
                    
                    case 4 -> {
                        // Update Berat Item Laundry
                        System.out.print("Masukkan Nama Pelanggan untuk diupdate: ");
                        String nameToUpdate = scanner.nextLine();
                        System.out.print("Masukkan Berat Baru (kg): ");
                        double newWeight = getValidDoubleInput(scanner);
                        LaundryService.updateLaundryItem(nameToUpdate, newWeight);
                    }
                    
                    case 5 -> {
                        // Keluar
                        System.out.println("Keluar dari sistem. Terima kasih!");
                        running = false;
                    }
                    
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }

    // Method untuk mendapatkan input integer yang valid
    private static int getValidIntInput(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                scanner.nextLine(); // Mengkonsumsi newline
                break;
            } catch (InputMismatchException e) {
                System.out.print("Masukkan angka yang valid: ");
                scanner.next(); // Membersihkan input yang tidak valid
            }
        }
        return input;
    }

    // Method untuk mendapatkan input double yang valid
    private static double getValidDoubleInput(Scanner scanner) {
        double input;
        while (true) {
            try {
                input = scanner.nextDouble();
                scanner.nextLine(); // Mengkonsumsi newline
                break;
            } catch (InputMismatchException e) {
                System.out.print("Masukkan berat dalam angka yang valid (kg): ");
                scanner.next(); // Membersihkan input yang tidak valid
            }
        }
        return input;
    }
}
