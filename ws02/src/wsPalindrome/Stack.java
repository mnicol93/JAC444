/*Marc Nicolas Oliva - 130943202 - mnicolas-oliva@myseneca.ca
 * Workshop 2 - 2021-10-05
 */
package wsPalindrome;

public class Stack {
	 
	private char[] stackContent;
	private int arrayPosition = 0;
	Stack(){
		
	}
	Stack(int size){
		 stackContent = new char[size];
	}
	public void push(char ch) {
		if(arrayPosition+1 < stackContent.length) {
			stackContent[arrayPosition++] = ch;
		}else {
			char[] newArray = new char[stackContent.length + 10];
			for(int i=0; i < stackContent.length; i++) {
				newArray[i] = stackContent[i];
			}
			stackContent = new char[newArray.length];
			for(int i=0; i < stackContent.length; i++) {
				stackContent[i] = newArray[i];
			}
			stackContent[arrayPosition++] = ch;
		}
	}
	public char pop() {
		char ch = stackContent[arrayPosition-1];
		char[] newArray = new char[stackContent.length];
		
		for(int i=0; i < newArray.length; i++) {
			newArray[i] = stackContent[i];
		}
		
		if(arrayPosition > 1) {
			stackContent = new char[newArray.length - 1];
			for(int i=0; i < stackContent.length; i++) {
				stackContent[i] = newArray[i];
			}
			arrayPosition--;
		}else {
			stackContent[0] = ' ';
		}
		
		return ch;
	}

}
