/*Marc Nicolas Oliva - 130943202 - mnicolas-oliva@myseneca.ca
 * Workshop 2 - 2021-10-05
 */
package wsPalindrome;

public class Palindrome {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(int i = 0; i < args.length; i++) {
				//Erase all non-alphanumeric characters
				String cleanPalindrome = args[i].replaceAll("[^a-zA-Z1-9]", "")
						.toLowerCase();
				
				String reversedPal = reverseString(cleanPalindrome);
				
				if (cleanPalindrome.equals(reversedPal)) {
					System.out.println("The strings " + cleanPalindrome + 
							" and " + reversedPal + " ARE EQUAL; " + args[i] + 
							" IS a palindrome.");
				}else {
					System.out.println("The strings " + cleanPalindrome + 
							" and " + reversedPal + " ARE NOT EQUAL; " + 
							args[i] + " ISN'T a palindrome.");
				}
			}
		}else {
			System.out.println("No arguments passed");
		}
	}
	static String reverseString(final String pal) {
		String reversedPal = "";
		Stack stack = new Stack(pal.length());
		char[] palArray = pal.toCharArray();
		
		for(int i = 0; i<pal.length(); i++) {
			stack.push(palArray[i]);
		}

		for(int i = 0; i<pal.length(); i++) {
			reversedPal += stack.pop();
		}
		return reversedPal;
	}
}
