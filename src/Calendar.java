import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Calendar extends JFrame {
    public Calendar() {
         Integer day = 0;
         Integer sd = 0;
        JFrame windows = new JFrame("Calendar");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October","November","December"};
        Integer[] days  = {31,28,31,30,31,30,31,31,30,31,30,31};
        Integer[] startingDay={6,2,2,5,7,3,5,1,4,6,2,4};
        String ChooseTheMonth = (String) JOptionPane.showInputDialog(
                windows,
                "Choose the month of the calendar",
                "Choose Month",
                JOptionPane.QUESTION_MESSAGE,
                null,
                months, months[0]);
        for(int i=0;i<=11;i++) {
            if (ChooseTheMonth == months[i]) {
                day = days[i];
                sd = startingDay[i];
            }
            if(ChooseTheMonth == null){
                System.exit(0);
            }
        }
        windows.setSize(1000, 800);
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windows.toFront();
        Design design = new Design(day+7+sd,ChooseTheMonth,sd);
        windows.add(design);
        windows.setResizable(false);
    }

}

