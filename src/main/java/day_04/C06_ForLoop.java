package day_04;

import java.util.Scanner;

public class C06_ForLoop {
          /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next().toLowerCase();

        int sayac = 0;//a harflerinin sayisini koyacagimiz konteyner, her a harfinde sayaci artıracagiz

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a') {
                sayac++;

            } else if (kelime.charAt(i) == 'c') {
                break;//break keywordu loop u kırar
            }

        }
        System.out.println("Girdiginiz kelimedeki ilk c ye kadar a harflerinin sayisi :" + sayac);

    }
}
