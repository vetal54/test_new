package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> cities = List.of("London", "Nlondo", "Tokyo", "Kyoto", "Moscow", "Donlon", "Scowmo", "Liverpool");
    List<String> copyOfCities = new ArrayList<>(cities);
    List<List<String>> answer = new ArrayList<>();
    for (String city : cities) {
      List<String> groupOfCities = new ArrayList<>();
      for (String copyOfCity : copyOfCities) {
        if (Arrays.equals(city.toLowerCase().chars().sorted().toArray(),
            copyOfCity.toLowerCase().chars().sorted().toArray())) {
          groupOfCities.add(copyOfCity);
        }
      }
      if (!groupOfCities.isEmpty()) {
        answer.add(groupOfCities);
        copyOfCities.removeAll(groupOfCities);
      }
    }
    System.out.println(answer);
  }
}
