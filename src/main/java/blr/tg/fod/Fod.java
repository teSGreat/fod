package blr.tg.fod;

/**
 * Created by Uleychik_SA on 19.3.17.
 */
public class Fod {

    private int[] nums;

    public Fod(int[] nums) {
        this.nums = nums;
    }

    public int wheelSize() {

        final int sectors = nums.length - 1;
        int wheelSize = sectors;
        int wheel = sectors / 2;

        while (wheel >= 1) {

            if (sectors % wheel == 0) {
                boolean finded = true;

                WHEEL:
                for (int i = 0; i < sectors; i += wheel) {
                    for (int j = 0; j < wheel; j++) {
                        if (nums[j] != nums[i + j]) {
                            finded = false;
                            break WHEEL;
                        }
                    }
                }

                if (finded) {
                    wheelSize = wheel;
                }
            }
            //
            wheel--;
        }


        return wheelSize;

    }
}
