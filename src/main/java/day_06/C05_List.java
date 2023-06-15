package day_06;
import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
     /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)


          String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};

        List<String> ortakIsimler = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {//arr arrayindeki her bir eleman tek tek gelir

            for (int j = 0; j < brr.length; j++) {//brr arrayindeki her bir eleman tek tek aldim
                if (arr[i].equalsIgnoreCase(brr[j])){

                    ortakIsimler.add(brr[j]);//ortakIsimler.add(arr[i]) bu sekilde de olur
                }
            }
        }
        System.out.println(ortakIsimler);













    }
}
