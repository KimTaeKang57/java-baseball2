import java.util.List;

public class Game {
    private List<Car> cars;

    public Game(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    private void printCarPosition(Car car) {
        System.out.println(car.getName() + " : ");
        int carPosition = car.getPosition();
        for (int i = 0; i < carPosition; i++) {
            System.out.println("-");
        }
        System.out.println();
    }
}
