package profitcalculator.ui.button;

import com.toedter.calendar.JDateChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import profitcalculator.service.RecalculationService;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

@Component
public class RecalculateButtonActionListener implements ActionListener {

    @Autowired
    RecalculationService recalculationService;

    @Autowired
    JTextField resultField;

    @Autowired
    JDateChooser dateChooser;

    @Autowired
    JFormattedTextField amountField;

    public void actionPerformed(ActionEvent e) {
        Date date = dateChooser.getDate();
        int amount = (Integer) amountField.getValue();
        resultField.setText(new Double(recalculationService.recalculate(date, amount)).toString());
    }

}