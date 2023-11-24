package praktikum2;
import java.util.Scanner;

public class pengkondisianSwitch {
	public static void main(String args[]) {
//		inisialisasi
		int angka1, angka2, hasil;
		String perhitungan;
		Scanner input= new Scanner(System.in);
//	input user
		System.out.print("masukan angka 1: ");
		angka1 = input.nextInt();
		System.out.print("masukan angka 2: ");
		angka2 = input.nextInt();
		System.out.print("List perhitungan: "
				+ "\n + : pertambahan"
				+ "\n - : pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n masukan angka perhitungan : ");
		perhitungan = input.nextInt();
//		kondisi SWITCH
		switch(perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		default:
			System.out.println();
		}
	}

}
