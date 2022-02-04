import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

// #2


public class StartProgram extends FormFrame implements ActionListener {

    private JLabel label;
    private JLabel backGround;

    private final JLabel INFO_ABOUT_CREATOR = new JLabel("Департамент Інформаційної Аналітичної Підтримки : розробник - Кучерявий Руслан");
    private final JLabel INFO_ABOUT_CREATOR_TEL = new JLabel("телефони : Зовнішній - 254-90-87 : Внутрішній - 00-87");

    private JButton INFO;
    private JTextPane textPane;
    private JButton macAddress;

    private boolean onForINFO = true;


    public StartProgram() {
        runProgram();
        reSizeForm(new ImageIcon(getClass().getClassLoader().getResource("resources/img/background/backG(500,282).jpg")),500,250);

    }

    private void runProgram(){

        INFO_ABOUT_CREATOR.setLocation(10,215);
        INFO_ABOUT_CREATOR.setSize(500,45);
        INFO_ABOUT_CREATOR.setForeground(Color.WHITE);
        INFO_ABOUT_CREATOR.setFont(new Font("Times new Roman", Font.BOLD,10));
        INFO_ABOUT_CREATOR.setVisible(true);

        INFO_ABOUT_CREATOR_TEL.setVisible(false);
        INFO_ABOUT_CREATOR_TEL.setLocation(10,200);
        INFO_ABOUT_CREATOR_TEL.setSize(500,40);
        INFO_ABOUT_CREATOR_TEL.setForeground(Color.WHITE);
        INFO_ABOUT_CREATOR_TEL.setFont(new Font("Times new Roman", Font.BOLD,10));
        INFO_ABOUT_CREATOR_TEL.setVisible(true);

        INFO = new JButton("Дод. Інформація");
        INFO.setSize(115,20);
        INFO.setLocation(360,180);
        INFO.setFont(new Font("Times new Roman", Font.BOLD, 10));
        INFO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                INFO_ABOUT_CREATOR_TEL.setFont(new Font("Times new Roman", Font.BOLD,12));

                if (onForINFO){

                    for (int i=250; i < 290; i++ ){
                        try {
                            Thread.sleep(3);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        setSize(500,i);

                        onForINFO = false;
                    }
                } else {
                    INFO_ABOUT_CREATOR_TEL.setFont(new Font("Times new Roman", Font.BOLD,10));

                    for (int i=290; i > 250; i-- ){
                        try {
                            Thread.sleep(3);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        setSize(500,i);

                        onForINFO = true;

                    }
                }

            }
        });


        // created an object to get the Windows version and checked for equality
        WindowsVersion windowsV = new WindowsVersion();

        //  if this Operating System is Windows 10 we are created label with preferences
        //  set size for Frame , and created button with preferences, and all is it added to Frame
        //  an action listener is enabled for the button, when the button is clicked, a new object is created to validate the name

        if (windowsV.checkVersionWindows().equals("Windows 10")){
            label = new JLabel(windowsV.checkVersionWindows());
            label.setLocation(180,40);
            label.setSize(415,30);
            label.setFont(new Font("Serif", Font.TYPE1_FONT, 28));
            label.setForeground(Color.white);

            textPane = new JTextPane();
            textPane.setText("   Ваша версія ОС є задовільною, натисніть продовжити... ");
            textPane.setFont(new Font("Time New Roman",Font.BOLD,10));
            textPane.setVisible(true);
            textPane.setLocation(100,110);
            textPane.setSize(310,20);
            textPane.setEditable(false);

            JButton buttonNext = new JButton("Продовжити");
            buttonNext.setLocation(10, 140);
            buttonNext.setSize(465, 30);

            macAddress = new JButton("МАК Адреса");
            macAddress.setLocation(360,10);
            macAddress.setSize(115,20);

            macAddress.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);

                    new  MacAddress();
                }
            });


            buttonNext.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    setVisible(false);

                    try {
//                        new CheckName();
                        new AboutUser();
                    } catch (UnknownHostException ex) {
                        ex.printStackTrace();
                    } catch (IOException e1){
                        e1.printStackTrace();
                    }

                }
            });

            add(new JLabel());
            add(buttonNext);
            add(new JLabel());
            add(label);
            add(new JLabel());
            add(textPane);
            add(new JLabel());
            add(macAddress);
            add(new JLabel());



//  else if Windows 7 we are created label with preferences
//  set size for Frame , and created button with preferences, and all is it added to Frame
//  an action listener is enabled for the button, when the button is clicked system is closed

        } else if ((windowsV.checkVersionWindows()).equals("Windows 7")) {

            label = new JLabel(windowsV.checkVersionWindows());
            label.setLocation(180,60);
            label.setSize(415,30);
            label.setFont(new Font("Serif", Font.TYPE1_FONT, 28));
            label.setForeground(Color.white);

            textPane = new JTextPane();
            textPane.setText("          Ваша версія Windows застаріла, Обновіть до Windows 10");
            textPane.setFont(new Font("Time New Roman",Font.BOLD,10));
            textPane.setVisible(true);
            textPane.setLocation(70,150);
            textPane.setSize(360,20);
            textPane.setEditable(false);

            JButton button = new JButton("Закрити");
            button.setVisible(true);
            button.setLocation(10, 190);
            button.setSize(465, 30);

            add(new JLabel());
            add(button);
            add(new JLabel());
            add(label);
            add(new JLabel());
            add(textPane);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    System.exit(0);

                }
            });

        }

        add(new JLabel());
        add(INFO_ABOUT_CREATOR_TEL);
        add(new JLabel());
        add(INFO_ABOUT_CREATOR);
        add(new JLabel());
        add(INFO);
        add(new JLabel());



    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}