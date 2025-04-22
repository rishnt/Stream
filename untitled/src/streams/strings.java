package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class strings {
    public static void main(String [] args){
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");
        names.add("Fiona");
        names.add("George");
        names.add("Hannah");
        names.add("Ishaan");
        names.add("Jasmine");
        names.add("Diana");
        names.add("Ethan");
        names.add("Fiona");
        names.add("George");

      List<String> n=  names.stream().filter(name -> name.toLowerCase().charAt(0)=='a').collect(Collectors.toList());
      System.out.println(n);

long count=names.stream().filter(nam -> nam.length()>5).count();
System.out.println(count);

List<String> unique_elements= names.stream().distinct().collect(Collectors.toList());
System.out.println(unique_elements);

// only non-duplicate elements
List<String> unique = names.stream()
        .collect(Collectors.groupingBy(people -> people,Collectors.counting()))
        .entrySet().stream()
        .filter(ent ->ent.getValue()==1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());


List<String> reverse = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(reverse);

//Group a list of strings by their first character.
        Map<Character, List<String>> groupedByFirstChar = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedByFirstChar);

//        Join a list of strings with a comma separator.
        String joins=names.stream().collect(Collectors.joining(", "));

        //Given a list of strings, convert it to a map where the key is the string and the value is its length.
        Map<String, Integer> list= names.stream()
                .collect(Collectors
                        .toMap(na -> na,
                                na->na.length(),
                                (oldValue, newValue) -> oldValue
                        ));
        System.out.println(list);
    }
}
