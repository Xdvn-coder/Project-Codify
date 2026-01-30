import java.util.Scanner;
public class pilgan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pil[] = new char[5];
        boolean jawab[] = new boolean[5];
        int benar = 0;
        int salah = 0;

        //Input nama dan kelas
        System.out.println("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.println("Masukkan Kelas : ");
        String kelas = input.nextLine();
        
        System.out.println("\n===========Kerjakan Soal Soal dibawah ini===========\n");

        //Soal 1
        System.out.println("Soal 1\nType data apa yang digunakan untuk menyimpan sebuah teks atau kata.....\n");
        System.out.println("A.String\nB.Int\nC.Char\nD.Bool\n");
        System.out.println("Masukkan Jawaban anda = ");
        pil[0] = input.next().charAt(0);
        if(Character.toLowerCase(pil[0]) == 'a') {jawab[0] = true;
        }

        //Soal 2
        System.out.println("\nSoal 2\nFungsi apa yang digunakan untuk mengulangi suatu aksi jika kondisi masih terpenuhi....");
        System.out.println("A.Fungsi if\nB.Fungsi for\nC.Fungsi switch\nD.Funsi array");
        System.out.println("Masukkan Jawaban : ");
        pil[1] = input.next().charAt(0);
        if(Character.toLowerCase(pil[1]) == 'b') {jawab[1] = true;
        }

        //Soal 3
        System.out.println("\nSoal 3\nEkstensi file yang benar untuk program C++ adalah....");
        System.out.println("A.java\nB.py\nC.cpp\nD.html");
        System.out.println("Masukkan Jawaban : ");
        pil[2] = input.next().charAt(0);
        if(Character.toLowerCase(pil[2]) == 'c') {jawab[2] = true;
        }

        //Soal 4
        System.out.println("\nSoal 4\nPerintah untuk mengambil input dari keyboard dalam C++ adalah....");
        System.out.println("A.cout\nB.cin\nC.Input\nD.scanf");
        System.out.println("Masukkan Jawaban : ");
        pil[3] = input.next().charAt(0);
        if(Character.toLowerCase(pil[3]) == 'b') {jawab[3] = true;
        }

        //Soal 5
        System.out.println("\nSoal 5\nFungsi dari cout adalah....");
        System.out.println("A.Mengambil input dari user\nB.Menampilkan output ke layar\nC.Menghitung data\nD.Menyimpan data");
        System.out.println("Masukkan Jawaban : ");
        pil[4] = input.next().charAt(0);
        if(Character.toLowerCase(pil[4]) == 'b') {jawab[4] = true;
        }

        System.out.println("============JAWABAN YANG TERSIMPAN============");

        //Menyimpan Jawaban
        for(int i = 1; i <= 5; i++) {
            System.out.println("Jawaban anda nomor " + i + " = " + pil[i-1]);

        }

        //Cek Benar dan Salah
        for(int j = 0; j < 5; j++){
            if(jawab[j]){
                benar++;
            }else{
                salah++;
            }
        }

        System.out.println("============Total Nilai==============");
        System.out.println("Jumlah soal = 5");
        System.out.println("Jumlah salah = " + salah);
        System.out.println("Jumlah Benar = " + benar);

        //Menghitung Skor
        int nilai;
        nilai = benar;
        nilai *= 20;
        System.out.println("Total Skor = " + nilai);

    }
}