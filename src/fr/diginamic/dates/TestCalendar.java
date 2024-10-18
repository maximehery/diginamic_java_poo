package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 4, 19);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(calendar.getTime()));

        Calendar calendar2 = Calendar.getInstance();
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat2.format(calendar2.getTime()));

        // Français
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.forLanguageTag("fr-FR"));
        System.out.println(dateFormat3.format(calendar2.getTime()));

        // Russe
        SimpleDateFormat dateFormat4 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.forLanguageTag("ru-RU"));
        System.out.println(dateFormat4.format(calendar2.getTime()));

        // Chinois
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.forLanguageTag("zh-CN"));
        System.out.println(dateFormat5.format(calendar2.getTime()));

        // Allemand
        SimpleDateFormat dateFormat6 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("de-DE"));
        System.out.println(dateFormat6.format(calendar2.getTime()));
    }
}
