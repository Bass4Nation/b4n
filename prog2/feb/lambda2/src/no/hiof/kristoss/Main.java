package no.hiof.kristoss;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*
        SimpleMath randomNumberTemp = new SimpleMath() {
        @Override
            return (int) (Math.random() * 100);
        }
*/
        SimpleMath randomNumber = () -> (int)(Math.random() * 100);


        MediocreMath randomToMax = (number -> (int) (Math.random() * number));

        System.out.println("Random numbers to 100" + randomToMax.doMath(106));

        MediumMath lessThan = (int num1, int num2) -> num1 < num2;
        MediumMath biggerThan = (int x, int y) -> x > y;

        System.out.println(" 5 less than 6? " + lessThan.doMath(5,6));
        System.out.println(" 5 more than 6? " + biggerThan.doMath(5,6));

    }

    interface SimpleMath {
        int doMath();
    }

    interface MediocreMath{
        int doMath(int number);
    }

    interface MediumMath{
        boolean doMath(int num1, int num2);

    }
}
