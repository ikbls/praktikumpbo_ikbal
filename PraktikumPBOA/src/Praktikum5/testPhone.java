package Praktikum5;

import java.util.Scanner;

public class testPhone {
	public static void main(String[]args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Masukkan Nama Hp : ");
		nama = input.next();
		
		System.out.print(" Masukkan Warna : ");
		warna = input.next();
		
		System.out.print(" Masukkan Berat : ");
		berat = input.nextInt();
		
		Samsung Hp = new Samsung();
		Hp.spesifikasi(nama, warna, berat);
		System.out.println(" Nama Hp Adalah "+Hp.getName()
							+" Warnanya "+Hp.getWarna()
							+" Beratnya "+Hp.getBerat()+" gram "+" Layar ");
					Hp.layar();
	}
}
