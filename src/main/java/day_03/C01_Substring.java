package day_03;

import java.util.Scanner;

public class C01_Substring {
    /*
    Kullanicidan ad ve soyadini aralarinda bir bosluk olacak sekilde sisteme girmesini isteyiniz
    Ad ve Soyadi ilk harfleri buyuk olacak sekilde alt alta yazdirin
    Ad : Canan
    Soyad : Can
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadınızı aralarinda bir bosluk olacak sekilde girin \n " +
                " Yalnizca bir ad bir soyad girilmeli");
        String adSoyad = scan.nextLine();
        System.out.println(adSoyad);
        //substring methodunun 2 formu var
        //1. substring(index)-> index dahil olmak uzere stringin sonuna kadar olan kısmı yeni bir string olarak dondurur
        //2. substring(index1,index2)-> index1 dahil, index2 haric olmak uzere yeni bir string dondurur
        int spaceIndex = adSoyad.trim().indexOf(" ");
        String ad = adSoyad.substring(0,spaceIndex);
        System.out.println(ad);

        String soyad = adSoyad.substring(spaceIndex+1);
        System.out.println(soyad);
        //ad isimli variable ın ilk karakterini buyuk harf olacak sekilde alalim
        char adIlkHarf = ad.toUpperCase().charAt(0);
        //ad isimli variable in geri kalan kismini kucuk harf olarak alalim
        String adGeriKalan = ad.substring(1).toLowerCase();

        ad = adIlkHarf + adGeriKalan;//concatenation
        System.out.println(ad);

        //soyad isimli variavb in ilk harfini buyuk olarak  alalim
        char soyadIlkHarf = soyad.toUpperCase().charAt(0);
        String soyadGeriKalan = soyad.substring(1).toLowerCase();
        soyad = soyadIlkHarf+soyadGeriKalan;

        System.out.println("Ad :"+ ad);
        System.out.println("Soyad :"+ soyad);





















    }
}
