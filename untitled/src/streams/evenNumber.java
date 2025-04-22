package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class evenNumber {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

     List<Integer>n=   numbers.stream().filter(num -> num%2==0).collect(Collectors.toList());
     System.out.print(n);

     List<Integer> squares=numbers.stream().map(num -> num*num).collect(Collectors.toList());
     System.out.print(squares);

     int sum=numbers.stream().mapToInt(Integer::intValue).sum();
     System.out.println(sum);
    }

}
