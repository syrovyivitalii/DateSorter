package sv.sample;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DateSorter {
    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> datesWithR = unsortedDates.stream()
                .filter(date -> date.getMonth().name().toLowerCase().contains("r"))
                .sorted()
                .collect(Collectors.toList());

        List<LocalDate> datesWithoutR = unsortedDates.stream()
                .filter(date -> !date.getMonth().name().toLowerCase().contains("r"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        datesWithR.addAll(datesWithoutR);

        return datesWithR;
    }
}
