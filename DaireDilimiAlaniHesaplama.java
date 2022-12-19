package java101_Odevler;

import java.util.Scanner;

public class DaireDilimiAlaniHesaplama {
    public static void main(String[] args) {
        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        // 𝜋 sayısını = 3.14 alınız.
        // Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r;
        int angle;
        double pi=3.14;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yari capi giriniz");
        r=input.nextInt();
        System.out.println("Lutfen aciyi giriniz");
        angle=input.nextInt();

        double alan=(pi*(r*r)*angle)/360;
        System.out.println("Daire diliminin alani: " + alan);

    }
}
