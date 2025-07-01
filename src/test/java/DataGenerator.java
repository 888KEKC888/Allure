import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator(){

    }

    public static String generateData(int shift, String pattern) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern(pattern));
    }
    public static String generateCity (String locale) {
        String[] cities = { "Армавир", "Волгоград", "Ставрополь", "Ростов-на-Дону",
                "Белгород", "Калининград", "Владивосток", "Краснодар", "Йошкар-Ола",
                "Грозный", "Махачкала", "Москва", "Санкт-Петербург", "Псков",
                "Иваново"};
        Random random = new Random();
        String city = cities [random.nextInt(cities.length)];
        return city;

    }
    public static String generateName (String locale) {
        var faker = new Faker (new Locale(locale));
        return faker.name().lastName() +" "+ faker.name().firstName();
    }
    public static String generatePhone (String locale) {
        var faker = new Faker (new Locale(locale));
        return faker.phoneNumber().phoneNumber();

    }
}