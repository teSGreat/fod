package blr.tg.fod;

import java.util.Arrays;

/**
 * Created by Uleychik_SA on 19.3.17.
 */
public class Fod {

    private int[] nums;

    public Fod(int[] nums) {
        this.nums = nums;
    }

    public int[] sectors() {

        int wheelSize = (nums.length - 1) / 2;
        int[] wheel;
        int[] realWheel = Arrays.copyOfRange(nums, 0, nums.length - 1);


        while (wheelSize >= 1) {
            wheel = Arrays.copyOfRange(nums, 0, wheelSize);
            boolean finded = true;

            WEEL:
            for (int i = 0; i < nums.length - 1; i += wheelSize) {
                for (int j = 0; j < wheelSize; j++) {
                    if (wheel[j] != nums[i + j]) {
                        finded = false;
                        break WEEL;
                    }
                }
            }
            //
            if (finded) {
                realWheel = wheel;
            }
            wheelSize--;
        }


        return realWheel;

    }
}
