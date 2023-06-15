package day_06;

public class C06_Scope {
    /*
    scope kapsam anlamına gelir,variable in nerede gecerli oldugunu bildirir
    4 cesit scop vardir

    1-static variablelar = class variablelar
    2-instance variable = object variablelar
    ---static ve instance variablelar class levelda olusturulur
    3-local variablelar = methodlarin icinde olusturdugumuz variablelar ve methodun icinde gecerli olur
    4-loop variablelar = loopun icinde olusturdugumuz variablelar ve loopun icinde gecerli olur

     */

    static int staticSayi;//defer atamasi yapmadigimiz zaman java bunlara otomatik default degerler atar
    int instanceSayi;



    public static void main(String[] args) {
      int localSayi = 0;// java local variablelara default deger atamaz


        for (int i = 0; i <3 ; i++) {
            System.out.println(i);//buradaki i loop variable dir
        }
       // System.out.println(i);
        System.out.println(staticSayi);
       // System.out.println(instanceSayi);
       // instance bir variable static bir methodda direkt kullanilamaz
       //kullanabilmek icin obje olusturmaliyiz

       C06_Scope obj = new C06_Scope();
        System.out.println(obj.instanceSayi);


    }






}
