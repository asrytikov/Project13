package p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"Ivan", "Alex", "Nickolay", "Alex", "Natasha", "Katya"}));
        System.out.println(names.stream().count());

        System.out.println(names.stream().filter(n->n.length()==4).count());

        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());

        boolean anyObj = names.stream().anyMatch(s -> s.length()>3);
        System.out.println(anyObj);

        boolean all = names.stream().allMatch(s -> s.length()==3);
        System.out.println(all);

        boolean none = names.stream().noneMatch(s -> s=="Nickolay II");
        System.out.println(none);



    }

}
