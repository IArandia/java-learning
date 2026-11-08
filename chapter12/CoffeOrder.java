import java.util.*;
import java.util.stream.*;

public class CoffeOrder{
    public static void main(String[] args) {
        List<String> coffes = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuccino", "Flat White", "Latte");
        
        List<String> coffesEndingInO = coffes.stream()
                                       .distinct()
                                       .sorted()
                                       .filter(s -> s.endsWith("o"))
                                       .collect(Collectors.toList());

        System.out.println(coffesEndingInO);

    }

}