package time;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	@ParameterizedTest
	@ValueSource(strings = { "05:00:00.120", "05:59:59.120", "05:22:02.120" })
	void testGetMilliSeconds(String candidate) {
		int milliseconds = Time.getMilliSeconds(candidate);
		assertTrue("The milliseconds were not calculated properly", milliseconds == 120);		
	}
	
	

}
