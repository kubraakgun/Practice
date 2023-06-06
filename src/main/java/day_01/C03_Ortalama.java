package day_01;

public class C03_Ortalama {

    public static void main(String[] arsgs){

        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

        double num1=23.4;
        double num2=24;
        double num3=12;
        double num4=450.3;
        double num5=100;

        //ortalama nasıl hesaplanir -> tum sayılari topla, sayı adedine böl


        double toplam= num1 + num2 + num3 + num4 + num5;
        //İfadenin onunde string varsa + işareti yan yana yazdırma işlemi yapar
        //+ işaretinin önünde string varsa + işareti matematiksel toplama işlemi yapar
        System.out.println("toplam=" + toplam);//609.7
        double ortalama = toplam / 5;
        System.out.println("ortalama = " + ortalama);//121.94000000000001



















    }
}
