package TechCrunch.Users;

import java.util.Random;

public class UserPool {

    public static String generateRandomName() {
        // Length of the name
        int length = 6 + new Random().nextInt(5); // Random length between 6 and 10
        StringBuilder name = new StringBuilder();
        Random random = new Random();

        // Generate a random name starting with an uppercase letter
        name.append((char) (random.nextInt(26) + 'A')); // First character is uppercase

        // Generate the rest of the name with lowercase letters
        for (int i = 1; i < length; i++) {
            name.append((char) (random.nextInt(26) + 'a'));
        }
        return name.toString();
    }

    public static String randomYearGenerator() {
        int startYear = 1960;
        int endYear = 2004;

        Random random = new Random();
        int year = startYear + random.nextInt(endYear - startYear + 1);
        return Integer.toString(year);
    }

    public static User getUser1() {
        return new User("ski4ko2011@radiantliving.org", "Firstname" + generateRandomName(), "Surname" + generateRandomName(), randomYearGenerator());
    }
}
