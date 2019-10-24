package deqo.kdel.mysimplestack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySimpleStackTest {

    private MySimpleStack mss = new MySimpleStack();
    private Item item1 = new Item();
    private Item item2 = new Item();
    @Before
    public void setUp() throws Exception {
        this.item1.setName("item1");
        this.item2.setName("item2");
    }

    @After
    public void tearDown() throws Exception {
        this.mss = null;
        this.item1 = null;
        this.item2 = null;
    }

    @Test
    public void testIsEmpty() {
        assertTrue(mss.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        mss.push(item1);
        assertFalse(mss.isEmpty());
    }

    @Test
    public void testGetSizeEmpty() {
        assertEquals(0,this.mss.getSize());
    }

    @Test
    public void testGetSizeNotEmpty() {
        mss.push(item1);
        mss.push(item2);
        assertEquals(2,this.mss.getSize());
    }

    @Test
    public void testPeekEmpty() {
        try{
            mss.peek();
            fail("Aurait du être intercepté...");
        }catch(EmptyStackException e){
            assertTrue(true);
        }
    }

    @Test
    public void testPeek() {
        mss.push(item1);
        mss.push(item2);
        try{
            String actual = mss.peek().toString();
            assertEquals("item2",actual);
        }catch(EmptyStackException e){
            fail("Pas d'exception attendue");
        }
    }

    @Test
    public void testPopEmpty() {
        try{
            mss.pop();
            fail("Aurait du être intercepté");
        }catch(EmptyStackException e){
            assertTrue(true);
        }
    }

    @Test
    public void testPop() {
        mss.push(item1);
        mss.push(item2);
        try{
            String actual = mss.pop().toString();
            assertEquals("item2",actual);
            actual = mss.pop().toString();
            assertEquals("item1",actual);
        }catch(EmptyStackException e){
            fail("Pas d'exception attendue...");
        }
    }

    @Test
    public void testSuperUsefulFunction(){
        assertEquals(mss.superUsefulFunction(),2);
    }

    @Test
    public void testAnotherSuperUsefulFunction(){
        assertEquals(mss.anotherSuperUsefulFunction(),8);
    }
}