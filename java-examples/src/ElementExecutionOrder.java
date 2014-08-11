import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ElementExecutionOrder {
    public static void main(String[] args) {
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<>());

        List<Integer> list2 =
                IntStream.range(0, 10)
                        // .parallel()
                        .boxed()
                        .peek(list1::add)
                        .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(list2);
    }
}
