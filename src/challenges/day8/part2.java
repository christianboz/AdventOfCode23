package challenges.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class part2 {

        public static void main(String[] args) throws IOException {
            FileReader file = new FileReader("challenges/day2/input.txt");
            BufferedReader br = new BufferedReader(file);
            long start = System.currentTimeMillis();


            br.close();
        }
}
