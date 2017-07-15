package Date;

import java.sql.Timestamp;

public class TimestampDiffCounter {

  public static void main(String[] args) {

    Timestamp date1 = new Timestamp(1497441600000l);
    Timestamp date2 = new Timestamp(1497470400000l);
    Timestamp date3 = new Timestamp(1497794400000l);
    Timestamp date4 = new Timestamp(1497794400000l - 86400);



    System.out.println(daysSinceLastRefresh(date1));

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);
    System.out.println(date4);
  }

  public static int daysSinceLastRefresh(Timestamp inputTS) {
    Timestamp now = new Timestamp(System.currentTimeMillis());
    long differenceAsLong = now.getTime() - inputTS.getTime();
    int differenceAsDays = (int)(differenceAsLong / (1000 * 60 * 60 * 24));

    return differenceAsDays;
  }
}
