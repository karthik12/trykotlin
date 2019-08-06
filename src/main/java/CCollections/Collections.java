package CCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-4);
        numbers.add(5);
        numbers.add(-6);

        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 0) {
                positives.add(number);
            } else {
                negatives.add(number);
            }
        }

        //explain for each and stream
    }


}
