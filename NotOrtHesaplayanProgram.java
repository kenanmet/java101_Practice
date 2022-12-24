package java101_Odevler;

import java.util.Scanner;

public class NotOrtHesaplayanProgram {
    public static void main(String[] args) {
        // Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        // kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        // Aynı program içerisinde koşullu ifadeler kullanılarak,
        // eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        // küçük ise "Sınıfta Kaldı" yazsın.

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner girilenNot= new Scanner(System.in);

        System.out.println("Lutfen matematik notunuzu giriniz");
        mat=girilenNot.nextInt();

        System.out.println("Lutfen fizik notunuzu giriniz");
        fizik=girilenNot.nextInt();

        System.out.println("Lutfen kimya notunuzu giriniz");
        kimya=girilenNot.nextInt();

        System.out.println("Lutfen turkce notunuzu giriniz");
        turkce=girilenNot.nextInt();

        System.out.println("Lutfen tarih notunuzu giriniz");
        tarih=girilenNot.nextInt();

        System.out.println("Lutfen muzik notunuzu giriniz");
        muzik=girilenNot.nextInt();

        double toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama=(toplam/6);

        System.out.println("Not Ortalamaniz: " + ortalama);
        System.out.println(ortalama>60 ? "Sinifi Gectin" : "Maalesef Kaldin");


    }
}
