package assignment3;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        Map<String, Integer> test = new TreeMap<>();
        test.put("HEllO", 4);
        test.put("JEllO", 3);
        test.put("CELLO" , 3);
        test.put("STARE" , 2);

        Map<String, Integer> sorted =
                test.entrySet()
                        .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                        .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted.toString());

    }

    @Test
    public void initialize() {

    }

    @Test
    public void parse() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input two Words to generate word ladder: ");
        String inString = in.next(); // stores input as a string
        System.out.println(inString);
        ArrayList<String> input = Main.parse(in);
        System.out.println(input);
    }

    @Test
    public void getWordLadderDFS() {
    }

    @Test
    public void getWordLadderBFS() {
    }
//    @Test
//    public void listTest(){
//        Main.initialize();
//        String word = "ZEBRA";
//        ArrayList<String> test = Main.differByOneList(word);
//        System.out.println(test);
//
//    }





    @Test
    public void printLadder() {
        ArrayList<String> ladder = new ArrayList<String>();
        ladder.add("smart");
        ladder.add("start");
        ladder.add("stars");
        ladder.add("soars");
        ladder.add("soaks");
        ladder.add("socks");
        ladder.add("cocks");
        ladder.add("conks");
        ladder.add("cones");
        ladder.add("coney");
        ladder.add("money");
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
    @Test
    public void printLadder1() {

    }

    @Test
    public void makeDictionary() {
    }
}