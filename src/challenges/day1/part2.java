package challenges.day1;

import java.io.*;
import java.util.ArrayList;

public class part2 {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/challenges/day1/input.txt");
        BufferedReader br = new BufferedReader(file);
        long start = System.currentTimeMillis();
        String line;
        int result = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        int counter = 0;
        int partResult = 0;

        while ((line = br.readLine()) != null){
            nums.clear();
            counter++;
            int hit = 0;
            for(int i = 0; i < line.length(); i++){
                if(line.substring(hit, i+1).contains("1")) { hit=i+1; nums.add(1);}
                if(line.substring(hit, i+1).contains("one")) { if(i>1) hit=i-1; nums.add(1);}
                if(line.substring(hit, i+1).contains("2")) { hit=i+1;nums.add(2);}
                if(line.substring(hit, i+1).contains("two")) { if(i>1) hit=i-1; nums.add(2);}
                if(line.substring(hit, i+1).contains("3")) { hit=i+1;nums.add(3);}
                if(line.substring(hit, i+1).contains("three")) { if(i>1) hit=i-1; nums.add(3);}
                if(line.substring(hit, i+1).contains("4")) { hit=i+1;nums.add(4);}
                if(line.substring(hit, i+1).contains("four")) { if(i>1) hit=i-1; nums.add(4);}
                if(line.substring(hit, i+1).contains("5")) { hit=i+1;nums.add(5);}
                if(line.substring(hit, i+1).contains("five")) { if(i>1) hit=i-1; nums.add(5);}
                if(line.substring(hit, i+1).contains("6")) { hit=i+1;nums.add(6);}
                if(line.substring(hit, i+1).contains("six")) { if(i>1) hit=i-1; nums.add(6);}
                if(line.substring(hit, i+1).contains("7")) { hit=i+1;nums.add(7);}
                if(line.substring(hit, i+1).contains("seven")) { if(i>1) hit=i-1; nums.add(7);}
                if(line.substring(hit, i+1).contains("8")) { hit=i+1;nums.add(8);}
                if(line.substring(hit, i+1).contains("eight")) { if(i>1) hit=i-1; nums.add(8);}
                if(line.substring(hit, i+1).contains("9")) { hit=i+1;nums.add(9);}
                if(line.substring(hit, i+1).contains("nine")) { if(i>1) hit=i-1; nums.add(9);}
            }
            if(nums.size() == 1){
                partResult = (nums.getFirst()*10) + nums.getFirst();
            }
            if(nums.size() > 1){
                partResult = (nums.getFirst()*10) + nums.getLast();
            }
//            System.out.println("zeile " + counter + ": " + partResult);
            result += partResult;
        }
        System.out.println(result);
        System.out.println("DAUER: " + (System.currentTimeMillis() - start));
        file.close();
    }
}
