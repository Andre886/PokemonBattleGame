package giocofinal;
import java.util.*;

public class Current
{
  public String ora()
  {
      Calendar calendar = new GregorianCalendar();
      String hour;
      int time = calendar.get(Calendar.HOUR);
      int m = calendar.get(Calendar.MINUTE);
      int sec = calendar.get(Calendar.SECOND);

      if(calendar.get(Calendar.AM_PM) == 0)
          hour = "A.M.";
      else
          hour = "P.M.";
      System.out.println(time + ":" + m + ":" + sec + " " + hour);
      String hour2 = time + ":" + m + " " + hour;
      return hour2;
  }
  }
