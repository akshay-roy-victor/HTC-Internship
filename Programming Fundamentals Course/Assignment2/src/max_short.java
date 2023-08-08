public class max_short {

	public static void main(String[] args) {
		short s=1;
		
		do {
			s=(short) (s*2);
		}while(s>0);
	
		s--;
		System.out.println(s);
	}
}
