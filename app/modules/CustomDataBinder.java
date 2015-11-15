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
public class CustomDataBinder {

    public CustomDataBinder() {

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

        Formatters.register(Optional.class, new SimpleFormatter<Optional>() {

            @Override
            public Optional<String> parse(String s, Locale locale) throws ParseException {
                Logger.info("s:{}", s);
                return StringUtils.isEmpty(s) ? Optional.<String>empty() : Optional.of(s);
            }

            @Override
            public String print(Optional optioal, Locale locale) {
                return optioal.toString();
            }
        });

    }


}
