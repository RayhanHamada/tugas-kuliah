/*
 * By RayhanHamada|Hahamada
 */
import java.util.Scanner;

public class SistemInformasiPerhotelan {

	public static void main(String... args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("------ SISTEM INFORMASI PERHOTELAN ------\n");
		System.out.print("Nama Pelanggan		: ");
		
		String namaPelanggan = scanner.nextLine(), jenisKamarString = "";
		boolean inputValid = false;
		int jenisKamar = 0,jumlahHari = 0, status = 0, diskon = 0;
		float harusDibayar = 0, hargaKamar = 0 ;
		
		while (!inputValid)
		{
			System.out.println("\nPilih Jenis Kamar");
			System.out.println("1. Deluxe Room Rp. 275.000/hari");
			System.out.println("2. Suite Room Rp. 300.000/hari");
			System.out.println("3. President Room 370.000/hari");
			
			System.out.print("Jenis kamar yang dipesan	: ");
			jenisKamar = Integer.parseInt(scanner.nextLine());
			
			if (jenisKamar == 1)
			{
				hargaKamar = 275000;
				inputValid = true;
				jenisKamarString = "Deluxe Room";
				
			}
			else if (jenisKamar == 2)
			{
				hargaKamar = 300000;
				inputValid = true;
				jenisKamarString = "Suite Room";
			}
			else if (jenisKamar == 3) 
			{
				hargaKamar = 370000;
				inputValid = true;
				jenisKamarString = "President Room";
			}
			else
			{
				System.out.println("\nPilihan tidak valid, silahkan pilih lagi");		
			}
		}
		
		inputValid = false;
		while (!inputValid)
		{
			try
			{
				System.out.print("\nLama menginap (hari)	: ");
				jumlahHari = Integer.parseInt(scanner.nextLine());
				inputValid = true;
				
			} catch (Exception e)
			{
				System.out.println("\nInput tidak valid, silahkan ulangi !");
			}
		}
		
		inputValid = false;
		while (!inputValid)
		{
			try
			{
			System.out.println("\nStatus Pelanggan");
			System.out.println("1. Member");
			System.out.println("2. Non-Member");
			
			System.out.print("Pilih status pelanggan	: ");
			status = Integer.parseInt(scanner.nextLine());
			inputValid = true;
			if (status != 1 && status != 2)
			{
				inputValid = false;
				System.out.println("\nstatus tidak valid, silahkan pilih lagi !");
			}
			} catch(Exception e)
			{
				
			}
		}
		
		if (status == 1)
		{
			if (jumlahHari >= 4 && jumlahHari <= 7)
			{
				diskon = 15;
				harusDibayar = (hargaKamar - hargaKamar * 0.2f) * jumlahHari;
			}
			else if (jumlahHari > 7)
			{
				diskon = 35;
				harusDibayar = (hargaKamar - hargaKamar * 0.35f) * jumlahHari;
			}
			else
			{
				diskon = 0;
				harusDibayar = hargaKamar * jumlahHari;
			}
		}
		else
		{
			if (jumlahHari >= 4 && jumlahHari <=7)
			{
				diskon = 10;
				harusDibayar = (hargaKamar - hargaKamar * 0.1f) * jumlahHari;
			}
			else if (jumlahHari > 7)
			{
				diskon = 15;
				harusDibayar = (hargaKamar - hargaKamar *  0.15f) * jumlahHari;
			}
			else
			{
				diskon = 0;
				harusDibayar = hargaKamar * jumlahHari;
			}
		}
		
		System.out.println("===================================================================");
		System.out.println("\n		NOTA PEMBAYARAN HOTEL");
		System.out.println("Nama Pelanggan\t\t\t: " + namaPelanggan);
		System.out.println("Jenis Kamar\t\t\t: " +  jenisKamarString);
		System.out.println("Tarif Penginapan\t\t: Rp. " + (hargaKamar * jumlahHari) );
		System.out.println("Diskon Menginap\t\t\t: " + diskon + "%" );
		System.out.println("Nominal yang harus dibayar\t: Rp. " + harusDibayar);
		System.out.println("===================================================================");
	}
}
