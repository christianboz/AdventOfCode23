package challenges.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class part1 {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/challenges/day1/input.txt");
        BufferedReader br = new BufferedReader(file);
        long start = System.currentTimeMillis();
        String line;
        int result = 0;
        ArrayList<Integer> nums1 = new ArrayList<>();
        int counter = 0;
        int partResult = 0;

        while ((line = br.readLine()) != null){
            nums1.clear();
            counter++;
            for(int i = 0; i < line.length(); i++){
                switch (line.charAt(i)){
                    case '1': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '2': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '3': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '4': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '5': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '6': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '7': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '8': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    case '9': nums1.add(Integer.parseInt(String.valueOf(line.charAt(i)))); break;
                    default: break;
                }
            }
            if(nums1.size() == 1){
                partResult = (nums1.getFirst()*10) + nums1.getFirst();
            }
            if(nums1.size() > 1){
                partResult = (nums1.getFirst()*10) + nums1.getLast();
            }
            System.out.println("zeile " + counter + ": " + partResult);
            result += partResult;
        }
        System.out.println(result);
        System.out.println("DAUER: " + (System.currentTimeMillis() - start));
        file.close();
    }
}
