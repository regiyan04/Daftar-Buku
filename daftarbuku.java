import java.util.*;

class Buku {
    String judul;
    String penulis;
    int kategori;

    public Buku(String judul, String penulis, int kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public String toString() {
        return "Judul: " + judul + " | Penulis: " + penulis + " | Kategori: " + kategori;
    }
}

class Perpustakaan {
    List<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, String penulis, int kategori) {
        Buku bukuBaru = new Buku(judul, penulis, kategori);
        daftarBuku.add(bukuBaru);
    }

    public List<Buku> cariBukuBerdasarkanKategori(int kategori) {
        List<Buku> hasilPencarian = new ArrayList<>();
        for (Buku buku : daftarBuku) {
            if (buku.kategori == kategori) {
                hasilPencarian.add(buku);
            }
        }
        return hasilPencarian;
    }
}

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku("Judul Buku 1", "Penulis A", 1);
        perpustakaan.tambahBuku("Judul Buku 2", "Penulis B", 2);
        perpustakaan.tambahBuku("Judul Buku 3", "Penulis C", 1);
        perpustakaan.tambahBuku("Judul Buku 4", "Penulis D", 3);
        perpustakaan.tambahBuku("Judul Buku 5", "Penulis E", 4);

        int kategoriYangDicari = 1; // Ganti dengan nomor kategori yang ingin dicari

        List<Buku> hasilPencarian = perpustakaan.cariBukuBerdasarkanKategori(kategoriYangDicari);

        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ada buku dalam kategori tersebut.");
        } else {
            System.out.println("Daftar buku dalam kategori " + kategoriYangDicari + ":");
            for (Buku buku : hasilPencarian) {
                System.out.println(buku);
            }
        }
    }
}


