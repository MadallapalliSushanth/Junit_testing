package src.test.java;


import src.main.java.Add;
import org.junit.Test;
import static org.junit.Assert.*;
 

public class TestAdd  {

	  @Test  
	    public void testFindMax(){  
	        //assertEquals(21,obj.addition(10,11));  
	        assertEquals(28,Add.addition(18,11));   
	    }  
}
