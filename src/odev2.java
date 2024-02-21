import java.util.Scanner;
public class odev2 {

	public static void main(String[] args) {
		
		double tutar,kdvoran = 0.18,KdvTutar,KdvliTutar;
		
				Scanner input= new Scanner (System.in);
		
		System.out.print("ücret tutarını giriniz:");
		
		tutar=input.nextDouble();
		
		KdvTutar = tutar * kdvoran;
		KdvliTutar = tutar + KdvTutar;
		
		
		System.out.println("KDV'siz Tutar :" + tutar);
		System.out.println("KDV Oranı :" + kdvoran);
		System.out.println("KDV Tutarı:" + KdvTutar);
		System.out.println("KDV'li Tutarı :" + KdvliTutar);
		
		
	}

}
