package util_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Example {

    public static void main(String[] args) {
         
        List<Double> temp = new ArrayList<Double>();
         
        temp.add(40.5);
        temp.add(33.9);
        temp.add(37.8);
        temp.add(15.3);
        temp.add(25.6);
         
        // Print elements of temperatureList
        System.out.println(temp);
         
        // Sorting List in ascending order according to the natural ordering 
        Collections.sort(temp);
        System.out.println("Sorted List: "+temp);
         
        // Searching a temperature from list
        int searchIndex = Collections.binarySearch(temp, 37.8);
        if(searchIndex >=0){
            System.out.println("Temperature found.");
        }
        else{
            System.out.println("Temperature not found.");
        }
         
        //Shuffles the list
        Collections.shuffle(temp);
        System.out.println("Shuffled List: "+temp);
         
        //Fill temperatureList.
        Collections.fill(temp, 0.0);
        System.out.println("Filled List: "+temp);
             
    }

}
