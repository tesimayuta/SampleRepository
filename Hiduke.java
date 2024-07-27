// 日付
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hiduke {

    public static String addDaysToDate(String inputDate, int daysToAdd) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        try {
            Date d = sdf.parse(inputDate);
            calendar.setTime(d);
            calendar.add(Calendar.DATE, daysToAdd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date (yyyy/MM/dd): ");
        String inputDate = scanner.nextLine();

        System.out.print("Enter the number of days to add: ");
        int daysToAdd = scanner.nextInt();

        String resultDate = addDaysToDate(inputDate, daysToAdd);
        System.out.println("Result Date: " + resultDate);
    }
}