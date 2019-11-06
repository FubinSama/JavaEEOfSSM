package formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyFormatter implements Formatter<Date> {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        return sdf.parse(text);
    }

    @Override
    public String print(Date object, Locale locale) {
        return sdf.format(object);
    }
}
