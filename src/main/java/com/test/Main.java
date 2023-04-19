package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    List<String> cities = List.of("London", "Nlondo", "Tokyo", "Kyoto", "Moscow", "Donlon", "Scowmo", "Liverpool");
    Map<Integer, List<String>> answer = new HashMap<>();
    for (String city : cities) {
      answer.computeIfAbsent(hashCode(city), k -> new ArrayList<>()).add(city);
    }
    System.out.println(answer);
  }

  public static int hashCode(String str) {
    return Arrays.hashCode(str.toLowerCase().chars().sorted().toArray());
  }
}
