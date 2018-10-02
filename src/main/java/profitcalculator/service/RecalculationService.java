package profitcalculator.service;

import java.util.Date;

public interface RecalculationService {
    double recalculate(Date date, int amount);
}
