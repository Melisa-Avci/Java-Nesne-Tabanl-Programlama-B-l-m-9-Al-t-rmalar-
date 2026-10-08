import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; 
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("simdiki tarih: " +  day+ "-" + month + "-" + year);

        calendar.setTimeInMillis(1234567898765L);
        int year2 = calendar.get(GregorianCalendar.YEAR);
        int month2 = calendar.get(GregorianCalendar.MONTH) + 1;
        int day2 = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println(" istenen tarih: " +  day2+ "-" + month2 + "-" + year2);
    }
}
