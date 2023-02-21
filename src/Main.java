import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int arr[], int value ){
        for (int i : arr) {
            if (i==value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] dizi = new int[] {4,5,6,8,2,4,8,6,42,2,5,7,13,15,13};

        int[] tekrarEdenler = new int[dizi.length ];
        int sayac=0;
        for (int i = 0 ; i < dizi.length; i++){
            for (int j = 0 ; j < dizi.length ; j++){
                if ((i!=j) && (dizi[i]==dizi[j]) && (dizi[i] % 2 == 0)){
                    if (isFind(tekrarEdenler, dizi[i])){
                        tekrarEdenler[sayac]=dizi[i];
                        sayac++;
                        break;
                    }
                }
            }
        }

    /*
    //burada kafamı karıştıran for each yapısını daha iyi anlamak için iki tekniği birden kullandım

    for (int i =0 ; i< tekrarEdenler.length;i++){
        if (tekrarEdenler[i] != 0){
            System.out.println(tekrarEdenler[i]);
        }
    }
*/
        for (int i : tekrarEdenler){
            if (i != 0){
                System.out.println(i);
            }
        }

    }
}