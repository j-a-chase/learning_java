// Name: James A. Chase
// File: Main.java
// Date: 15 February 2024

public class Main {
    public static void main(String[] args) {
        /*
         * Arithmetic Operators:
         *  +
         *  -
         *  *
         *  /
         *  %
         *  ++
         *  --
         * 
         * Assignment Operators:
         *  =
         *  +=
         *  -=
         *  *=
         *  /=
         *  %=
         *  &=
         *  |=
         *  ^=
         *  >>=
         *  <<=
         * 
         * Comparison Operators:
         *  ==
         *  !=
         *  >
         *  <
         *  >=
         *  <=
         * 
         * Logical Operators:
         *  &&
         *  ||
         *  !
         */
        int num = 5;
        System.out.println(num);

        num += 5;
        System.out.println(num);
        
        num -= 5;
        System.out.println(num);
        
        num *= 5;
        System.out.println(num);
        
        num /= 5;
        System.out.println(num);
        
        num %= 5;
        System.out.println(num);
        
        num = 5;
        num &= 3;
        System.out.println(num);
        
        num = 5;
        num |= 1;
        System.out.println(num);
        
        num = 5;
        num ^= 3;
        System.out.println(num);

        num = 5;
        num <<= 2;
        System.out.println(num);
        
        num = 5;
        num >>= 2;
        System.out.println(num);
    }
}
