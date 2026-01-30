import java.util.Scanner;
import java.util.ArrayList;
public class transaksitoko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String>nama_barang = new ArrayList<>();
        ArrayList<Integer>harga = new ArrayList<>();
        ArrayList<String>kategori = new ArrayList<>();
        int pilihan;
        int pil_pro;
        double total = 0;
        String ulang = "Y";
        String kembali = "Y";
        String hpslgi = "Y";

        //Memilih Menu 
        do{
            System.out.println("========Pilih Menu========");
            System.out.println("1.Daftar Produk Toko");
            System.out.println("2.Cek Keranjang");
            System.out.println("3.Hapus Produk Dalam Keranjang");
            System.out.println("4.Total Belanjaan");
            System.out.println("5.Keluar");
            System.out.println("Masukkan Pilihan : ");
            pilihan = input.nextInt(); 

                //Memilih Produk
                switch(pilihan)
                {
                    case 1:
                        do{
                        System.out.println("\n==========Daftar Produk===========");
                        System.out.println("1.Nama : Keyboard\nHarga : Rp.50.000\nKategori : Elektronik");
                        System.out.println("\n2.Nama : Laptop\nHarga : Rp.2.500.000\nKategori : Elektronik");
                        System.out.println("\n3.Nama : Mouse\nHarga : Rp.100.000\nKategori : Elektronik");
                        System.out.println("\n4.Nama : Charger\nHarga : Rp.150.000\nKategori : Elektronik");
                        System.out.println("\n5.Nama : Stiker Keyboard\nHarga : 10.000\nKategori : Aksesoris");
                        System.out.println("Masukkan Pilihan : ");
                        pil_pro = input.nextInt();
                        
                        switch(pil_pro)
                        {
                        case 1:
                            nama_barang.add("Keyboard");
                            harga.add(50000);
                            kategori.add("Elektronik");
                            break;

                        case 2:
                            nama_barang.add("Laptop");
                            harga.add(2500000);
                            kategori.add("Elektronik");
                            break;

                        case 3:
                            nama_barang.add("Mouse");
                            harga.add(100000);
                            kategori.add("Elektronik");
                            break;

                        case 4:
                            nama_barang.add("Charger");
                            harga.add(150000);
                            kategori.add("Elektronik");
                            break;

                        case 5:
                            nama_barang.add("Stiker Keyboard");
                            harga.add(10000);
                            kategori.add("Aksesoris");
                            break;
                        
                        default:
                            System.out.println("=======Mohon Maaf Pilihan Tidak Tersedia=======");
                            System.out.println("==========Silahkan Pilih Ulang==========");
                            break;
                            }

                            System.out.println("Tambah Barang Lagi(Y/N): ");
                            ulang = input.next();

                        }while(ulang.equalsIgnoreCase("Y"));
                        break;

                    //Menampilkan Daftar Produk yang dipilih
                    case 2:
                        System.out.println("======Daftar Keranjang Anda==========");
                        for(int i = 0; i < nama_barang.size(); i++){
                            System.out.println("Nama Barang = " + nama_barang.get(i));
                            System.out.println("Harga Barang = " + harga.get(i));
                            System.out.println("Kategori = " + kategori.get(i));
                            System.out.println("======================================");
                        }
                        break;

                    //Menghapus Produk yang diinginkan
                    case 3:
                    do{
                        System.out.println("======Daftar Keranjang Anda======");
                        for(int i = 0; i < nama_barang.size(); i++){
                            System.out.println((i + 1) + "." + nama_barang.get(i));
                        }

                        System.out.println("Masukkan nomor produk yang ingin dihapus : ");
                        int hapus = input.nextInt();

                        int index = hapus - 1;

                        if(index >= 0 && index < nama_barang.size()){
                            nama_barang.remove(index);
                            harga.remove(index);
                            kategori.remove(index);

                            System.out.println("Barang Telah Dihapus");
                        }else{
                            System.out.println("Nomor barang yang dimasukkan tidak valid");
                        }
                        System.out.println("Apakah Anda Ingin Menghapus Produk Lagi(Y/n) : ");
                        hpslgi = input.next();

                    }while(hpslgi.equalsIgnoreCase("Y"));
                    break;

                    //Menghitung Total Harga Produk
                    case 4:
                        System.out.println("======Total Harga Barang yang Anda Beli======");

                        for(int i = 0; i < nama_barang.size(); i++){
                            System.out.println(nama_barang.get(i) + " = " + harga.get(i));
                            total += harga.get(i);
                        }
                        System.out.println("=====================");
                        System.out.println("Total Harga = " + total);

                        break;

                    case 5:
                        System.out.println("========Baiklah Anda Telah Selesai Berbelanja=======");
                        System.out.println("Ketik 'n' untuk Keluar");
                    }
                
                    
                System.out.println("Kembali Ke Menu Awal(Y/n) : ");
                kembali = input.next();
            
        } while(kembali.equalsIgnoreCase("Y"));
            System.out.println("=======Terima Kasih Sudah Berbelanja==========");
    }
}
