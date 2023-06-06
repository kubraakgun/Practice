package day_03;

import java.util.Scanner;

public class C02_IfElse {

    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        if (sayi1 > sayi2){//if else tek bir koddur iki ihtimalden biri calisir.Eger hep if olursa hepsini calistirir
            System.out.println("Birinci sayi ikinci sayidan buyuktur ");

        } else {
            System.out.println("Birinci sayi ikinci sayidan buyuk degildir");

        }













    }


}
