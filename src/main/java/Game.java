import java.util.ArrayList;
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
        System.out.print(car.getName() + " : ");
        int carPosition = car.getPosition();
        for (int i = 0; i < carPosition; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void startGame(int rounds){
        for (int i = 0; i < rounds; i++) {
            for (Car car : cars) {
                car.moveOrStop();
                printCarPosition(car);
            }
            System.out.println();
        }
        decideGameWinner(rounds);
    }

    private void decideGameWinner(int rounds) {
        List<String> winnerNames = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == rounds) {
                winnerNames.add(car.getName());
            }
        }
        System.out.println("최종 우승자 : " + String.join(", ", winnerNames));
    }
}