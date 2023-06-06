package day_02;

public class C05_Concatenation {
// SELIM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
    /* ASCİİ table kullanınız
               S = 83,
               E = 69,
               L = 76,
               I = 73,
               M = 77
    */

    public static void main(String[] args) {
        char s = 83;
        char e = 69;
        char l = 76;
        char i = 73;
        char m = 77;
        //SELIM
        System.out.println(s+e+l+i+m);//char verilerin arasinda + isareti varsa intellij bunlari mat toplar
        //yan yana yazdırmak icin (concetination icin) basına "" koyarak bu ifadeyi stringe ceviririz,
        //string bir ifade ile neyi toplarsak toplayalım sonuc string olur
        System.out.println(""+ s+e+l+i+m);





    }
}
