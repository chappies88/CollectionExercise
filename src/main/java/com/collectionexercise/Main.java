package com.collectionexercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //create empty list to store car
        List<Car> carList = new ArrayList<>();

        //create 5 car objects
        Car car1 = new Car("Toyota", "Pruis", "2010");
        Car car2 = new Car("Camry", "XLE", "2009");
        Car car3 = new Car("Ford", "Explorer", "2023");
        Car car4 = new Car("Kia", "Morning", "2022");
        Car car5 = new Car("Lexus", "Kuru", "2000");
        Car car6 = new Car("Camry", "XLE", "2009");

        //add cars to carList
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        //print each element in carList
        System.out.println("1.List:");
        for(Car car : carList){
            System.out.println(car.toString());
        }

        carList.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMark().compareTo(o2.getMark());
            }
        });
        System.out.println("\n1.1 sort List");
        for(Car car : carList){
            System.out.println(car.toString());
        }

        System.out.println("\n1.2 reverse sort");
        carList.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getMark().compareTo(o1.getMark());
            }
        });
        for(Car car : carList){
            System.out.println(car.toString());
        }
        
        System.out.println("\n2.Set:");
        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car6);
        for(Car car : carSet){
            System.out.println(car.toString());
        }

        //Map exercise
        System.out.println("\n3.Map");
        Map<String, Car> ownerMap = new HashMap<>();
        ownerMap.put("Bob", new Car("Tesla", "X", "2015"));
        ownerMap.put("Jenny", new Car("Tesla", "Y", "2016"));
        ownerMap.put("Sarah", new Car("Tesla", "3", "2019"));


        for(var entry : ownerMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }






    }
}
