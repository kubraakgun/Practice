package day_03;

import java.util.Scanner;

public class C06_Ternary {
    //kullanıcıdan pozitif bir sayı alınız
    //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
    // ve yazdıran bir method olusturun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 veya daha cok basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        kacBasamakli(sayi);

    }

    public static void kacBasamakli(int sayi) {
        //bir sayi 99 dan buyukse veya daha cok basamaklidir
        System.out.println(sayi>99 ? "sayi 3 veya daha fazla basamakli" : "sayi 3 ten az basamakli");






    }

}
