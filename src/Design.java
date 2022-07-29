import javax.swing.*;
import java.awt.*;

public class Design extends JPanel {
    int nrzile=0;
    String Month="";
    int startingDay=0;
    public Design(int nrzile,String Month,int startingDay) {
        this.nrzile = nrzile;
        this.Month = Month;
        this.startingDay=startingDay;
    }



    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(100, 50, 840, 100);
        int y=150;
        int row=1;
        for (int i = 1; i < nrzile; i++) {
            int x = (i-row) * 120;
            g.drawRect(100 + x, y, 120, 75);
            if (i % 7 == 0) {
                y += 75;
                row+=7;
            }

        }
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setFont(new Font("Segoe Script", Font.BOLD + Font.ITALIC, 40));
                g2.setPaint(Color.ORANGE);
                g2.drawString(Month + " " + 2022, 380, 120);
                String[] daysoftheWeek={"Monday","Tuesday" , "Wednesday" , "Thursday", "Friday", "Saturday" , "Sunday"};
                for(int i=0;i<=6;i++){
                    g2.setFont(new Font("Times New Roman",Font.BOLD + Font.ITALIC,20));
                    g2.drawString(daysoftheWeek[i],120+i*120,200);
                }
               int y1=275;
               int row1=1;
               g2.setFont(new Font("Times New Roman",Font.BOLD + Font.ITALIC,40));
               for(int i=startingDay;i<nrzile-7;i++){
                   int z = i-startingDay+1;
                   int x1 = (i-row1) * 120;
                   g2.drawString(String.valueOf(z),135+x1,y1);
                   if (i % 7 == 0) {
                       y1 += 75;
                       row1+= 7;
                   }
               }
    }
}