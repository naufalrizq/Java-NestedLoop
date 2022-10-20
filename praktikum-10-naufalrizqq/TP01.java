/**Algoritma
 * 1.Program meminta keluaran pola segitiga siku siku dengan menggunakan bintang(*)
 * 2.Program meminta segitiga dengan tinggi 5 dan alas 5
 * 3.Membuat perulangan yang akan memulai membentuk dari satu bintang ,dua bintang , tiga bintang, dst dan berhenti di bintang ke 5
 * 4.Tiap perulangan yang membentuk baris bintang lanjut ke perulangan selanjutnya di line baru
 * 5.Output hasil
 */

public class TP01 {

	public static void main(final String[] args) {
		for (int i = 1 ;  i <=5; i ++){
			for (int col=1; col <= i; col++){
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
