import java.util.Scanner;
public class polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String balik = "";

        //Input Kata Atau Angka
        System.out.println("Masukkan Kata = ");
        String kata = input.nextLine();

        //Mengecek Tiap Kata atau Angka
        for(int i = kata.length() - 1; i >= 0; i--) {
        balik += kata.charAt(i);
        }

        //Output Poliandrome
        if(kata.equals(balik)){
            System.out.println("Kata "+ kata + " = " + balik + "\nSebuah Kata Polindrome");

        }else{
            System.out.println("Kata "+ kata + " = " + balik + "\nBukan Sebuah Kata Polindrome");
        }

    }
}
