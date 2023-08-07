public class short_bits {
	
	static int power (int a, int b) {
		if (b>0) {
			return a * power(a, b-1);
		}
		else {
			return 1;
		}
	}
	
	static int[] binaryConvert(short s) {
		short s1 = s;
		//get length of binary
		int count=0;
		do {
			s1/=2;
			count++;
		}while(s1!=0);
		
		int array[] = new int[count];
		
		//add bits to binary
		s1=s;
		for (int i=0; i<count; i++) {
			array[count-1-i]=s1%2;
			s1 = (short) (s1/2);
		}
		return array;
	}
	
	static int decimalConvert(int[] array) {
		//check if any digits are not 1 or 0
		for (int i=0; i<array.length; i++) {
			if (array[i]==0 || array[i]==1) {
				continue;
			}
			else {
				System.out.println("ENTER ONLY 1 or 0 for the binary");
				return 69;
			}
		}
		
		//conversion to decimal
		int x = 0;
		
		for (int i=0; i<array.length; i++) {
			x+=(power(2, array.length-i-1) * array[i]); 
		}
		
		return x;
	}
	
	static int testbit(short s, int n) {
		int binary[] = binaryConvert(s);
		
		try {
			return binary[n];
		}catch(Exception e) {
			System.out.println("nth position is out of bounds");
			return 69;
		}
		
	}
	
	static int setbit(short s, int n) {
		int binary[] = binaryConvert(s);
		try {
			binary[n]=1;
		}catch (Exception e) {
			System.out.println("nth position is out of bounds");
			return 69;
		}
		return decimalConvert(binary);
		
	}
	
	static int unsetbit(short s, int n) {
		int binary[] = binaryConvert(s);
		try {
			binary[n]=0;
		}catch (Exception e) {
			System.out.println("nth position is out of bounds");
			return 69;
		}
		return decimalConvert(binary);
		
	}
	
	public static void main(String[] args) {
		short s =10;
		
		System.out.println(testbit(s, -1));
		

	}
}
