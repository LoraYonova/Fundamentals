package FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCar = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> informationCars = new LinkedHashMap<>();


        for (int i = 0; i < numberOfCar; i++) {
            List<String> cars = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

            String car = cars.get(0);
            int mileage = Integer.parseInt(cars.get(1));
            int fuel = Integer.parseInt(cars.get(2));

            informationCars.put(car, new ArrayList<>());
            informationCars.get(car).add(0, mileage);
            informationCars.get(car).add(1, fuel);


        }

        String commands = scan.nextLine();

        while (!commands.equals("Stop")) {

            String[] command = commands.split(" : ");

            String firstCommand = command[0];

            if (firstCommand.equals("Drive")) {
                String car = command[1];
                int distance = Integer.parseInt(command[2]);
                int fuel = Integer.parseInt(command[3]);

                int mileageCar = informationCars.get(car).get(0);
                int fuelCar = informationCars.get(car).get(1);

                if (fuelCar >= fuel) {
                    informationCars.get(car).set(0,mileageCar + distance);
                    informationCars.get(car).set(1,fuelCar - fuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car,distance,fuel);

                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

                if (informationCars.get(car).get(0) >= 100000) {
                    informationCars.remove(car);
                    System.out.printf("Time to sell the %s!%n" , car);
                }

            } else if (firstCommand.equals("Refuel")) {
                String car = command[1];
                int fuel = Integer.parseInt(command[2]);

                int fuelCar = informationCars.get(car).get(1);

                if (fuelCar + fuel > 75) {
                    informationCars.get(car).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n" , car, 75 - fuelCar);
                } else {
                    informationCars.get(car).set(1,fuelCar + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }

            } else if (firstCommand.equals("Revert")) {
                String car = command[1];
                int kilometers = Integer.parseInt(command[2]);

                int mileage = informationCars.get(car).get(0);

                if (mileage - kilometers < 10000) {
                    informationCars.get(car).set(0, 10000);
                } else {
                    informationCars.get(car).set(0,mileage - kilometers);
                    System.out.printf("%s mileage decreased by %d kilometers%n", car,kilometers);
                }
            }


            commands = scan.nextLine();
        }
        informationCars.entrySet()
                .stream()
                .sorted((car1, car2) -> {
                    int result = car2.getValue().get(0) - (car1.getValue().get(0));
                    if (result == 0) {
                        result = car1.getKey().compareTo(car2.getKey());

                    }
                    return result;
                }).forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0),entry.getValue().get(1)));

    }
}
