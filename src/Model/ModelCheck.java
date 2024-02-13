package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import MyException.*;

public class ModelCheck {

    public String checkDate(String data) {
        String DATE_FORMAT = "dd.MM.yyyy";

        if (data.matches("^(0?[1-9]|[12][0-9]|3[0-1])\\.(0?[1-9]|1[0-9])\\.\\d{4}$")) {

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(data);
                return data;


            } catch (ParseException e) {
                throw new MyDateException(String.format("Введенная дата <%s> не существует",
                        data));
            }
        }
        else {
            throw new MyDateException(String.format("Введенная дата <%s> не соответствует формату dd.MM.yyyy",
                    data));
        }
    }

    public String checkPhone(String data) {
        if (data.length() == 10) {
            try {
                Long.parseLong(data);
                return data;
            } catch (NumberFormatException e) {
                throw new PhoneException("Введен некорректный номер телефона");
            }
        }
        else throw new PhoneException("Номер должен содержать 10 цифр");


    }

    public String checkGender(String data) {
        if (data.equals("f") || data.equals("m")) {
            return data;
        }
        else throw new GenException("Неккорректный формат ввода пола");
    }
}
