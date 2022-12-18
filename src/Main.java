import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Manav Kasa Programı");
        Scanner imput = new Scanner(System.in);
        double armut, elma, domates, muz, patlıcan, a, e, d, m, p, toplam;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;
        //Aldığımız ürünleri girelim
        System.out.print("Armut kaç kilo ? :");
        a = imput.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        e = imput.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        d = imput.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        m = imput.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        p = imput.nextDouble();
        toplam = a * armut + e * elma + d * domates + m * muz + p * patlıcan;
        System.out.println("Toplam fiyat :"+toplam);

    }
}