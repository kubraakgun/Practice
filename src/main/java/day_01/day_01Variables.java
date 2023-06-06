package day_01;

public class day_01Variables {



    public static void main (String[] args){





  //Bır variable oluştur yazdır
  //syntax: data turu + datanın ismi = (atama operatörü) variable degeri
  int yas = 32;
  int sayi = 50;

        System.out.println(yas);
        System.out.println(sayi);

        //sayi = 50 seklinde yazdır, yani etiketiyle birlikte yazdır
        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + sayi);//soutv değiskeni etiketiyle birlikte yazdirma islemi yapar.


        //String bir data olusturalim -> non primitive
        String isim ="Ali";
        System.out.println("isim =" + isim );


        //olusturduğun variable ı farklı bir variable a kopyala
        int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);


        /*
        camelCase
        PascalCase
        snake_case
        kebab-case
         */


        //Ayni satırda coklu variable deklare et
        int yil = 2023 , ay = 4, gun = 21;

        //Bir variable degerini guncelle
         yil=2024;
        System.out.println("yil = " + yil);
        //Java yukarıdan asagi ve soldan saga dogru calisir, java run time pogramming
        //Değişkenlikleri(variable) yazdır

        //Bir variable deklare et : x
        double x;

        //Bir variable baslat: y (initialize)
        double y =12.5;

        //Baska bir varible baslat: z değeri 33 olsun
        double z = 33;// jaava bunu 33.0 oarak algıladı

        //x değişkenini y değişkeni ile baslat
        x =y ;
        System.out.println("x = " + y);

        //Variable y i güncelle -> 14.9 olarak guncelle
        y =14.9;


        //Değiskenleri yazdır


















    }
}
