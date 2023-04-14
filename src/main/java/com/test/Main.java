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
      char[] cityByte = city.toLowerCase().toCharArray();
      Arrays.sort(cityByte);
      List<String> groupOfCities = new ArrayList<>();

      for (String copyOfCity : copyOfCities) {
        char[] copyOfCityByte = copyOfCity.toLowerCase().toCharArray();
        Arrays.sort(copyOfCityByte);
        if (Arrays.equals(cityByte, copyOfCityByte)) {
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
