package Date;

import java.time.LocalDate;

public class DateParser {

  public static void main(String[] args) {

    LocalDate newDate = LocalDate.parse("2007-01-27");
    System.out.println(newDate);
  }
}
