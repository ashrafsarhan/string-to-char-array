package com.baeldung.stringtochar;


import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * The Class StringToCharArray.
 *
 * @author ashraf
 */
public class StringToCharArray {

	@Test
	public void testStringToCharArray() {
		String str = "HELLO WORLD";
		char[] charArray = str.toCharArray();
		assertTrue(str.length() == charArray.length);
	}
}
