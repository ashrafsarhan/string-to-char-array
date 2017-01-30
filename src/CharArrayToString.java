package com.baeldung.stringtochar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * The Class CharArrayToString.
 *
 * @author ashraf
 */
public class CharArrayToString {

	@Test
	public void testCharArrayToString() {
		char[] charArr = new char[] { 'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D' };
		String str1 = new String(charArr);
		String str2 = String.valueOf(charArr);
		assertTrue("HELLO WORLD".equals(str1));
		assertTrue("HELLO WORLD".equals(str2));
	}
}
