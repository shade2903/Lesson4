package com.company;

public class Main {
    public static void main(String[] args) {
        int [] array = {12,42,523,523,124,24};

        // в переменную int будут поочередно записыватся все элементы массива array
        // после знака : может указыватся, либо массив либо коллекция
        for (int e: array){ //for(i=0; i < array.length; i++)
            System.out.println(e);
        }
         int [][] multiArray = {{12,34,24},{123,434},{342,323,424,5124}};
        for(int [] e : multiArray){
            for (int c : e) {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println( );

        }

        //++ - инкремент
        //-- - декремент

        int a = 12;
        a++;
        a--;
        System.out.println(a);
        int b = a++;
        System.out.println(b);//12
        System.out.println(a);//13
        // ++a - префиксная a-- постфиксная

        int x =12;
        int y = 23;
        int z = x++ - --y + y++ - --y - --x;
        // 23 - 22 +22 - 22 - 23;
        System.out.println(z);


    }
}
