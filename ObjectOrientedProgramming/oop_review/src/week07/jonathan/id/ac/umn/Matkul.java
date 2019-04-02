package week07.jonathan.id.ac.umn;

public class Matkul {
	private int kodeMakul;
	private int nilaiTugas;
	private int nilaiUTS;
	private int nilaiUAS;
	
	public Matkul(int kodeMakul, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
		//super();
		this.kodeMakul = kodeMakul;
		this.nilaiTugas = nilaiTugas;
		this.nilaiUTS = nilaiUTS;
		this.nilaiUAS = nilaiUAS;
	}

	public int getKodeMakul() {
		return kodeMakul;
	}

	public int getNilaiTugas() {
		return nilaiTugas;
	}

	public int getNilaiUTS() {
		return nilaiUTS;
	}

	public int getNilaiUAS() {
		return nilaiUAS;
	}

	
}
