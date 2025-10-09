
# StudentApp

Aplikasi sederhana berbasis **Java Console** untuk mengelola data mahasiswa.  
Proyek ini dibuat sebagai **tugas kuliah** 

---

Fitur:
**Tambah Data Mahasiswa** – Input NIM, Nama, Tanggal Lahir, dan Alamat.
**Lihat Daftar Mahasiswa** – Menampilkan seluruh data mahasiswa yang telah tersimpan.
**Hapus Data Mahasiswa** – Menghapus data mahasiswa berdasarkan NIM.
**Penyimpanan Sementara** – Data disimpan sementara menggunakan `ArrayList` di memori.

## Cara Menjalankan Program
1. Pastikan telah menginstal **Java 17** atau versi yang lebih baru.  
2. Buka terminal di folder proyek.  
3. Jalankan perintah berikut untuk mengompilasi kode:
   ```bash
   javac src/*.java
4. Lalu jalankan program: 
java -cp src StudentManagementApp
5. Atau bisa juga dengan Run class StudentManagementApp.java pada VSCode

## Contoh Hasil Output di Console
=== Student Management Menu ===
1. Add Student
2. List Students
3. Delete Student by NIM
99. Exit
Choose option: 1
Enter NIM: 2311500025
Enter Name: Rayhan
Enter Date of Birth (YYYY-MM-dd): 2005-03-02
Enter Address: Tangerang
Student added successfully!

=== Student Management Menu ===
1. Add Student
2. List Students
3. Delete Student by NIM
99. Exit
Choose option: 2

=== List of Students ===
Student {NIM=2311500025, Name=Rayhan, DOB=2005-03-02, Address=Tangerang}

=== Student Management Menu ===
1. Add Student
2. List Students
3. Delete Student by NIM
99. Exit
Choose option: 3
Enter NIM of student to delete: 2311500025
Student with NIM 2311500025 deleted successfully.

=== Student Management Menu ===
1. Add Student
2. List Students
3. Delete Student by NIM
99. Exit
Choose option: 99
Goodbye!