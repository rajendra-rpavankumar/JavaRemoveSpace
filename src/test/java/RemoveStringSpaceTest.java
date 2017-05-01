import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 01/05/2017.
 */
public class RemoveStringSpaceTest {
    RemoveStringSpace removeStringSpace;
    @Before
    public void setUp() throws Exception {
        removeStringSpace=new RemoveStringSpace();
    }

    @Test
    public void removeSpace() throws Exception {
        Assert.assertEquals("String With Multiple Spaces Removed",removeStringSpace.removeSpace("String    With Multiple      Spaces  Removed"));
    }

}