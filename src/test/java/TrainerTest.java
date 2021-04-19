import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;


public class TrainerTest {

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
    public void retrieveMonsterTest() {
        Trainer train = Mockito.mock(Trainer.class);
        CodeAmonFactory factory = Mockito.mock(CodeAmonFactory.class);
        CodeAmon attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.SPARKY);
        CodeAmon expected = null;
        train.addCodeMonster(attacker1);
        expected = train.retrieveMonster(train);
        assertEquals(attacker1, expected);
    }
     @Test
    public void addCodeMonsterTest() {
         Trainer train = Mockito.mock(Trainer.class);
         CodeAmonFactory factory = Mockito.mock(CodeAmonFactory.class);
         CodeAmon attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.SPARKY);
         CodeAmon expected = null;
         train.addCodeMonster(attacker1);
         expected = train.retrieveMonster(train);
         assertEquals(expected, attacker1);
     }

     @Test
    public void createListTest() {
         Trainer train = Mockito.mock(Trainer.class);
        LinkedList<CodeAmon> code = train.createList();
        assertNotNull(code);
     }
}

