package stringsDemo1;

public class stringsDemo1 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));//2ile 5 index i alır.
		
		for (String kelime : mesaj.split(" ") ) {
			System.out.println(kelime);//heceler alt alta
			
			
		}
		System.out.println(mesaj.toLowerCase()); //harfleri küçültme
		System.out.println(mesaj.toUpperCase());//harfleri büyültme
		System.out.print(mesaj.trim());//boşlukları trimler
		
	}

}
