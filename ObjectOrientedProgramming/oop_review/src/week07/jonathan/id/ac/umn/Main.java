package week07.jonathan.id.ac.umn;

import java.util.Scanner;

public class Main {
	static Mahasiswa[] mahasiswas = new Mahasiswa[3];
	static Staff[] staffs = new Staff[1];
	static Matkul[] makuls = new Matkul[3];
	static int i = 0, j = 0, k = 0;

	public static void main(String[] args) {

		int pilihan = 0;
		String nik, nim;
		int nilaiuts = 0, nilaiuas = 0, nilaitugas = 0, kodemakul = 1;

		Scanner scanner = new Scanner(System.in);

		for (;;) {

			mahasiswas[0] = new Mahasiswa("Ari", "Jakarta", "19-11-1999", "12345", "Informatika", "Algoritma",
					makuls[0]);
			mahasiswas[1] = new Mahasiswa("Budi", "Bogor", "20-04-1999", "67890", "Informatika", "Database", makuls[0]);
			mahasiswas[2] = new Mahasiswa("Reza", "Bandung", "25-06-1999", "54321", "Informatika", "Sistem Operasi",
					makuls[0]);

			makuls[0] = new Matkul(1, 0, 0, 0);
			makuls[1] = new Matkul(1, 0, 0, 0);
			makuls[2] = new Matkul(1, 0, 0, 0);

			System.out.println("--------------Menu--------------");
			System.out.println("1. Mahasiswa");
			System.out.println("2. Staff");
			System.out.println("3. Keluar");

			pilihan = scanner.nextInt();

			if (pilihan == 1) {
				System.out.println("---------------Mahasiswa---------------");
				System.out.println("Masukkan NIM: ");
				scanner.nextLine();
				nim = scanner.nextLine();
				System.out.println("Masukkan Kode Matkul:");
				kodemakul = scanner.nextInt();

				for (int counter = 0; counter < 3; counter++) {
					if (nim == mahasiswas[counter].getNim()) {
						if (kodemakul == mahasiswas[counter].getMatkul().getKodeMakul()) {
							System.out.println("NilaiTugas: " + mahasiswas[counter].getMatkul().getNilaiTugas());
							System.out.println("Nilai UTS: " + mahasiswas[counter].getMatkul().getNilaiUTS());
							System.out.println("Nilai UAS: " + mahasiswas[counter].getMatkul().getNilaiUAS());
						}
					}
				}

			} else if (pilihan == 2) {
				System.out.println("---------------Staff [01]---------------");
				System.out.println("Masukkan NIK: ");
				scanner.nextLine();
				nik = scanner.nextLine();

				staffs[i] = new Staff("Andi", "Jakarta", "25-Maret-1990", nik);

				System.out.println("NIM Mahasiswa: ");
				nim = scanner.nextLine();

				System.out.println("Kode Makul: ");
				kodemakul = scanner.nextInt();

				System.out.println("---------------Staff [02]---------------");
				System.out.println("1. Nilai UTS");
				System.out.println("2. Nilai Tugas");
				System.out.println("3. Nilai UAS");
				System.out.println("4. Semua");
				System.out.println("Pilihan");
				pilihan = scanner.nextInt();

				if (pilihan == 1) {
					System.out.println("Masukkan nilai UTS");
					nilaiuts = scanner.nextInt();
				} else if (pilihan == 2) {
					System.out.println("Masukkan nilai Tugas");
					nilaitugas = scanner.nextInt();
				} else if (pilihan == 3) {
					System.out.println("Masukkan nilai UAS");
					nilaiuas = scanner.nextInt();
				} else if (pilihan == 4) {
					System.out.println("----------------Staff[03]----------------");
					System.out.println("Masukkan nilai UTS");
					nilaiuts = scanner.nextInt();
					System.out.println("Masukkan nilai Tugas");
					nilaitugas = scanner.nextInt();
					System.out.println("Masukkan nilai UAS");
					nilaiuas = scanner.nextInt();
				}

				makuls[kodemakul] = new Matkul(kodemakul, nilaiuts, nilaitugas, nilaiuas);

				for (i = 0; i < 3; i++) {
					if (nim == mahasiswas[i].getNim()) {
						mahasiswas[i] = new Mahasiswa(mahasiswas[i].getNama(), mahasiswas[i].getTmptlahir(),
								mahasiswas[i].getTanggalLahir(), mahasiswas[i].getNim(), mahasiswas[i].getProdi(),
								mahasiswas[i].getMatakuliah(), makuls[kodemakul]);
					}
				}

			} else if (pilihan == 3) {
				break;
			}
		}
		scanner.close();
	}
}
