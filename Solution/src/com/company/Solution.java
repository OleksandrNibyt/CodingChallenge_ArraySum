package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'arraySum' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY inputs
     *  2. INTEGER_ARRAY tests
     */

    public static boolean arraySum(List<Integer> inputs, List<Integer> tests) {
        // Write your code here

        boolean myres = false;
        for (int k = 0; k < tests.size(); k++) {
        for (int i = 0; i < inputs.size() - 1; i++) {
            for (int j = i + 1; j < inputs.size(); j++) {
                    if (inputs.get(i) + inputs.get(j) == tests.get(k)) {
                        System.out.println(tests.get(k));
                        myres = true;
                        return myres;
                    } else myres = false;
                }
            }
        }
        return myres;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> inputs = IntStream.range(0, inputsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int testsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> tests = IntStream.range(0, testsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());
        */
        List<Integer> inputs = Arrays.asList(-1, 8, 3);
        List<Integer> tests = Arrays.asList(3, 7, 2);

        boolean result = Result.arraySum(inputs, tests);

        System.out.println(result);
        /*
        bufferedWriter.write(String.valueOf(result ? 1 : 0));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

         */
    }
}
