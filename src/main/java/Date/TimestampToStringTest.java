package Date;

import java.sql.Timestamp;

public class TimestampToStringTest {

  public static void main(String[] args) {

    Timestamp now = new Timestamp(System.currentTimeMillis());
    String time = "The time is: " + now.toString();

    System.out.println(time);
  }
}
