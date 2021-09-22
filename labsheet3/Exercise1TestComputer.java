package labsheet3;

//Exercise1TestComputer.java
/*A driver class for the Exercise1Computer class that contains some modifications such as
the creation of a third Computer object and other bits and pieces*/

import javax.swing.*;

public class Exercise1TestComputer {
    public static void main(String[] args) {
        String output = "";

        Exercise1Computer c1 = new Exercise1Computer();

        output += "Calling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        Exercise1Computer c2 = new Exercise1Computer("Dell","Laptop",2.9,12,865.00);

        c2.setSpeed(-3.15);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" + c2.toString();

        Exercise1Computer c3 = new Exercise1Computer("Apple","Desktop",3.25,16,550.99);

        c3.setRAM(-8);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The third Computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
