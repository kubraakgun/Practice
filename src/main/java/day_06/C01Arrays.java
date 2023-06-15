package day_06;

import java.util.Arrays;

public class C01Arrays {
    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // Yeni bir array olusturmadan varolan arrayin isaretleri degişsin
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6
    public static void main(String[] args) {
      //int arr[]=new int[6]; bu sekilde elemanlari default degerlerden olusan bir array olusturunuz
        int arr []={1,2,-3,4,-5,-6};

        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]*-1;

        }
        System.out.println(Arrays.toString(arr));
        //arr[index] bu sekilde arrayin elemanlarina ulasabiliriz

        int index =0;
        for ( int each : arr) {
            arr[index]=arr[index]* -1;
            index++;
        }
        System.out.println(Arrays.toString(arr));













    }
}
