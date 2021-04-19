
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
public class CodeAmonFactoryTest {
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
    public void bullyCodeAMon() {
        CodeAmonFactory factory = new CodeAmonFactory();
        CodeAmon attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.BULLY);
        assertNotNull(attacker1);

    }
    @Test
    public void sparkyCodeAMon() {
        CodeAmonFactory factory = new CodeAmonFactory();
        CodeAmon attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.SPARKY);
        assertNotNull(attacker1);
    }
    @Test
    public void albertCodeAMon() {
        CodeAmonFactory factory = new CodeAmonFactory();
        CodeAmon attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.ALBERT);
        assertNotNull(attacker1);
    }
    @Test
    public void ralphieCodeAMon() {
        CodeAmonFactory factory = new CodeAmonFactory();
        CodeAmon attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.RALPHIE);
        assertNotNull(attacker1);
    }

}
