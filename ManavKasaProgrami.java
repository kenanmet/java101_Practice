package java101_Odevler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
        // göre toplam tutarını ekrana yazdıran programı yazın.
        // Meyveler ve KG Fiyatları
        // Armut : 2,14 TL
        // Elma : 3,67 TL
        // Domates : 1,11 TL
        // Muz: 0,95 TL
        // Patlıcan : 5,00 TL

        double Toplamtutar,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        Scanner input=new Scanner(System.in);
        System.out.println("Armut kac kilo?");
        double armutKilo=input.nextDouble();
        System.out.println("Elma kac kilo?");
        double elmaKilo=input.nextDouble();
        System.out.println("Domates kac kilo?");
        double domatesKilo=input.nextDouble();
        System.out.println("Muz kac kilo?");
        double muzKilo=input.nextDouble();
        System.out.println("Patlican kac kilo?");
        double patlicanKilo=input.nextDouble();

        Toplamtutar=((armutKilo*2.14)+(elmaKilo*3.67)+(domatesKilo*1.11)+(muzKilo*0.95)+(patlicanKilo*5.00));
        System.out.println("Toplam tutar: " + Toplamtutar + "TL");

    }
}
