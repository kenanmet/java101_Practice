package java101_Odevler;

import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {

        int num1,num2,islem;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        num1=input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        num2= input.nextInt();

        System.out.println("*************************");
        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.println("*************************");
        System.out.println("Lutfen islem seciniz");
        islem=input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama islemi sonucu: " + (num1+num2));
                break;
            case 2:
                System.out.println("Cıkarma islemi sonucu: " +(num1-num2));
                break;
            case 3:
                System.out.println("Carpma islemi sonucu: " +(num1*num2));
                break;
            case 4:
                System.out.println("Bolme islemi sonucu: " +(num1/num2));
                break;
            default:
                System.out.println("Gecersiz islem numarasi secimi!");
        }

    }
}
