package challenges.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class part2 {


    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/challenges/day2/input.txt");
        BufferedReader br = new BufferedReader(file);
        long start = System.currentTimeMillis();
        String line;
        HashMap<String, Integer> pullSet = new HashMap<>();
        int pullResult = 0;
        int result = 0;

        while ((line = br.readLine()) != null) {
            String eachPull = "";
            String eachTryPerLine = "";
            String game = line.split(":")[1];
            String[] pulls = game.split(";");
            int minRed = 1;
            int minGreen = 1;
            int minBlue = 1;

            for(String pull : pulls){
                String[] cubes = pull.split(",");
                for(String cube : cubes){
                    String trimmedPull = cube.trim();
                    if(!trimmedPull.isEmpty()){
                        int num = Integer.parseInt(trimmedPull.split(" ")[0]);
                        String color = trimmedPull.split(" ")[1];

                        switch (color){
                            case "red": if(num > minRed){minRed = num;}  break;
                            case "blue": if(num > minBlue) {minBlue = num;} break;
                            case "green": if(num > minGreen) {minGreen = num;} break;
                            default: break;
                        }
                    }
                }
            }
            result += (minBlue * minGreen * minRed);
        }

        System.out.println("Result: " + result);
        System.out.println("Dauer: " + (System.currentTimeMillis() - start));
        br.close();
    }
}
