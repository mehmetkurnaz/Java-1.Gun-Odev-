package sayıBulma;

public class sayıBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean varmi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varmi = true;
				break;
			}
			}
			if (varmi) {
				System.out.println("Sayı mevcuttur");
			}else {
				
				System.out.println("Sayı mevcut değildir");
			}
		}
	}


