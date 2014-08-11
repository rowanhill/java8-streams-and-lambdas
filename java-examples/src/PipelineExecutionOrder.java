import java.util.stream.IntStream;

public class PipelineExecutionOrder {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                // .parallel()
                .map(i -> {
                    System.out.println("Doubling: " + i);
                    return i * 2;
                })
                .filter(i -> {
                    System.out.println("Filtering out > 7: " + i/2);
                    return i > 7;
                })
                .count();
    }
}
