package Maytest;

import jdk.nashorn.internal.ir.ContinueNode;

public class Forwhiledo {
    public static void main(String[] args) {
        //for (int i = 100; i > 10; i-= 10)
        //System.out.println(i); // можно использовать умножение, деление, плюс, минус i*=10, i+=10, i-=10, i/=2

        //int j = 0; // можно присвоить любое значение
        //while (j < 20) {
        //  System.out.println(j);
        //  j += 2;

        //boolean isTrue = true;
        // int j = 0;
        // while (isTrue) {
        // System.out.println(5); // если поставить любое значение будет выполняться безконечно
        //  j += 2;

        //---------------------------------------

        boolean isTrue = true;
         int j = 0;
         while (j < 100) {
        j += 1;
        if (j % 2 == 0)
            continue;
         System.out.println(j);
    }
//-----------------------------------------------
        //  boolean isTrue = true;
        // int j = 0;
        //  while (isTrue) {
        //    System.out.println(j);
        //    j += 2;
        //   if (j > 10)
        //       isTrue = false;

        //    }
        //   int x = 0;
        // do {
        //    x++;
        //    System.out.println(x);
        // } while (x < 0);
//-------------------------------------------------------------------------------

  //      boolean isTrue = true;
   //     int j = 0;
   //     while (isTrue) {
   //         System.out.println(j);
   //         j += 2;
   //         if (j > 10)
  //              break; // цыкл не будет бесконечным. На консле результат 0, 2, 4, 6,8, 10. ВЫйтииз цыкла
        }

//----------------------------------------------------------

        //              int x = 13;
        //do {
        //   x--;
        // System.out.println(x);
        // } while (x > 10); // результат  на консоле 12, 11, 10

    }




