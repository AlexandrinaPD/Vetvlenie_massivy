import java.util.Arrays;

public class TaskMassOne {
    public static void main(String[] args) {
        String[] fruits = new String[10];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Lemon";
        fruits[3] = "Grape";
        fruits[4] = "Orange";
        fruits[5] = "Melon";
        fruits[6] = "Watermelon";
        fruits[7] = "Pineapple";
        fruits[8] = "Pear";
        fruits[9] = "Persimmon";

        String[] food = Arrays.copyOf(fruits, fruits.length);
        System.out.println(food[0] + "\n" + food[1] + "\n" + food[2] + "\n" + food[3] + "\n" + food[4] + "\n" + food[5] + "\n" + food[6] + "\n" + food[7] + "\n" + food[8] + "\n" + food[9]);

    }
}
