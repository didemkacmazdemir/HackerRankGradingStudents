package com.didem.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        double closeFiveMultiple = 0.0;
        double difference = 0.0;
        List<Integer> finalResult = new ArrayList<>();
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) < 38){
                finalResult.add(grades.get(i));
            }else{
                closeFiveMultiple = 5*(Math.ceil(Math.abs(Double.valueOf(grades.get(i))/5)));
                difference = closeFiveMultiple - Double.valueOf(grades.get(i));

                if(difference < 3){
                    finalResult.add((int) closeFiveMultiple);
                }else{
                    finalResult.add(grades.get(i));
                }
            }
        }
        return finalResult;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }*/
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> result = Result.gradingStudents(grades);

        /*for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
