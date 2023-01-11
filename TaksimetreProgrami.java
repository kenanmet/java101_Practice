package java101_Odevler;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        // Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        // Taksimetre KM başına 2.20 TL tutmaktadır.
        // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        // Taksimetre açılış ücreti 10 TL'dir.

        double kmUcreti=2.20;
        int acilisUcreti=10;
        int minimumUcret=20;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz");
        int km=input.nextInt();

        double odenecekTutar=acilisUcreti+(km*2.20);

        if (odenecekTutar<20){
            System.out.println("Odenecek tutar: " + minimumUcret + "$");
        }else {
            System.out.println("Odenecek tutar: " + odenecekTutar + "$");
        }

    }
}
