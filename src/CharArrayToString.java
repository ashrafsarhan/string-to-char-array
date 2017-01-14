package com.dropwiz.ws.api;

/**
 * The Class CharArrayToString.
 *
 * @author ashraf
 */
public class CharArrayToString {

	public static void main(String[] args) {
		char[] charArr = new char[] { 'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D' };
		System.out.println("Method 1 using new String(charArr)    : " + getString1(charArr));
		System.out.println("Method 2 using String.valueOf(charArr): " + getString2(charArr));
	}

	/**
	 * Gets the string 1.
	 *
	 * @param charArr the char arr
	 * @return the string 1
	 */
	public static String getString1(char[] charArr) {
		String str = new String(charArr);
		return str;
	}

	/**
	 * Gets the string 2.
	 *
	 * @param charArr the char arr
	 * @return the string 2
	 */
	public static String getString2(char[] charArr) {
		String str = String.valueOf(charArr);
		return str;
	}

}
