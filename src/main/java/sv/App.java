package sv;

import sv.sample.DateSorter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        DateSorter dateSorter = new DateSorter();
        List<LocalDate> inputDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );
        System.out.println(dateSorter.sortDates(inputDates));
    }
}
