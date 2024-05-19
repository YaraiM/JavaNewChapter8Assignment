package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
  public static void main(String[] args) {
    try {
      Path path = Path.of("src/main/resources/Assignment8.txt");
      Files.writeString(path, "を提出します", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生しました!　１回目");
      try {
        Path path = Path.of("src/main/resources/Assignment8.txt");
        Files.writeString(path, "を提出します", StandardOpenOption.APPEND);
        System.out.println(Files.readString(path));
      } catch (IOException ex) {
        ex.printStackTrace();
        System.out.println("例外が発生しました!　２回目");
      }
    }
  }
}
