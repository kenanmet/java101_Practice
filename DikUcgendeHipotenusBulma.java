package java101_Odevler;

import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int kenar1=input.nextInt();
        int kenar2=input.nextInt();
        int kenar3=input.nextInt();

        double ucgenCevre=kenar1+kenar2+kenar3;
        double u=ucgenCevre/2;
        double alanKare=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        double alan=Math.sqrt(alanKare);

        System.out.println("Ucgenin alani: " + alan);


    }
}
