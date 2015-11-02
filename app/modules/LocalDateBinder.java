package modules;

import play.Logger;
import play.data.format.Formatters;
import play.data.format.Formatters.SimpleFormatter;

import javax.inject.Singleton;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;

/**
 * フォームオブジェクトでLocalDateをバインドするためのクラス.
 * Created by nakamurajun on 2015/11/03.
 */
public class LocalDateBinder {

    private LocalDateBinder() {

        Formatters.register(LocalDate.class, new SimpleFormatter<LocalDate>() {

            @Override
            public LocalDate parse(String s, Locale locale) throws ParseException {
                return LocalDate.parse(s);
            }

            @Override
            public String print(LocalDate localDate, Locale locale) {
                return localDate.toString();
            }
        });

    }

    /**
     * ファクトリメソッド.
     * @return
     */
    public static LocalDateBinder register() {
        return new LocalDateBinder();
    }


}
