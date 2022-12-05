package classStuff;
import java.util.Scanner;

public class LabThree {
    
    public static void main(String[] args) {

        removeDupes();
    }

    public static void removeCharFromString() {
        // 1. Write a method to remove a given character from a string.
        // E.g. remove all 'Aa' from Average should return verge
        // (core logic only, no .replace or .replaceAll)

        Scanner scr = new Scanner(System.in);

        System.out.print("Whats the word bird: ");
        String word = scr.nextLine();

        System.out.println("Whats the letter.... fetter: ");
        String letterAsString = scr.nextLine();
        char letter = letterAsString.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                word.replaceAll(Character.toString(letter), "");
            }
        }
        System.out.println(word);

        // with arrays, no replace method

        //create a char[] of the word
        char[] wordCharArr = word.toCharArray();
        char[] newWordWithoutLetter = new char[wordCharArr.length];
        for (int i = 0; i < wordCharArr.length; i++) {
            // this first loop will find all occurences of the letter
            if(wordCharArr[i] != letter) {
                newWordWithoutLetter[i] = wordCharArr[i];
            }
        }

        System.out.println(newWordWithoutLetter);
    }

    // this is both 2 and 4, it finds and removes dupes and adds to the end of string in sout
    public static void removeDupes() {
        //2. Write a method to remove duplicate characters from a string.

        //4. Write a method to display first non repeated character of a string then the repeating characters.
        //E.g. input morning should display morignn.

        Scanner scr = new Scanner(System.in);
        System.out.print("Whats the word bird: ");
        String string = scr.nextLine();
        String dupes = "";
        boolean foundDupe = false;
    
    	for (int i = 0; i <= string.length()-1; i++) {

    		for (int j = i+1; j < string.length(); j++) {
				
    			if((string.charAt(i) == string.charAt(j))) {
    				dupes = dupes.concat(Character.toString(string.charAt(j)));
                    if(!foundDupe) {
                        dupes = dupes.concat(Character.toString(string.charAt(i)));
                        foundDupe = true;
                    }
    				break;
    			}
				
			}
			
		}

        for (char letter : dupes.toCharArray()) {
            string = string.replaceAll(Character.toString(letter), "");
        }

    	System.out.println(string + dupes);
    }

    public static void countVandE() {
        // 3. Write a method to count the number of vowels and consonants in a string.
        // E.g. if the input is Java the result should be 2 vowels and 2 consonants .

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Scanner scr = new Scanner(System.in);
        System.out.print("Whats the word bird: ");
        String string = scr.nextLine();
        int vowelCount = 0;
        int constCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(string.charAt(i) == vowels[i]) {
                    vowelCount++;
                }
            }
        }

        constCount = string.length() - vowelCount;
    }
}
