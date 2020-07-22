package home_work_2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class Hw2 {


    // 1 задание
    public static void main(String[] args) {
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

        // 6 задание
        int[] mass = {2, 2, 2, 1, 2, 2, 10, 1};
        int p;
        int q;
        p = mass [0] + mass[1] + mass [2] + mass [3] + mass [4] + mass [5];
        q = mass [6] + mass [7];
        if (p-q==1) {
            System.out.println("true");
        }else{
            System.out.println("false");

        }
        //7 задание
        int [] y ={1,2,3};
        int n=2;
        if (n==1){
            y[0] = 3;
            y[1] = 1;
            y[2] = 2;
        }else if (n==2){
            y[0]=2;
            y[1]=3;
            y[2]=1;
        }else if (n==3){
            y[0]=1;
            y[1]=2;
            y[2]=3;
        }else if (n==-1) {
            y[0]=2;
            y[1]=3;
            y[2]=1;
        }else if (n==-2) {
            y[0]=3;
            y[1]=1;
            y[2]=2;
        }
        System.out.println(Arrays.toString(y));


        }
    }














