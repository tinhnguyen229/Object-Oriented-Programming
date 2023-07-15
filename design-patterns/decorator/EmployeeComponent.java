package decorator;

import java.text.*;
import java.util.*;

public interface EmployeeComponent {

    String getName();

    boolean getGender();

    void doTask();

    void join(Date joinDate);

    void terminate(Date terminateDate);

    default String formatDate(Date theDate) {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(theDate);
    }

    default void showBasicInformation() {
        System.out.println("-----------");
        System.out.println("The basic information of " + getName());
        Calendar date = Calendar.getInstance();

        terminate(date.getTime());

        date.add(Calendar.YEAR, -2);
        join(date.getTime());

    }
}
