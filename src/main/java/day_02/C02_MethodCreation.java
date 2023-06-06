package day_02;

import java.util.Scanner;

public class C02_MethodCreation {

     /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

    public static void main(String[] args) {

        /*amac:
        1 sacnner kullanmak
        2 method olusturmak
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //main method icinden method olusturuken
        //1. methoda verecegin ismi yaz (ozel isim)
        //2. method parantezine koy
        //3. parantezin icine varsa argumanlari yaz
        swaplaYazdir(sayi1, sayi2);//main methodun icinde argument


    }

    private static void swaplaYazdir(int sayi1, int sayi2) {//parametre

        int sayi3;
        sayi3 = sayi1;//burdan sonra sayi 1 e bosaltabilirim degistirebilirim. sayi3 te 10 var
        sayi1 = sayi2;//sayi1 de 20 var, sayi2 yi degiştirebilirim
        sayi2 = sayi3;//sayi2 10 olmus oldu
        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 : " + sayi2);


    }


}

