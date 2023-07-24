package p2;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 13", 130000),
                new Phone("Samsung", 50000),
                new Phone("Xiaomi", 20000)
                );

        //phoneStream.filter(phone -> phone.getPrice()<100000).forEach(phone -> System.out.println(phone.getName()));

        //phoneStream.map(phone -> "Name: " + phone.getName() + " price: "+ phone.getPrice()).forEach(s -> System.out.println(s));

        phoneStream.flatMap(phone -> Stream.of(
                String.format("Name: %s price without discont: %d", phone.getName(), phone.getPrice()),
                String.format("Name: %s price with discont: %d", phone.getName(), phone.getPrice() - (int)(phone.getPrice()*0.1))
        )).forEach(System.out::println);
    }

}

class Phone{
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
