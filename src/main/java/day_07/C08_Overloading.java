package day_07;

public class C08_Overloading {
    //Method Signature : method ismi ve parametreler
    //Overloading ayni ismi isme sahip farkli methodlar olusturmaktir
    //Overloading icin method signature degistirilmeli,yani isim aynı kalacagi icin parametreler degistirilmeli


    public static void main(String[] args) {
        // Aynı classta aynı isimde method olusturunuz
        //toplama methodu->int + int
        //toplama methodu->double + double
        //carpma methodu ->int*int*int
        //carpma methodu ->int*int*int*int
        //cikarma methodu->int-double
        //cikarma methodu->double-int


        toplama(3,5);
        toplama(3.5,5.1);
        //method signature degistirmenin
        //1. yolu parametrelerin data türünü degistirmek

        carpma(1,2,3);
        carpma(1,2,3,4);
        //method signature degistirmenin
        //2. yolu: parametre sayisini degistirmek

        cikarma(5,3.2);
        cikarma(6.2,3);
        //method signature degistirmenin
        //3.yolu : data turleri farklı oldugunda parametrelerin yerini degistirmek

    }

    private static void cikarma(double v, int v1) {
        System.out.println("İlki double ikincisi int olan iki degerin farki : "+(v-v1));//3.2
    }

    private static void cikarma(int i, double v) {
        System.out.println("İlki int ikincisi double olan iki degerin farki : "+(i-v));// 1.7999999999999998
    }

    private static void carpma(int a, int b, int c, int d) {
        System.out.println("Dort int degerin carpimi : "+(a*b*c*d));//24
    }

    private static void carpma(int i, int i1, int i2) {
        System.out.println("Uc int degerin carpimi :"+(i*i1*i2));//6
    }

    private static void toplama(double v, double v1) {
        System.out.println("İki double degeri toplami :"+(v+v1));//8.6
    }

    private static void toplama(int i, int i1) {
        System.out.println("İki int degerin toplami : "+(i+i1));//8
    }


}
