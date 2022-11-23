import java.util.Scanner;

public class FindDupes {

    public static void main(String[] args) {
        
        findDupesHarder("aadddafsa0f");

        // removeFromString();
        // vowelsAndConsonants();
    }

    public static void vowelsAndConsonants() {

        // 3. Write a method to count the number of vowels and consonants in a string.
        // E.g. if the input is Java the result should be 2 vowels and 2 consonants .

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gimmie String: ");
        String someString = scanner.nextLine();

        String lowerCaseString = someString.toLowerCase();
        int vowelCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < lowerCaseString.length(); i++) {
            
            if(
                lowerCaseString.charAt(i) == 'a' ||
                lowerCaseString.charAt(i) == 'e' ||
                lowerCaseString.charAt(i) == 'i' ||
                lowerCaseString.charAt(i) == 'o' ||
                lowerCaseString.charAt(i) == 'u' 
                ) {
                vowelCount++;
            } else {
                consonantsCount++;
            }

        }

        System.out.println(vowelCount);
        System.out.println(consonantsCount);

    }

    public static void removeFromString() {

        // 1. Write a method to remove a given character from a string. 
        // E.g. remove all 'Aa' from Average should return verge (core logic only, no .replace or .replaceAll)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gimmie String: ");
        String someString = scanner.nextLine();

        System.out.print("Gimmie letter: ");
        char letter = scanner.next().charAt(0);

        String emptyString = "";

        for (int i = 0; i < someString.length(); i++) {
            if(someString.charAt(i) == letter) {
                someString = someString.replace(Character.toString(letter), emptyString);
            }
        }

        System.out.println(someString);
    }

    public static void findDupesHarder(String string) {
        // 2. Write a method to remove duplicate characters from a string.
    	String dupes = "";
        String stringCopy = string;
    
    	for (int i = 0; i <= string.length()-1; i++) {
			

    		for (int j = i+1; j < string.length(); j++) {
				
    			if((string.charAt(i) == string.charAt(j)) || dupes.contains(Character.toString(string.charAt(i)))) {
    				
    				dupes = dupes.concat(Character.toString(string.charAt(i)));
    				break;
    				
    			}
				
			}

            if( i == (string.length()-1) ) {
                if(dupes.contains(Character.toString(string.charAt(i)))) {
                    dupes = dupes.concat(Character.toString(string.charAt(i)));
                }
            }
			
		}

        for (char letter : dupes.toCharArray()) {
            string = string.replaceAll(Character.toString(letter), "");
        }
    	System.out.println(string + dupes);
    	
    }
}
