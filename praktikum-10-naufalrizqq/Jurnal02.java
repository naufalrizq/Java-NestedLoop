/**Algoritma
 * 1.Meminta masukkan bilangan bulat dari angka 1-10
 * 2.Program meminta tabel perkalian sesuai dengan bilbul yang diinput
 * 3.Membuat outer loop (i) dengan kondisi yang akan berhenti di angka 10(untuk perkalian) //increment 1
 * 4.Membuat inner loop(j) dengan kondisi akan berhenti sesuai dengan bilbul yang diinput //increment 1
 * 5.Isi statement j adalah, sysout i * j + ("\t" untuk membuat tab agar berjarak)
 * 6.Cetak hasil
 * 
 */
import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int bilbul = s.nextInt();
		
		for (int i = 1; i <= 10 ; i++) {

			for(int j = 1; j <= bilbul; j++){
 
				System.out.print( i * j + " ");
			}
			System.out.print("\n");
		}
	}
}
