public class Solution {

    public enum Car {
        BMW, Audi, Honda, Toyota
    }

    public static void main(String[] args) {
        for (Car car : Car.values()) {
            if (car.name().equalsIgnoreCase("bmw")) {
                System.out.println(car);
            }
        }
    }
}
