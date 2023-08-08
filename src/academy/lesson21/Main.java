package academy.lesson21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        Date date = new Date();

        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, 2000);

        System.out.println(date);


        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy yyyyMMdd");

        String format = formatter.format(new Date());
        System.out.println(format);


        try {
            Date parse = formatter.parse(format);
            System.out.println(parse);


            Date parse2 = formatter.parse("09182023 20231809");
            System.out.println(parse2);


        } catch (ParseException e) {
            e.printStackTrace();
        }




    }


}
