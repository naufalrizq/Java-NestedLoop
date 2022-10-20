/**Algoritma
 * 1.Program meminta deret bilangan prima dari 1 hingga 100
 * 2.Inisialisasi bilangan prima (bipr = " ")
 * 3.Membuat outer loop (i) untuk membuat deret angka 1 - 100 yang nantinya akan diseleksi
 * 4.Inisialisasi prima dengan 0
 * 5.Membuat inner loop(j) yang berguna untuk menentukan bilangan prima jika i modulus j = 0 maka prima +1
 * 6.Jika prima = 2 maka bipr + i + " "
 * 7.cetak bipr
 */

public class TP03 {

	public static void main(final String[] args) {
		String bipr = " ";

		for (int i= 1; i <= 100; i++){
			int prima = 0;
			for (int j = i; j>=1 ; j--){
				if(i % j == 0 ){
					prima+= 1 ;
				}
			}
			if (prima == 2){
				bipr+= i + " " ;
			}
				
			}
			System.out.println(bipr);
		}
	}

