package Date;

import java.sql.Timestamp;
import java.util.Date;

public class DateTest {

  public static void main(String[] args) {

    Date date1 = new Date();
    date1.setTime(11111111);
    Date date2 = new Date();
    date2.setTime(99111111);
    long dateDifference = date2.getTime() - date1.getTime();


    Timestamp timestamp1 = new Timestamp(1111111);
    Timestamp timestamp2 = new Timestamp(99111111);

    long timestampDiff = timestamp2.getTime() - timestamp1.getTime();



    System.out.println(date1);
    System.out.println(date2);
    System.out.println("DIFFERENCE:");
    System.out.println(dateDifference / (1000 * 60 * 60 * 24));
    System.out.println();
    System.out.println("***********************************");
    System.out.println();

    System.out.println(timestamp1);
    System.out.println(timestamp2);
    System.out.println("DIFFERENCE:");
    System.out.println(timestampDiff / (1000 * 60 * 60 * 24));

    Timestamp now = new Timestamp(System.currentTimeMillis());

    System.out.println();
    System.out.println(now);

  }
}
