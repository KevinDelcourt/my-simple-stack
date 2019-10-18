package deqo.kdel.mysimplestack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;
    @Before
    public void setUp() throws Exception {
        this.item = new Item();
    }

    @After
    public void tearDown() throws Exception {
        this.item = null;
    }

    //Doit fail actual = null
    /*@Test
    public void testToStringNoNameAdded() {
        String actual = this.item.toString();
        assertEquals("empty",actual);
    }*/

    //Doit réussir
    @Test
    public void testSetName() {
        this.item.setName("oui");
        String actual = this.item.toString();
        assertEquals("oui",actual);
    }

    //Doit réussir
    @Test
    public void testSetNameNull() {
        this.item.setName(null);
        String actual = this.item.toString();
        assertEquals(null,actual);
    }

    //Doit réussir
    @Test
    public void testSetNameEmpty() {
        this.item.setName("");
        String actual = this.item.toString();
        assertEquals("empty",actual);
    }

    //Doit réussir
    @Test
    public void testTriggerException() {
        try{
            this.item.triggerException();
            fail("Aurait du être intercepté");
        }catch(Exception e){
            assertTrue(true);
        }
    }

    //Doit renvoyer une erreur
    /*@Test
    public void testTriggerExceptionNoInterception() throws Exception {
        this.item.triggerException();
    }*/
}