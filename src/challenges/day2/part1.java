package challenges.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class part1 {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/challenges/day2/input.txt");
        BufferedReader br = new BufferedReader(file);
        long start = System.currentTimeMillis();
        String line;
        Set<Integer> resultSet = new HashSet<>();
        int result = 0;

        while ((line = br.readLine()) != null) {
            int id = getIdPerLine(line);
            String eachPull = "";
            String eachTryPerLine = "";
            boolean gamePossible = true;
            for(int i = 0; i <line.split(":")[1].split(";").length; i++){
                eachTryPerLine = line.split(":")[1].trim().split(";")[i];
                for(int j = 0; j < eachTryPerLine.split(",").length; j++){
                    eachPull = eachTryPerLine.split(",")[j].trim();
                    if(!eachPull.isEmpty()){
                        if(checkIfPulledMore(eachPull)){
                            gamePossible = false;

                        }
                    }
                }
            }
            if(gamePossible){
                resultSet.add(id);
            }
        }
        for(int game : resultSet){
            result += game;
        }
        System.out.println("Result: " + result);
        System.out.println("Dauer: " + (System.currentTimeMillis() - start));
        br.close();
    }

    private static boolean checkIfPulledMore(String eachPull) {
        int maxRed = 12;
        int maxGreen = 13;
        int maxBlue = 14;
        int num = 0;
        String color = "";
        boolean result = false;

        num = Integer.parseInt(eachPull.split(" ")[0]);
        color = eachPull.split(" ")[1];

        switch (color){
            case "red": if(num > maxRed) result = true; break;
            case "blue": if(num > maxBlue) result = true; break;
            case "green": if(num > maxGreen) result = true; break;
            default: break;
        }
        return result;
    }

    private static int getIdPerLine(String line) {
        int id = 0;
        int length = line.split(" ")[1].length();
        id = Integer.parseInt(line.split(" ")[1].substring(0, length-1));
        return id;
    }

}
