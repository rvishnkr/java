package strings;

public class Permute{
	static int a = 0;

	public static void 	permute(String s){
		permuteHelper(s, "");
	}

	public static void permuteHelper(String s, String chosen){
		// if/else base case
		//base case here is empty string because it is 
		//simplest to permute nothing
		
		if(s.isEmpty()){
			System.out.println(a + " " + chosen);
		}
		else{
			// choose /explore /unchoose
			// (1 letter)
			for(int i = 0; i < s.length(); i++){
				// choose
				char c = s.charAt(i);
				chosen += c;
				StringBuilder sb = new StringBuilder(s);
				sb.deleteCharAt(i);
				s = sb.toString();

				//explore
				permuteHelper(s, chosen);
				
				// unchoose
				//sb = new StringBuilder(s);
				sb.insert(i, c);
				s = sb.toString();
				sb = new StringBuilder(chosen);
				sb.deleteCharAt(chosen.length()-1);
				chosen = sb.toString();
			}
			a++;

		}
	}


	public static void main(String[] args) {
		System.out.println("Permute:");
		permute("ravi");

	}
}


