package java101_Odevler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        // Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse
        // yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        // şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        // sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        String kullaniciAdi,sifre;
        String gecerliSifre="javacandir";
        String gecerliKullaniciAdi="java101";

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen kullanici adinizi giriniz");
        kullaniciAdi=input.nextLine();

        System.out.println("Lutfen sifrenizi giriniz");
        sifre=input.nextLine();

        if (kullaniciAdi.equals(gecerliKullaniciAdi) && sifre.equals(gecerliSifre)){
            System.out.println("Bilgiler dogru giris yapiliyor");
        }else {
            System.out.println("Yanlis bilgi girisi yaptiniz.");
            System.out.println("Sifrenizi degistirmek icin 1 e basin");
            int islem = input.nextInt();
            if (islem == 1) {
                System.out.println("Lutfen yeni sifre giriniz");
            } else {
                System.out.println("Hatali islem secimi");
            }
            Scanner inp = new Scanner(System.in);
            String yeniSifre = inp.nextLine();
            if (yeniSifre.equals(gecerliSifre)) {
                System.out.println("sifreniz eskisiyle ayni olamaz");
            } else {
                sifre = yeniSifre;
                System.out.println("Yeni sifreniz basarili bir sekilde kaydedildi");
            }
        }

    }
}
