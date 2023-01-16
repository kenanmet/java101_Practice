package java101_Odevler;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        // Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        // Kilo (kg) / Boy(m) * Boy(m)

        double boy,kilo,vki;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu (metre cinsinde ornek:1.75) giriniz");
        boy=input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        kilo=input.nextDouble();
        vki=kilo/(boy*boy);

        System.out.println("Vucut kitle indeksiniz: " + vki);
    }
}
