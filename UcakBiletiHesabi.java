import java.util.Scanner;

public class UcakBiletiHesabi {
    
    public static void main(String[] args) {
        int km,age,a;
        double toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();
        
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        a = inp.nextInt();
        toplam = km * 0.10;
        
        if (km > 0 && age > 0 && (a == 1 || a == 2)){
            if(age < 12){

                toplam = toplam * 0.50;

            }else if(12 <= age && age <= 24){

                toplam = toplam * 0.90;

            }else if(65 < age){

                toplam = toplam * 0.70;

            }
            if (a == 2){
                
                toplam = toplam * 0.80 * 2;

            }
            System.out.println("Toplam tutar = " + toplam + "TL");
        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }


        inp.close();
    }
}