import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Bus Booking App");
        JLabel namelb,emaillb,mobilelb,genderlb, sourcelb,destinationlb,paymentlb, addresslb, bookingId;
        JTextField nametf, emailtf, mobiletf, gendertf, sourcetf, destinationtf, paymenttf, addresstf;
        JButton bookbtn, clearbtn, exitbtn;

        namelb = new JLabel("Name :");
        emaillb = new JLabel("Email :");
        mobilelb = new JLabel("Mobile :");
        genderlb = new JLabel("Gender :");
        sourcelb = new JLabel("Source :");
        destinationlb = new JLabel("destination :");
        paymentlb = new JLabel("Payment :");
        addresslb = new JLabel("Address :");
        bookingId = new JLabel();

        nametf = new JTextField();
        emailtf = new JTextField();
        mobiletf = new JTextField();
        gendertf = new JTextField();
        sourcetf = new JTextField();
        destinationtf = new JTextField();
        paymenttf = new JTextField();
        addresstf = new JTextField();

        clearbtn = new JButton("Clear");
        bookbtn = new JButton("Book Now");
        exitbtn = new JButton("Exit");

        //set the bounds
        namelb.setBounds(20, 30, 100, 40);
        emaillb.setBounds(20, 70, 100, 40);
        mobilelb.setBounds(20, 110, 100, 40);
        addresslb.setBounds(20, 150, 100, 40);
        genderlb.setBounds(280, 30, 100, 40);
        sourcelb.setBounds(280, 70, 100, 40);
        destinationlb.setBounds(280, 110, 100, 40);
        paymentlb.setBounds(280, 150, 100, 40);
        bookingId.setBounds(50, 300, 450, 40);

        nametf.setBounds(120, 30, 150, 40);
        emailtf.setBounds(120, 70, 150, 40);
        mobiletf.setBounds(120, 110, 150, 40);
        addresstf.setBounds(120, 150, 150, 40);
        gendertf.setBounds(400, 30, 150, 40);
        sourcetf.setBounds(400, 70, 150, 40);
        destinationtf.setBounds(400, 110, 150, 40);
        paymenttf.setBounds(400, 150, 150, 40);

        clearbtn.setBounds(50,200, 150, 45 );
        bookbtn.setBounds(220, 200, 150, 45);
        exitbtn.setBounds(400, 200, 150, 45);
        frame.add(bookingId);
        frame.add(bookbtn);
        frame.add(clearbtn);
        frame.add(exitbtn);
        frame.add(namelb);
        frame.add(emaillb);
        frame.add(mobilelb);
        frame.add(addresslb);
        frame.add(genderlb);
        frame.add(sourcelb);
        frame.add(destinationlb);
        frame.add(paymentlb);
        frame.add(nametf);
        frame.add(emailtf);
        frame.add(mobiletf);
        frame.add(addresstf);
        frame.add(gendertf);
        frame.add(paymenttf);
        frame.add(sourcetf);
        frame.add(destinationtf);



        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(600, 500);
        frame.setVisible(true);

        exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to clear the form
                nametf.setText("");
                emailtf.setText("");
                addresstf.setText("");
                mobiletf.setText("");
                sourcetf.setText("");
                destinationtf.setText("");
                paymenttf.setText("");
                gendertf.setText("");
            }
        });

        bookbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add the validation of form can't be empty
                if (nametf.getText().toString().isEmpty() ||
                        emailtf.getText().toString().isEmpty() ||
                        mobiletf.getText().toString().isEmpty() ||
                        gendertf.getText().toString().isEmpty() ||
                        destinationtf.getText().toString().isEmpty() ||
                        sourcetf.getText().toString().isEmpty() ||
                        paymenttf.getText().toString().isEmpty())
                {
                    bookingId.setText("Please fill the details");
                }
                else {


                    Random random = new Random();
                    int id = random.nextInt(999999);
                    bookingId.setText("Your booking is confirmed and bookind id " + id);
                }



            }
        });

    }
}