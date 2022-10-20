/**Algoritma
 * 1.Membuat program seperti pola yang ditentukan
 * 2.Meminta masukan bilangan bulat n dari 1 < N < 100
 * 3.inisialisasi mulai dari 0
 * 4.Membuat outer loop (i) yang akan berhenti jika kondisi sudah mencapai input (n)
 * 5.Membuat inner loop (j) yang ber increment mulai + 1 dan berhenti saat kondisi sudah terpenuhi
 * 6.Outer loop (j) berisi statement cetak mulai habis dibagi 10
 * 7.Output hasil
 */
import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int mulai = 0;
		for ( int i = 1; i <= n; i++) {
			for ( int j = 1; j <= i; j++, mulai++)
			System.out.print(mulai % 10);
			System.out.println();
			}
	}
}
