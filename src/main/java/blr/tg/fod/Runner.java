package blr.tg.fod;

import java.util.Scanner;

/**
 * Created by Uleychik_SA on 19.3.17.
 */
public class Runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] nums = new int[n];
        String[] strings = scan.nextLine().split(" ");
        if (nums.length != strings.length) {
            System.out.println("check input data!");
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        ///
        System.out.println("sectors:" + new Fod(nums).sectors().length);
    }

}
