package functionalstyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FunctionalStyle {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(50);
        al.add(60);
        al.forEach((e) -> {
            System.out.println("\nElement" + al.indexOf(e));
            System.out.println(e);
            System.out.println(e * e);
            System.out.println(e * 2);
        });

        System.out.println("\nExploring steam method");
        //method chaining or fluent Interface
        al.stream().filter(e -> e > 20).forEach((e) -> {
            System.out.println(e);
        });

        System.out.println("\nInteger Stream");
        IntStream.range(1, 5).forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4}).map(n -> 2 * n + 1).average().ifPresent(System.out::println);

        System.out.println("\nReducre output style 1=" + Arrays.stream(new int[]{10, 20, 30, 40}).map(n -> 2 * n + 1).reduce(1, (a, b) -> a + b));

        int v = Arrays.stream(new int[]{10, 20, 30, 40}).map(n -> 2 * n + 1).reduce(1, (a, b) -> a + b);
        System.out.println("\n Reducer output style 2=" + v);
    }

}
