package com.example.tpo4;

import javax.xml.xpath.XPath;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class CarDataLoader{
    public static List<Car> loadCarsByCategory(String category) throws FileNotFoundException {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aleks\\OneDrive\\Pulpit\\TPO4\\nowyPlik.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] carData = line.split(";");
                if (carData[0].equalsIgnoreCase(category)) {
                    Car car = new Car(carData[0], carData[1], Integer.parseInt(carData[2]), Double.parseDouble(carData[3]), carData[4]);
                    cars.add(car);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }
}
