package day_02;

import java.util.Scanner;

public class C04_Scanner {
    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {
            Scanner girdi = new Scanner(System.in);
            System.out.println("lutfen bir karakter giriniz");
            //char data turunde bir veri almak istiyorum
            //ancak scanner objesinin(girdi) methodlarina bakinca nextChar diye bir
            //methodun olmadıgını gorduk
            //sacnner ile char alamk istiyorsak once string olarak aliriz -> (next() methodu ile)
            //daha sonra bu stringin charat (0) methodu ile 0 indexindeki karakteri alıriz
            char ch = girdi.next().charAt(0);//0 burada sıfırıncı index demek, stringlerde index yapısı vardir ve sıfırdan baslar

            System.out.println("ch = " + ch);

            System.out.println("=============================");
          /*
            A   -> 2 bosluk + ch + 2 bosluk
           A A  -> 1 bosluk  + ch + 1 bosluk + ch
          A A A -> ch + 1 bosluk + ch + 1 bosluk + ch
           */

            //konsolda bosluk(space) gormek icin mutlaka bir space lerin tırnak içinde olması gerekir
            //" " dısındaki bosluklar onemsizdir
            System.out.println("  "+ ch + "  ");
            System.out.println(" "+ ch + " "+ ch);
            System.out.println(ch + " " + ch + " " + ch);

            // tek sout ile yapmak istersem -> \n ile yapariz -> imleci bir alt satira gecirir ve tırnak icine yazılır
            System.out.println("  "+ ch+ "  \n " + ch + " "+ ch + " \n" +ch +" "+ ch + " "+ ch);











        }
}
