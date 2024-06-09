import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력 하세요. (이름은 쉼표(,)로 구분)");
        String input = scanner.nextLine();

        String[] splitCarNames = input.split(",");
        List<Car> cars = new ArrayList<>();

        for (String carName : splitCarNames) {
            cars.add(new Car(carName));
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int rounds = scanner.nextInt();

        Game game = new Game(cars);
        game.startGame(rounds);

        System.out.println("실행 결과");

        scanner.close();
    }
}
