package conclusion;

import java.sql.Timestamp;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateExample {
    public static void main(String[] args) {
//        Date dt = new Date();
//        System.out.println(dt);
//        Calendar c = Calendar.getInstance();
//        c.setTime(dt);
//        c.add(Calendar.HOUR, 3);
//        dt = c.getTime();
//        System.out.println(dt);
        time();



    }

    public static boolean isCurrentDate(Date date){
//        Instant now = Instant.now();
//        Date dateNow = setTimeToZeros(Date.from(now));
//        Date dateToCompare = setTimeToZeros(date);
//        return dateNow.equals(dateToCompare);
        LocalDate localDate = date
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return LocalDate.now().equals(localDate);
    }

    public static Date setTimeToZeros(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime( date );
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }


    static void time(){
        final long start = System.nanoTime();
        System.out.println(start);
        Date dt = new Date();
        isCurrentDate(dt);
        final long end = System.nanoTime();
        System.out.println(end);
        long duration = (end - start) / 1000000;
        System.out.println(duration);
    }
}
