package br.com.hackerhank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Result {


    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    ArrayList<Integer> arrOut = new ArrayList();
        int cont = 0;
        int m5 = 0;
        int dif = 0;
        while (cont != grades.size()){
            
            if (grades.get(cont) > 35) {
                for (int i = grades.get(cont);i < 101; i++){
                    if (i % 5 == 0){
                        m5 = i;
                        dif = m5 - grades.get(cont);
                        break;
                    }
                }
            
            if (dif < 3){
                if (dif == 0){break;}
                for (int i = grades.get(cont);i < 101; i++){
                    if (i % 5 == 0){
                        arrOut.add(i);
                        break;
                    }
                }  
            }else { arrOut.add(grades.get(cont));}    
           
                
            }else {
                arrOut.add(grades.get(cont));
                
            }
            cont++;
        }
        
    
    return arrOut;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
