public class PertemuanTiga {
    public static void main(String[] args) {
          // Membuat Objek
        Mahasiswa Anton = new Mahasiswa();
        Mahasiswa Riko = new Mahasiswa();
        
        /* memanggil atribut dan memberi nilai */
        
        // Mahasiswa
        Anton.nim = "2101998";
        Anton.nama = "Anton";
        Anton.jenisKelamin = "Pria";
        Anton.umur = 23;
        Anton.alamat = "Bulakkapal";
        Anton.jurusan = "Teknik Informatika";
        
        Anton.cetakInfo();
        
        Riko.nim = "2101997";
        Riko.nama = "Riko";
        Riko.jenisKelamin = "Pria";
        Riko.umur = 27;
        Riko.alamat = "Telaga Asih";
        Riko.jurusan = "Hukum";
        
        Riko.cetakInfo();
    }
}