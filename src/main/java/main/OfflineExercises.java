package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		 // check char a against char b, if char a != b, then return string of A A A ? not impressed.
		// make char array, then...operate on char array as its filled
		// add the char at i three times? that should work i think. . . 
		// hmm...hmm....OH. do multiplication on iterator?
		// set up logic so that if current char != past char, then introduce it to return string 3 times

		
		char[]characterArray = input.toCharArray(); // use in built string function
		int loopXTimes = input.length() * 3;
		
		for (int i = 0; i < loopXTimes; i++ ){ // standard for loop for the scanthrough/copy/add new chars
			characterArray[i] = (char) (input.charAt(i) + input.charAt(i) + input.charAt(i));
			
			//input.charAt(i) = (input(a) + input(a) + input(a));
			
		}

		String returnMe = characterArray.toString();
		System.out.print(returnMe);
		return returnMe;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {
		return "What? my names Burt. Cmon guys. Not funny/impressed";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	//take a from b and add to var, a from c, b from c
	// if var a + b = c then true OR if a + c = b, return true; 
	
	// i could probably do this cleaner, let me please, PLEASE
	// DO NOT IGNORE PLEASE
	// NO SERIOUSLY PLEASE
	// i set up my IF using a hand drawn truth table, so it may be sloppy but its verified by the table of truth!!!!!
	//yes it passes testing but aye. probably better implementations exist rather than checking each against each but hey.
	public boolean evenlySpaced(int a, int b, int c) {
		
		if(a + b == c || a + c == b || b + a == c ||  b + c == a || c + a == b ||c + b == a){
			return true;
		}
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"
	
	
	//GET CHAR AT POS 0 AND POS STRING.LENGTH, RETURN THEM. 

	public String nMid(String input, int a) {
		String posA = "";
		String posZ = "";
		
		
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {
		input.compareToIgnoreCase("dev");
		// I could brute force this, but at what cost? I know there is an ignore case but it isn't working as i want it to. . . 
		
		if (input.contains("dev") ==true || input.equalsIgnoreCase("dev")==true){ // should work but doesn't. annoying.
			return true;
		}
		if (input.equalsIgnoreCase("dev")==true){
			return true;
		}
		
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0
	
	// if .contains("am") count ++;

	public int amISearch(String arg1) {
		int counter = 0;
		
		//also doesn't work, what am i missing. . . 
		for (int i = 0; i < arg1.length(); i++){
			if(arg1.contains("am")){
				
				counter++;
			}
			
		}
		
		//prototype BELOW
		// OH HO...You're actually approaching me?!
		
		if(arg1.contains("am")){

			counter++;
		}
	
		return counter;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"
	
	// if %3 then return fizz. if %5 then return buzz, both, fizzbuzz. 
	// 

	public String fizzBuzz(int arg1) {
		String fizz = "fizz";
		String buzz = "buzz";
		String fizzbuzz = "fizzbuzz";
		
		if (arg1 % 3 == 0 && arg1 % 5 == 0 ){
			return fizzbuzz;
		}
		
		if (arg1 % 3 == 0){
			return fizz;
		}
		if (arg1 % 5 == 0){
			return buzz;
		}
		
		return null;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	// add pos 0 + 
	public int largest(String arg1) {
		
		
		//int[]forTheLargest = arg1.split(" ");
		
		//gunna have to do array filler loop i guess? 
		// linked list would probably be good here, for pairing the results into touples,
		// LINKED LIST WOULD BE GOOD HERE, FOR PAIRING THE RESULTS INTO TOUPLES. SHAME ITS EXAM CONDITIONS, WHERE I CAN'T 
		// USE A GUIDE TO MAKE SURE I'M IMPLEMENTING MY LINKED LIST CORRECTLY, AS IM QUITE RUSTY. FOR SHAME. 
		// this task can be brute forced partially by doing pos(n) + pos(n+1) by manually typing each array pos per appearance
		//however, that wont work due to one of your inputs being 555. This was a good chance to test our handling of frustration,
		// if a little underhanded. . . 
		
		char[]annoyed = arg1.toCharArray();
		int[]forTheLargest = new int[arg1.length()]; // setting the int array to be equal to the 
		int checkOne = 0;
		int checkTwo = 1;
		int currentHeighest = 0;
		
		for (int i = 0; i > arg1.length(); i++){
			
			forTheLargest[i] = annoyed[i];
			
			
		}
		
		for (int j = 0; j > forTheLargest.length; j++){
			
			checkOne = forTheLargest[j];
			checkTwo = forTheLargest[j+1]; // this will certainly cause array out of bounds. 
					
		}
		return 0;
	}
}
