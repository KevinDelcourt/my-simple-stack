package deqo.kdel.mysimplestack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyStackExceptionTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void EmptyStackExceptionTest(){
        try{
            throw new EmptyStackException();
        }catch(EmptyStackException e){
            assertTrue(true);
        }
    }
}