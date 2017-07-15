package Date;

import java.sql.Timestamp;

public class TimestampAddToDate {

  public static void main(String[] args) {

    Timestamp addTo = new Timestamp(1498140000000l);
    Timestamp addTo2 = new Timestamp(1498053600000l);

    System.out.println(addTo);
    System.out.println(addTo2);

    long diff = addTo.getTime() - addTo2.getTime();
    System.out.println(diff);

    System.out.println(24 * 60 * 60 * 1000);

  }
}
