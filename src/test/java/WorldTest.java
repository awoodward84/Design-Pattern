import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class WorldTest {
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setNewWorldTest() {
        Trainer train = Mockito.mock(Trainer.class);
        Trainer train1 = Mockito.mock(Trainer.class);
        World newWorld = Mockito.mock(World.class);
        newWorld.setNewWorld(train, train1);
    }
}
