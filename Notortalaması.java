import java.util.Scanner;
public class Notortalamas� {
	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,muzik;
		Scanner input= new Scanner(System.in);
		
		System.out.print("matematik notunu giriniz:");
		mat = input.nextInt();
		
		System.out.print("fizik notunu giriniz:");
		fizik = input.nextInt();
		
		System.out.print("kimya notunu giriniz:");
		kimya = input.nextInt();
		
		System.out.print("t�rk�e notunu giriniz:");
		turkce = input.nextInt();
		
		System.out.print("tarih notunu giriniz:");
		tarih = input.nextInt();
		
		System.out.print("m�zik notunu giriniz:");
		muzik = input.nextInt();
		
		int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
		double ortalama=(toplam/6.00);
		System.out.println("ortalama notunuz:"+ortalama);
		
		boolean sonuc=(ortalama<60);
		String str=(sonuc)? "S�n�fta Kald�":"S�n�f� Ge�ti";
		System.out.println(str);
		
	}
	
	

}
