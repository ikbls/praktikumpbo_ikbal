package Praktikum5;

public abstract class Phone {
	protected static String name;
	protected abstract void layar();
}
class Samsung extends Phone{
	String warna;
	int berat;
	public void spesifikasi(String namaHp, String warnaHp, int beratHp) {
		Samsung.name = namaHp;
		warna = warnaHp;
		berat = beratHp;
	}
	public void layar() {
		System.out.println(Samsung.name + " Amoled ");
	}
	String getName() {
		return Samsung.name;
	}
	String getWarna(){
		return warna;
	}
	int getBerat() {
		return berat;
	}
}
