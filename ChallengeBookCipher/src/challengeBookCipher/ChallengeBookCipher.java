package challengeBookCipher;

public class ChallengeBookCipher {

	
	public static void main (String[] args) {
		
		//an array of strings
		//an array of an array of strings
		
		String message[][] = { { "Buzz", "LightYear" ,"was"},
				{"once", "apon", "a"}, { "time","probably" ,"the "},
				{ "coolest", "character", "in", "Toy", "Story 2"},
				{ "but ", "Woody "},{ "was ", "always ", "Andy's " , "wow"},
				{ "toy.", "i"},{ "was", "never", "keen" },
				{ "because ", "I ", "don't "}, { "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
				{ "but"," Lightyear,", "could fly, sort of...", "Anyhow"},{ "the","movies","are", "classic"}
				};
		
		
		String str[] = new String [12];
		
		for (int i=0; i<message.length; i++) {
			str[i] = (message[i][message[i].length-1]);
			
			}
		//System.out.println(Arrays.toString(str));


		for (int i =0; i<str.length; i++) {
			System.out.print(str[i].toUpperCase().charAt(str[i].length()-1));
		}
		
		}

	}

