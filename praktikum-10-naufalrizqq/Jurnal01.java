/**Algoritma
 * 1.Program meminta membuat pola bintang sesuai dengan soal
 * 2.Membuat outer loop(i) dengan dengan inisialisasi 1 dan kondisi 1
 * 3.Membuat inner loop (j) dengan inisialisasi 1 dan kondisi berakhir di 6 
 * 4.Jika j habis dibagi 2 maka cetak 6 bintang dengan spasi didepannya
 * 5.Jika j tidak habis dibagi 2 maka cetak 6 bintang dengan spasi dibelakang
 * 6.Output hasil
 */

public class Jurnal01 {

	public static void main(final String[] args) {
		for(int i = 1; i <= 1; i++){
			for(int j = 1; j<=6; j++){
				if (j % 2 == 0){
					System.out.println(" * * * * *");
				}else{
					if(j % 2 != 0){
						System.out.println("* * * * * ");
					}
				}

	        }
        }
	}
}

