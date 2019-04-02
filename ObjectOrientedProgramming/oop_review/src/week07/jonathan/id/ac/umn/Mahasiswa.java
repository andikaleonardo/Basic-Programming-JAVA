package week07.jonathan.id.ac.umn;

public class Mahasiswa extends Orang {
	
	private String nim;
	private String prodi;
	private String matakuliah;
	private Matkul matkul;
	
	public Mahasiswa() {
		
	}


	public Mahasiswa(String nama, String tmptlahir, String tanggalLahir, String nim, String prodi, String matakuliah, Matkul matkul) {
		super(nama, tmptlahir, tanggalLahir);
		this.nim = nim;
		this.prodi = prodi;
		this.matakuliah = matakuliah;
		this.matkul = matkul;
		// TODO Auto-generated constructor stub
	}


	public String getNim() {
		return nim;
	}


	public String getProdi() {
		return prodi;
	}


	public String getMatakuliah() {
		return matakuliah;
	}


	public Matkul getMatkul() {
		return matkul;
	}


}
