package p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,0}));
        Optional<Integer> min = integers.stream().min(Integer::compare);
        Optional<Integer> max = integers.stream().max(Integer::compare);
        System.out.println(min.get());
        System.out.println(max.get());

    }

}
