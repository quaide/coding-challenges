import org.junit.Assert;
import org.junit.Test;

public class QuaideListTest {
    @Test
    public void testConstructor() {
        QuaideList test = new QuaideList();
        int isZero = test.size();
        Assert.assertEquals(0, isZero);
    }

    @Test
    public void testAdd() {
        QuaideList test = new QuaideList();
        test.add("Placeholder");
        int isOne = test.size();
        String firstIndex = test.get(0);
        Assert.assertEquals(1, isOne);
        Assert.assertEquals("Placeholder", firstIndex);
    }

    @Test
    public void testAddFull() {
        QuaideList test = new QuaideList();
        for(int i = 0; i < 15; i++) {
            test.add("i");
        }
    }

    @Test
    public void testIsEmpty() {
        QuaideList test = new QuaideList();
        boolean isEmpty = test.isEmpty();
        Assert.assertEquals(true,isEmpty);
    }

    @Test
    public void testGet() {
        QuaideList test = new QuaideList();
        test.add("Placeholder");
        String firstIndex = test.get(0);
        Assert.assertEquals("Placeholder", firstIndex);
        //test.get(15);
    }

    @Test
    public void testRemove() {
        QuaideList test = new QuaideList();
        test.add("Placeholder");
        test.add("Quaide");
        test.add("Kelsey");
        test.add("Mitch");
        Assert.assertEquals(4, test.size());
        test.remove(1);
        Assert.assertEquals("Kelsey", test.get((1)));
        Assert.assertEquals(3, test.size());
        //test.get(15);

    }

    @Test
    public void testContains() {
        QuaideList test = new QuaideList();
        test.add("Placeholder");
        boolean exists = test.contains("Placeholder");
        boolean exists1 = test.contains("Quaide");
        Assert.assertEquals(true, exists);
        Assert.assertEquals(false, exists1);
    }
}
