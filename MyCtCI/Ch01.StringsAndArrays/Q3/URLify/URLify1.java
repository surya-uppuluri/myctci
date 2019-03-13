package Q3.URLify;

import java.util.Arrays;

public class URLify1 {

	public static void main(String[] args) {
/**
*  pg 193 
*  1.3 URLify: Write a method to replace all spaces in a string with '%20'.
*  You may assume that the string has sufficient space at the end to hold the
*  additional characters, and that you are given the "true" length of the string. 
*  (Note: If implementing in Java, please use a character array so that you can perform this
*   operation in place.)
*   EXAMPLE
*     Input: "Mr John Smith ", 13 
*     Output: "Mr%20John%20Smith" 

 */
		char[] in = "Mr John Smith    ".toCharArray();
		int new_len = replaceSpaces(in);
}

	private static int replaceSpaces(char[] in) {
		int spaceCount = 0;
		for(char ch: in)
			if(ch == ' ') spaceCount++;
		//remove trailing spaces
		int i = in.length;
		while(in[i-1] == ' ')
		{
			spaceCount--;
			i--;
		}
		int noTrailSpaceLength = i;
		int urlifiedLength = noTrailSpaceLength + (spaceCount*2);
		for(int j=urlifiedLength; j>0; j--)
		{
			//Solution incomplete.
		}
		
	}
}