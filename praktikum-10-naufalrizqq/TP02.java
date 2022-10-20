/**Algoritma
 * 1.Meminta masukkan bilangan bulat dari 1-10(bilbul)
 * 2.Program meminta membentuk pola segitiga siku siku ke arah kiri yang panjangnya sesuai dari jumlah bilbul yang diinput
 * 3.Kondisi pada outer loop(i) diganti dengan inputan bilbul
 * 4.Lalu,di bagian inner loop (j) inisialisasi awalnya diganti dengan bilbul-1 lalu dibuat incrementnya berkurang
 * 5.Membuat perulangan lagi yang berfungsi untuk mencetak bintang
 * 6.Output hasil 
 * 
 */

import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int bilbul = s.nextInt();
		for (int i=1; i <= bilbul; i ++){
			for (int j=bilbul-1; j >=i; j-- ){
				System.out.print(" ");
			}
			for (int b = 1; b <=i; b++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
