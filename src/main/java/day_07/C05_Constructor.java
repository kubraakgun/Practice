package day_07;

public class C05_Constructor {

    //isim ve yas 2 tane instance variable olusturalim ve deger atamasi yapalim

    String isim = "Gulcan";
    int yas = 20;

    //parametreli ve parametresiz iki tane constructor olusturalim


    public C05_Constructor(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public C05_Constructor() {
    }

    public static void main(String[] args) {

        C05_Constructor obj1=new C05_Constructor();
        System.out.println(obj1.isim);//Gulcan
        obj1.isim="Mustafa";
        System.out.println(obj1.isim);//Mustafa
        System.out.println(obj1.yas);//20

        C05_Constructor obj2=new C05_Constructor("Derya",25);
        System.out.println(obj2.isim);//Derya
        System.out.println(obj2.yas);//25







    }
























}
