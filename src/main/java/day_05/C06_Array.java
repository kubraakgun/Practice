package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz

        Scanner scan = new Scanner(System.in);
        int arr[]= new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Lutfen bir sayı giriniz");
            int sayi= scan.nextInt();
            arr[i]=sayi;

        }
        System.out.println(Arrays.toString(arr));

        //Loop un bir döngüsü bittigi anda arraye assign ettigimiz variabellar sabit kalır
        //ancak loop icinde olusturdugumuz variable lar yok olur loop her calistiginda tekrar olusur





        // ve bu rakamları bir array'e assiyn ediniz. Olusturdugunuz array'i yazdırınız
        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
       //ilk once for each ile array in elemanlarini toplayalim, daha sonra eleman sayisina bolelim

        double toplam = 0;

        for ( int each: arr) {
            toplam+=each;

        }
        System.out.println("toplam = " + toplam);

        System.out.println("ortalama = "+(toplam/4));

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        for (int each:arr
        ) {
            if (each>(toplam/ arr.length)){
                System.out.print(each+" ");
            }


        }
    }
}
