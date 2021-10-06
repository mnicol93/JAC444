/*Marc Nicolas Oliva - 130943202 - mnicolas-oliva@myseneca.ca*/

public class Pyramid {
	public static void main(String[] args) {
		final int PSIZE = 8;
		
		for(int i=0; i < PSIZE; i++) {
			int numPrints = (i*2)+1;
			//Printing whitespace before middle.
			for(int j=0; j <PSIZE-i; j++, System.out.print("   "));
			
			for(int numToPrint=1, j=0; j<numPrints; j++) {
				System.out.printf("%3d", numToPrint);
				
				if(j < i) numToPrint*=2;
				else numToPrint/=2;
				
				}
			System.out.println();
			}
		}
	}

