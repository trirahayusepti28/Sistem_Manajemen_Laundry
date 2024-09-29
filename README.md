# Sistem_Manajemen_Laundry

Nama : Tri Rahayu Septiyani
NIM  : 2309116004

# Penjelasan Program 
## Struktur Program:
  Program ini dibagi menjadi tiga bagian utama:
  - Class LaundryItem: Mewakili item laundry yang dimasukkan ke dalam   
     sistem. Setiap item memiliki properti:
        customerName (nama pelanggan)
        itemType (jenis item laundry, seperti pakaian atau selimut)
        weight (berat item dalam kilogram)
  - Class LaundryService: Bertanggung jawab atas manajemen item laundry   
      menggunakan ArrayList. Fungsinya meliputi:
        Menambahkan item laundry.
        Menampilkan semua item laundry.
        Menghapus item laundry berdasarkan nama pelanggan.
        Memperbarui berat item laundry.
  - Class Main: Berisi metode main yang menjalankan interaksi utama     
       dengan pengguna melalui menu.
## Fitur Program:
### 1. CRUD:
- Create: Pengguna dapat menambahkan item laundry dengan memasukkan nama 
  pelanggan, jenis item, dan berat item.
- Read: Menampilkan semua item laundry yang tersimpan.
- Update: Mengubah berat item laundry berdasarkan nama pelanggan.
- Delete: Menghapus item laundry berdasarkan nama pelanggan.
### 2. Percabangan: 
Program menggunakan percabangan switch-case untuk memproses pilihan menu yang dimasukkan oleh pengguna.
### 3. Static Keyword: 
LaundryService menggunakan variabel dan metode statis untuk mengelola daftar laundry secara global, sehingga data tetap konsisten di seluruh program.
### 4. ArrayList: 
Data laundry disimpan dalam ArrayList bernama laundryList, yang memudahkan penambahan, penghapusan, dan pembaruan item.
### 5. Perulangan (for-each): 
Digunakan untuk menampilkan semua item laundry yang ada dalam ArrayList.
### 6. Validasi Input: 
Terdapat pengecekan untuk memastikan bahwa input yang diberikan oleh pengguna adalah angka yang valid untuk pilihan menu dan berat laundry.
## Penjelasan Fungsional:
### 1. Input Validation:
Untuk menghindari error, program menggunakan metode getValidIntInput() dan getValidDoubleInput() yang memvalidasi apakah input merupakan angka yang valid sebelum diproses.
### 2. Scanner: 
Digunakan untuk mengambil input dari pengguna, seperti pilihan menu, nama pelanggan, jenis item laundry, dan berat item.
### 3. Opsi Menu: 
Pengguna dapat memilih opsi di antara:
1. Menambahkan item laundry.
2. Melihat semua item laundry.
3. Menghapus item berdasarkan nama pelanggan.
4. Mengubah berat item laundry.
5. Keluar dari program.
## Poin Teknis:
- ArrayList digunakan untuk menyimpan objek LaundryItem.
- Konstruktor di class LaundryItem digunakan untuk inisialisasi nilai saat objek dibuat.
- Static Keyword di class LaundryService memungkinkan pengelolaan data laundry dilakukan tanpa membuat instance class.
- For-each Loop mempermudah iterasi melalui laundryList untuk menampilkan data laundry.
## Alur Program:
1. Program menampilkan menu utama.
2. Pengguna memilih opsi.
3. Berdasarkan pilihan, program akan meminta input tambahan (misalnya, nama pelanggan atau berat item).
4. Program memproses input menggunakan metode yang sesuai dari LaundryService.
5. Setelah selesai, menu ditampilkan kembali hingga pengguna memilih opsi untuk keluar.
6. Program ini merupakan contoh sederhana dari sistem manajemen berbasis Java yang mencakup berbagai fitur dasar pemrograman, seperti percabangan, loop, ArrayList, dan validasi input.
# Deskripsi Program
## Tampilan Menu Utama
![image](https://github.com/user-attachments/assets/9660b882-ec04-44d5-81dc-9ad9e597ff3d)

## Create
![image](https://github.com/user-attachments/assets/504241a3-2231-4025-b923-6a1271ed2069)

## Read
![image](https://github.com/user-attachments/assets/86a81685-93b5-4cc8-9e92-a8474321d448)

## Update
![image](https://github.com/user-attachments/assets/ba82cbe6-ce64-4704-af82-9d4e36ac8bee)

## Delete
![image](https://github.com/user-attachments/assets/19a4c3ac-11e5-4c4e-ad43-916c116b0e2b)





