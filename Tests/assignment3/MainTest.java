package assignment3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {

    }

    @Test
    public void initialize() {
    }

    @Test
    public void parse() {
    }

    @Test
    public void getWordLadderDFS() {
    }

    @Test
    public void getWordLadderBFS() {
    }

    @Test
    public void printLadder1() {
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
    public void makeDictionary() {
    }
}