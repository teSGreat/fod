import blr.tg.fod.Fod;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Uleychik_SA on 19.3.17.
 */
public class FodTest extends Assert {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3}, new Fod(new int[]{1, 2, 3, 1}).sectors());
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1}, new Fod(new int[]{1, 1, 1, 1}).sectors());
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{5, 3, 1, 3, 5, 2}, new Fod(new int[]{5, 3, 1, 3, 5, 2, 5, 3, 1, 3, 5, 2, 5}).sectors());
    }

    ///
    @Test
    public void test4() {
        assertArrayEquals(new int[]{1, 2, 3}, new Fod(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1}).sectors());
    }
}
