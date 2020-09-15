package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

// Test class doesn't do anything at present.  Used only to show that maven is executing tests.
public class GreeterTest {
	

	@Test
	public void greeterSaysHello() {
		assertThat("Hello", containsString("Hello"));
	}

}
