package Praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		inisialisai scanner input
		Scanner input = new Scanner(System.in);
		String namaDepan, namaBelakang, fullName, npm;
		
		System.out.println("Nama depan: ");
		namaDepan = input.next();
		System.out.println("Nama belakang: ");
		namaBelakang = input.next();
		fullName = namaDepan + " " + namaBelakang;
		
		System.out.println("NPM: ");
		npm = input.next();
		
		System.out.println("Nama : "+fullName);
		System.out.println("Npm : "+npm +"\n");
//		inisialisasi variabel
		int angka1, angka2, hasil;

//		user input
		System.out.print("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.print("Masukan Angka 2 : ");
		angka2 = input.nextInt();
//		perhitungan hasil
		hasil = angka1 + angka2;
//		output
		System.out.println("Hasilnya : "+hasil);
		
	}

}
