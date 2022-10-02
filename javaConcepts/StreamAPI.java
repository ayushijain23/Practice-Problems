package javaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> result = list.stream().filter(x -> x % 2== 0).map( x -> x * 10).collect(Collectors.toList());
        result.stream().filter(x -> x > 40).forEach(y -> System.out.print(y+" "));
        System.out.println();
        System.out.println(result);

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result2 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result2);
    }
}
