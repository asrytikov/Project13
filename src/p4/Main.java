package p4;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(
                new Phone("Pixel 2", "Google", 60000),
                new Phone("iPhone 13", "Apple", 120000),
                new Phone("Galaxy S9", "Samsung", 50000)
        );

        phoneStream.sorted(new PhoneComparator()).forEach(
                p -> System.out.printf("%s (%s) - %d \n", p.getName(), p.getCompany(), p.getPrice())
        );

    }

}

class PhoneComparator implements Comparator<Phone>{

    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
