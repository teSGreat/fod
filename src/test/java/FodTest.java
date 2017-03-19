import blr.tg.fod.Fod;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Uleychik_SA on 19.3.17.
 */
public class FodTest extends Assert {

    @Test
    public void test1() {

        int[] m = new int[]{1, 2, 3, 1};
        assertArrayEquals(Arrays.copyOfRange(m, 0, 3), Arrays.copyOfRange(m, 0, new Fod(m).wheelSize()));
    }

    @Test
    public void test2() {

        int[] m = new int[]{1, 1, 1, 1};
        assertArrayEquals(Arrays.copyOfRange(m, 0, 1), Arrays.copyOfRange(m, 0, new Fod(m).wheelSize()));
    }

    @Test
    public void test3() {

        int[] m = new int[]{5, 3, 1, 3, 5, 2, 5, 3, 1, 3, 5, 2, 5};
        assertArrayEquals(Arrays.copyOfRange(m, 0, 6), Arrays.copyOfRange(m, 0, new Fod(m).wheelSize()));
    }

    ///
    @Test
    public void test4() {

        int[] m = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        assertArrayEquals(Arrays.copyOfRange(m, 0, 3), Arrays.copyOfRange(m, 0, new Fod(m).wheelSize()));
    }

    @Test
    public void test5() {
        int[] m = new int[]{1, 1, 2, 1,
                            1, 1, 2, 1,
                            1, 1, 2, 1,
                            1, 1, 2, 1,
                            1, 1, 2, 1,
                            1, 1, 2, 1, 1};
        assertArrayEquals(Arrays.copyOfRange(m, 0, 4), Arrays.copyOfRange(m, 0, new Fod(m).wheelSize()));
    }

}
