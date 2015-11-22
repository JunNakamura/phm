package modules;

import org.apache.commons.lang3.StringUtils;
import play.Logger;
import play.data.format.Formatters;
import play.data.format.Formatters.SimpleFormatter;

import javax.inject.Singleton;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Optional;

/**
 * フォームオブジェクトでLocalDateをバインドするためのクラス.
 * Created by nakamurajun on 2015/11/03.
 */
@Singleton
public class CustomDataBinder {

    protected CustomDataBinder() {

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


}
