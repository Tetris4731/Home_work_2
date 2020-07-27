package home_work_2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class Hw2 {


    // 1 задание
    public static void main( String[] args ) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] -= 1;
            } else {
                a[i] += 1;
            }
        }
        System.out.println(Arrays.toString(a));

        // 2 задание
        int[] b = new int[8];
        for (int i = 0; i < b.length; i++) {
            b[i] = i * 3;
        }
        System.out.println(Arrays.toString(b));
        // 3 задание
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(c));
        //4 задание
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i] == table[j]) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }

                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        // 5 задание
        int[] w = {1, 2, 3, 4, 5};
        int max = w[0];
        int min = w[0];
        for (int i = 0; i < w.length; i++) {
            if (min > w[i]) {
                min = w[i];
            } else {
                max = w[i];
            }

        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }

    // 6 задание
    public static boolean checkBalans( int[] arr ) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < sum) {
            sumLeft += arr[i];
            i++;
        }
        return sumLeft == sum / 2;
    }
    public static int[] shifyArr (int[] arr,int n){
    int k = n%arr.length+arr.length;
        for (int i = 0; i <k ; i++) {
            int tmp = arr[arr.length-1];
            for (int j = arr.length; j > 0; j--){
                arr[0]=arr[j-1];
            }
            arr[0]=tmp;
        }
    return arr;
    }
}
















