
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public class Test {
   Addition testobj=new Addition();
   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final PrintStream originalOut = System.out;


   @Before
   public void setUpStreams() {
       System.setOut(new PrintStream(outContent));
   }

   @After
   public void restoreStreams() {
       System.setOut(originalOut);
   }
   
   @org.junit.Test
   public void out() throws IOException {
       Addition.main(new String[] {"abc123", "-f", "test.tmp"});
       assertEquals("6", outContent.toString());
   }
   
	@org.junit.Test
	public void positivescenario1() throws IOException {
		
		long result=testobj.addvalue("abc123", "-x");
		System.out.println(result+"from method");
		assertEquals(39, result);
	}
	
	@org.junit.Test
	public void positivescenario6() throws IOException {
		long result=testobj.addvalue("abc", "");
		System.out.println(result+"from method");
		assertEquals(0, result);
	}
	@org.junit.Test
	public void positivescenario3() throws IOException {
		long result=testobj.addvalue("qq", "");
		System.out.println(result+"from method");
		assertEquals(0, result);
	}
	@org.junit.Test
	public void negativecenario1() throws IOException {
		long result=testobj.addvalue("qq", "-x");
		System.out.println(result+"from method");
		assertEquals(0, result);
	}
	
	@org.junit.Test
	public void positivescenario5() throws IOException {
		File file = new File("/");
		assertTrue(file.exists());
	}
	
	
	

}

