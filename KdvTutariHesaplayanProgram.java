package java101_Odevler;

import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        // Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        // KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        // (Not : KDV tutarını 18% olarak alın)
        // KDV'siz Fiyat = 10;
        // KDV'li Fiyat = 11.8;
        // KDV tutarı = 1.8;
        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        double fiyat, kdvOrani;
        Scanner input= new Scanner(System.in);
        System.out.println("ucreti giriniz");
        fiyat=input.nextDouble();

        if (fiyat<=1000){
            kdvOrani=0.18;
        }else {
            kdvOrani=0.08;
        }

        double kdvTutari= fiyat*kdvOrani;
        double kdvliFiyat= fiyat+kdvTutari;

        System.out.println("kdv'li fiyat: " + kdvliFiyat);


    }
}
