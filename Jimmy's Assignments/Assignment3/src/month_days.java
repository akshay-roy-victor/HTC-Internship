
public class month_days {
	private static final char[] com = {'a', 'b', 'c', 'd'};
	
	
	public static int num_days1(short month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		else if(month==2) {
			return 28;
		}
		else {
			System.out.println("Month entered does not exist");
			return -1;
		}
	}
	
	public static int num_days2(short month) {
		int answer = -1;
		
		switch(month) {
			case 1:
				answer = 31;
				break;
			case 2:
				answer = 28;
				break;
			case 3:
				answer = 31;
				break;
			case 4:
				answer = 30;
				break;
			case 5:
				answer = 31;
				break;
			case 6:
				answer = 30;
				break;
			case 7:
				answer = 31;
				break;
			case 8:
				answer = 31;
				break;
			case 9:
				answer = 30;
				break;
			case 10:
				answer = 31;
				break;
			case 11:
				answer = 30;
				break;
			case 12:
				answer = 31;
				break;
		}
		
		return answer;
	}
	
	public static void uppercase(char[] word, int index) { 
		if(index == word.length) {
			return;
		}
		else {
//			word[index] = Character.toUpperCase(word[index]);
			word[index] -=32;
			index++;
			printarr(word);
			uppercase(word, index);
		}
		
	}
	
	public static void toUppercase(char[] word, int index, int flag) {
		char[] copy = word.clone();
		
		if(index == -1) {
			printarr(copy);
			return;
		}
		else if(flag==1) {
			word[index] +=32;
			index--;
			printarr(word);
			toUppercase(word, index, flag);
		}
		else {
			if(index==word.length) {
				flag++;
				toUppercase(word, index-1, flag);
			}
			word[index]-=32;
			index++;
			printarr(word);
			toUppercase(word, index, flag);
		}
		
	}
	
	public static String generate(String prefix, int k) {
        String s = "";
        if (k == 0)
            return prefix + "_";

        for (char c : com) {
            String newPrefix = prefix + c;
            s = s + generate(newPrefix, k - 1); 
        }
        return s;
    }
	
    // The main function that recursively prints
    // all repeated permutations of the given string.
    // It uses data[] to store all permutations one by one
    static void allLexicographicRecur(String str, char[] data, int last, int index){
        // One by one fix all characters at the given index
        // and recur for the subsequent indexes
        for (int i = 0; i < str.length(); i++){
 
            // Fix the ith character at index and if
            // this is not the last index then
            // recursively call for higher indexes
            data[index] = str.charAt(i);
 
            // If this is the last index then print
            // the string stored in data[]
            if (index == last)
                System.out.println(new String(data));
            else
                allLexicographicRecur(str, data, last, index + 1);
        }
    }
    
    
    static void printarr(char[] arr) {
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
	
	public static void main(String[] args) {
		char[] word = {'a', 'b', 'c', 'd'};
		toUppercase(word, 0, 0);
		
		char[] com = new char[4];
		
		short dec = 12;
		
		long start = System.nanoTime();
//		System.out.println(num_days2(dec));
		long end = System.nanoTime();
		
//		System.out.println(end-start+"ns");
		

		
		
//		uppercase(word, 0);
//		for(int i=0; i<word.length; i++) {
//			System.out.println(word[i]);
//		}
		
//		allLexicographicRecur("ABCD", com, 3, 0);
		
		
		
		
	}

}
