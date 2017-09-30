package GitHub;

import java.util.Scanner;

/**
 * Created by Monkata on 28.9.2017 г..
 */
public class MaxFinder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        int maxNum = Integer.MIN_VALUE;
        while (num != 0){
            if (num > maxNum){
                maxNum = num;
            }
            num = Integer.parseInt(console.nextLine());
        }
        System.out.println(maxNum);
    }
}
