package homework_01_12_2023;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dictionary {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Реализация больших планов Узбекистана по превращению в крупного международного игрока химической отрасли идет полным ходом. В центре этого процесса — уже построенный завод по превращению природного газа в жидкие углеводороды стоимостью 2,83 млрд евро и строительство комплекса по переработке метанола в олефины стоимостью более 3 млрд евро.\n" +
                "\n" +
                "Узбекистан богат метаном, основным компонентом природного газа. Просто спросите Китай, который до недавнего времени был крупным покупателем непереработанного узбекского газа, или любого автовладельца в самом Узбекистане.\n" +
                "\n" +
                "Согласно опубликованному в июне государственному отчету, почти две трети транспортных средств страны оснащены двигателями, работающими на метане. Для сравнения, по данным британской транспортной исследовательской");

        list.stream()
                .flatMap(line -> Stream.of(line.split("\\s+")))
                .map(word -> word.replaceAll("[^A-Яа-яЁё]+", "").toLowerCase())
                .filter(word -> word.length() > 2)
                .collect(Collectors.toMap(key -> key, val -> 1, (a, b) -> Integer.sum(a, b)))
                .forEach((key1, value) -> System.out.println(key1 + " " + value));
    }
}

