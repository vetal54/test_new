package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    List<String> cities = List.of("London", "Nlondo", "Tokyo", "Kyoto", "Moscow", "Donlon", "Scowmo", "Liverpool");
    Map<String, List<String>> answer = new HashMap<>();
    for (String city : cities) {
      answer.computeIfAbsent(stringFunction(city), k -> new ArrayList<>()).add(city);
    }
    System.out.println(answer.values());
  }

  public static String stringFunction(String str) {
    return str.toLowerCase()
        .chars()
        .sorted()
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
