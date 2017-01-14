package com.dropwiz.ws.api;

import java.util.Arrays;

/**
 * The Class StringToCharArray.
 *
 * @author ashraf
 */
public class StringToCharArray {

	public static void main(String[] args) {
		String str = "HELLO WORLD";
		char[] charArray = getCharArray(str);
		System.out.println("getCharArray using String.toCharArray() : " + Arrays.toString(charArray));
	}

	/**
	 * Gets the char array.
	 *
	 * @param str the str
	 * @return the char array
	 */
	public static char[] getCharArray(String str) {
		char[] charArray = str.toCharArray();
		return charArray;
	}

}
