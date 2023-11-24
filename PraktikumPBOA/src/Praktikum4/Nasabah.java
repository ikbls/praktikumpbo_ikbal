package Praktikum4;

public class Nasabah {
	public String namaDepan;
	public String namaBelakang;
	public Tabungan tabungan;
	
	public Nasabah(String namaDepan, String namaBelakang) {
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
	}
	public String getnamadepan() {
		return namaDepan;
	}
	public String getnamabelakang() {
		return namaBelakang;
	}
	public Tabungan getTabungan() {
		return tabungan;
	}
	public void setTabungan(Tabungan tabungan) {
		this.tabungan = tabungan;
	}
		

}
