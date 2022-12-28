package code;

import java.text.SimpleDateFormat;

public class DateFormat {
    public static void main(String[] args) {
        String date = "2002-02-02";
        System.out.println(getDate(date));

    }

    public static String getDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String getDate = format.format(date);
        return getDate;
    }

}
