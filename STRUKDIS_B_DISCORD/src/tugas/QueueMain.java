package tugas;

import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
		Queue qu = new Queue();
		Scanner sc = new Scanner(System.in);
		int pilihan;
		String keluar;

		do {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("                    	  DAFTAR MENU              ");
			System.out.println();
			System.out.println("             [1] <= ENQUE   	       EMPTY => [4]              ");
			System.out.println();
			System.out.println("             [2] <= DEQUE   	        CARI => [5]              ");
			System.out.println();
			System.out.println("             [3] <= SIZE          DATA QUEUE => [6]              ");
			System.out.println();
			System.out.println("                   					   LOGOUT=> [7]              ");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("\t         MASUKKAN PILIHAN ANDA : ");
			pilihan = sc.nextInt();
			System.out.println();

			switch (pilihan) {
			case 1: {
				System.out.print("Masukan Elemen : ");
				qu.enque(sc.nextInt());
				System.out.println("Elemen Ditambahkan");
				break;
			}
			case 2: {
				qu.dequeue();
				System.out.print("Element dihapus");
				break;
			}
			case 3: {
				System.out.print("Size Queue : " + qu.size());
				break;
			}
			case 4: {
				System.out.print("Queue Empty : " + qu.isEmpty());
				break;
			}
			case 5: {
				System.out.print("Masukan Elemen yang dicari : ");
				qu.cari(sc.nextInt());
				break;
			}
			case 6: {
				qu.displayElement();
				break;
			}
			case 7: {
				System.out.println("Tidak igin melanjutkan :");
				break;
			}

			default: {
				System.out.println("PILIHAN MENU TIDAK SESUAI");
				System.out.println();
				}
			}
			System.out.println();
			System.out.println("MENCOBA LAGI Y/T ");
			keluar = sc.next();
			System.out.println();
		} while (keluar.equalsIgnoreCase("y"));

	}
}
