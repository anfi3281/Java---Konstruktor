// Kelompok 3
// Anggota :
// 1. Azriel Oktaviansyah (101210051)
// 2. Risma Auliyak (101210055)
// 3. Fidya Aprilia (101210037)
// 4. Randi Afif (101210072)

// Ini adalah class PersegiPanjang
class PersegiPanjang{
    // Ini adalah deklarasi variabel punyanya class PersegiPanjang
    private int panjang ;
    private int lebar ;

    // Ini adalah konstruktor class PersegiPanjang tanpa parameter
    public PersegiPanjang(){
        // Output Judul Program
        System.out.println("...........Belajar Konstruktor...........\n");
        System.out.println("         Program Persegi Panjang         \n");
        System.out.println("-----------------------------------------\n");
    }

    // Ini adalah konstruktor class PersegiPanjang dengan parameter
    public void masukan(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Ini adalah method getLuas
    double getLuas(){
        return this.panjang*this.lebar;
    }

    // Ini adalah method getKeliling
    double getKeliling(){
        return (2*this.panjang)+(2*this.lebar);
    }
   
}

// Ini adalah Class HitungPersegiPanjang
public class HitungPersegiPanjang {
    public static void main(String[] args) throws Exception {
        // Deklarasi variabel panjang dan lebar
        // Tujuannya agar mudah digunakan tanpa mengetik banyak-banyak
        int panjang = 8, lebar = 9;

        // Pemanggilan class PersegiPanjang
        PersegiPanjang persegipanjang = new PersegiPanjang();

        // Penggunaan konstruktor masukan
        persegipanjang.masukan(8,9);

        // Output dari Program
        System.out.println("Panjang persegi panjang : " + panjang + "\n");
        System.out.println("Lebar persegi panjang : " + lebar + "\n");
        System.out.println("Luas persegi panjang adalah : " + persegipanjang.getLuas() + "\n");
        System.out.println("Keliling persegi panjang adalah : " + persegipanjang.getKeliling() + "\n");
    }
}
