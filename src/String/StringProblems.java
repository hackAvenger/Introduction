package String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringProblems {
  public static void main(String[] args){
      System.out.println(LocalDate.parse("20-03-22",DateTimeFormatter.ofPattern("dd-MM-yy")));

  }

}

