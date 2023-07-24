package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "Nokia 9", "iPhone 13", "Samsung Galaxy S8", "Meizu Pro", "aPhone");

        phones.stream().filter(p->p.length()<10).sorted().forEach(System.out::println);


    }

}
