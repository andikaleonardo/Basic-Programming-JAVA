package week07.jonathan.id.ac.umn;


public class Orang {
	protected String nama;
	protected String tmptlahir;
	protected String TanggalLahir;
	
	public Orang () {
		
	}
	
	public Orang(String nama, String tmptlahir, String tanggalLahir) {
		//super();
		this.nama = nama;
		this.tmptlahir = tmptlahir;
		this.TanggalLahir = tanggalLahir;
	}

	public String getNama() {
		return nama;
	}

	public String getTmptlahir() {
		return tmptlahir;
	}

	public String getTanggalLahir() {
		return TanggalLahir;
	}
	
}
