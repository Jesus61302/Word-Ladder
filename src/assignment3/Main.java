/* WORD LADDER Main.java
 * EE422C Project 3 submission by
 * Replace <...> with your actual data.
 * <Student1 Name>
 * <Student1 EID>
 * <Student1 5-digit Unique No.>
 * <Student2 Name>
 * <Student2 EID>
 * <Student2 5-digit Unique No.>
 * Slip days used: <0>
 * Git URL:
 * Spring 2022
 */


package assignment3;
import java.util.*;
import java.io.*;

public class Main {
	
	Boolean quit;
	
	public static void main(String[] args) throws Exception {
		
		Scanner kb;	// input Scanner for commands
		PrintStream ps;	// output file, for student testing and grading only
		// If arguments are specified, read/write from/to files instead of Std IO.
		if (args.length != 0) {
			kb = new Scanner(new File(args[0]));
			ps = new PrintStream(new File(args[1]));
			System.setOut(ps);			// redirect output to ps
		} else {
			kb = new Scanner(System.in);// default input from Stdin
			ps = System.out;			// default output to Stdout
		}
		initialize();
		// test parse
		// TODO methods to read in words, output ladder
		while (true){
			ArrayList<String> input = Main.parse(kb);
			System.out.println(input);
		}

	}
	
	public static void initialize() {
		// initialize your static variables or constants here.
		// We will call this method before running our JUNIT tests.  So call it 
		// only once at the start of main.
	}
	
	/**
	 * @param keyboard Scanner connected to System.in
	 * @return ArrayList of Strings containing start word and end word. 
	 * If command is /quit, return null. 
	 */
	public static ArrayList<String> parse(Scanner keyboard) {
		// initializes variables that will be used in loop
		Boolean isValid = false;
		ArrayList<String> input2 = new ArrayList<>();
		List<String> input = new ArrayList<>(); //creates array list that will be used to store input words
		String inString;
		String [] arr;

		// loop that continues to ask for inputs
		while(!isValid){
			System.out.println("Input two Words to generate word ladder: ");
			inString = keyboard.nextLine(); // stores input as a string
			arr = inString.split(" ");
			input = Arrays.asList(arr); // changes the  array of input strings into a list;
			input2.addAll(input);
			input2.removeIf(el -> el.equals("")); //removes all empty elements(for when more than one space is entered during input)
			isValid = true;
		 	if (input2.contains("/quit")) {
				return null;
			}
			if (input2.size() != 2) {
				isValid = false;
				System.out.println("Invalid entry");

			}
		}

		return input2;
	}
	
	public static ArrayList<String> getWordLadderDFS(String start, String end) {
		
		// Returned list should be ordered start to end.  Include start and end.
		// If ladder is empty, return list with just start and end.
		// TODO some code
		
		return null; // replace this line later with real return
	}
	
    public static ArrayList<String> getWordLadderBFS(String start, String end) {
		
		// TODO some code
		
		return null; // replace this line later with real return
	}
    
	
	public static void printLadder(ArrayList<String> ladder) {
		if(ladder.size() == 2){
			System.out.println("no word ladder can be found between " + ladder.get(0).toLowerCase() + " and " + ladder.get(1).toLowerCase() + ".");
		}
		else{
			System.out.println("a " + (ladder.size() - 2) + "-rung word ladder exists between " + ladder.get(0).toLowerCase() + " and " + ladder.get(ladder.size() - 1).toLowerCase() + ".");
			for(int i = 0; i < ladder.size(); i++){
				System.out.println(ladder.get(i).toLowerCase());
			}
		}
	}
	// TODO
	// Other private static methods here


	/* Do not modify makeDictionary */
	public static Set<String>  makeDictionary () {
		Set<String> words = new HashSet<String>();
		Scanner infile = null;
		try {
			infile = new Scanner (new File("assignment3/five_letter_words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary File not Found!");
			e.printStackTrace();
			System.exit(1);
		}
		while (infile.hasNext()) {
			words.add(infile.next().toUpperCase());
		}
		return words;
	}
}
