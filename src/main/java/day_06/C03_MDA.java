package day_06;

import java.util.Arrays;
import java.util.Scanner;

public class C03_MDA {
     /*
        arr[3][2] luk bir md array olusturun
        Arrayin elemanlarini kullanicidan alin
        daha sonra bu mda'yi, her bir elemani ic array elemanlarinin toplaina esit olan tek boyutlu
        bir array haline getirin
        or-->int arr[][]={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

    public static void main(String[] args) {
        int arr[][]=new int[3][2];    //{{0,0},{0,0},{0,0}} arr.lenght = 3 olur
        Scanner scan = new Scanner(System.in);
        //arr [0][0]-> dis arrayin 0. indexteki elemanin 0. indexi demektir.
        //arr[0][1]-->dis arrayin 0. indexindeki elemanın 1. indexi

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i <arr.length ; i++) {// Distaki arrayin her bir elemani ele alirim
            for (int j =0; j <arr[i].length ; j++){
               //arr[i][j]-----> arr[0][0]
                System.out.println("Lutfen eklemek istediginiz elemani giriniz");
                arr[i][j]=scan.nextInt();
                System.out.println(Arrays.deepToString(arr));
            }
        }

        int brr[]=new int[arr.length];

        for (int i = 0; i< arr.length; i++) {
            int toplam =0;
            for (int j = 0; j < arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
            brr[i]=toplam;
        }

        System.out.println(Arrays.toString(brr));














    }
}
