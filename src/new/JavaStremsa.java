import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

class JavaStreams {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(6, 3, 63, 2, 0);

        a.stream().forEach(array -> {
            System.out.println(array);
        });

        // List<Integer> c = a.stream()
        //         .filter(b -> b >= 3)
        //         .collect(Collectors.toList());

        System.out.println("After reverse sort");

        a.stream()
            .filter(x -> x >= 0)
            .sorted(Comparator.naturalOrder())
            .forEach(p -> {
                System.out.println(p);
            });

    }
}
