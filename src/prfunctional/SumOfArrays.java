package prfunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfArrays {

    public static void main (String args[]){
        Stream<String> streamStrings = Stream.of("Maria", "Antonio", "Juan", "Pedro");




        List<Integer> list = Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);

        Stream<Integer> streamList = list.stream();

        List<String> stringList = streamStrings.collect(Collectors.toList());


    }
}
