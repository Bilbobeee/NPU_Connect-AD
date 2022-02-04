import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Map;

// 7 Class CANPU

public class CANPU extends FormFrame implements ActionListener {
    private Library library;
    private JComboBox menuCAPN;
    private JLabel infoChooseLabel;
    private JLabel infoInputLabel;
    private JButton buttonNext;
    private JButton buttonBack;
    private JTextField inventoryNumber;
    private JLabel err1;
    private JLabel errAbout;


    private String depText;


    private String control = "CA";
    private int depIndex;
    private int invNumb;
    private String invNumbSixthNumber;

    private String nameForPC;


    public CANPU() {

        nameCANP();
        reSizeForm(new ImageIcon(this.getClass().getClassLoader().getResource("resources/img/background/backG(600,300).jpg")),600,300);

    }

    private void nameCANP(){

        library = new Library();

        err1 = new JLabel();
        err1.setVisible(false);

        errAbout = new JLabel();
        errAbout.setVisible(false);

        infoChooseLabel = new JLabel("Виберіть ваш Департамент/Відділ/Управління/ДУ");
        infoChooseLabel.setLocation(145,5);
        infoChooseLabel.setSize(350,30);
        infoChooseLabel.setFont(new Font("Times new Roman", Font.BOLD,14));
        infoChooseLabel.setForeground(Color.white);

        infoInputLabel = new JLabel("Введіть Інвентаризаційний номер ПК");
        infoInputLabel.setLocation(180, 5);
        infoInputLabel.setSize(300,30);
        infoInputLabel.setFont(new Font("Times new Roman", Font.BOLD,14));
        infoInputLabel.setForeground(Color.white);
        infoInputLabel.setVisible(true);

        inventoryNumber = new JTextField();
        inventoryNumber.setLocation(145,90);
        inventoryNumber.setSize(320,30);
        inventoryNumber.setVisible(true);
        inventoryNumber.setFont(new Font("Times new Roman", Font.BOLD,25));
        inventoryNumber.setEnabled(false);

        buttonBack = new JButton("Назад");
        buttonBack.setSize(80,30);
        buttonBack.setLocation(10,210);

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ChoiceTheControl();
            }
        });

        buttonNext = new JButton("Далі");
        buttonNext.setSize(350,30);
        buttonNext.setLocation(130,210);
        buttonNext.setVisible(true);

        menuCAPN = new JComboBox(library.getINDEX_SPA().values().toArray(new String[0]));
        menuCAPN.setLocation(40,35);
        menuCAPN.setSize(520,30);
        menuCAPN.setFont(new Font("Times new Roman",Font.CENTER_BASELINE,12));


        menuCAPN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depText = menuCAPN.getSelectedItem().toString();
                inventoryNumber.setEnabled(true);

                Robot r = null;
                try {
                    r = new Robot();
                } catch (AWTException ex) {
                    ex.printStackTrace();
                }
                r.keyPress(KeyEvent.VK_UP);


                buttonNext.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e1) {


                        if (!inventoryNumber.getText().isEmpty()){

                            boolean lengthNumber = true;

                            try {
                                invNumb = Integer.parseInt(inventoryNumber.getText().replaceAll(" ",""));

                                if (String.valueOf(invNumb).length() <6){
                                    lengthNumber = false;
                                    throw new NumberFormatException();
                                }

                                invNumbSixthNumber = String.valueOf(invNumb).substring( String.valueOf(invNumb).length()-6);

                                err1.setVisible(false);
                                inventoryNumber.setBackground(Color.WHITE);
                                errAbout.setVisible(false);
                                buttonNext.setLocation(105,125);


                                for (Map.Entry<Integer,String> cell : library.getINDEX_SPA().entrySet()){
                                    if (depText.equals(cell.getValue())){
                                        depIndex = cell.getKey();
                                        break;
                                    }

                                }

                                nameForPC = control + "-" + depIndex + "-" + invNumbSixthNumber;
//                                new StartComandRenamePC(nameForPC);
                                setVisible(false);

                            }catch (NumberFormatException e2){

                                if (lengthNumber == false){
                                    errAbout.setText("Повинно бути не менше як 6 символів");
                                    errAbout.setLocation(140,125);

                                } else {
                                    errAbout.setText("В інвентаризаційному номері повинні бути тільки цифри");
                                    errAbout.setLocation(80,125);
                                }

                                inventoryNumber.setBackground(Color.pink);

                                errAbout.setVisible(true);
                                errAbout.setSize(500,20);
                                errAbout.setForeground(Color.red);
                                errAbout.setFont(new Font("Times new Roman",Font.CENTER_BASELINE,16));


                                setSize(550,230);
                                setLocationRelativeTo(null);
                                buttonNext.setLocation(105,150);

                                err1.setVisible(true);
                                err1.setLocation(118,88);
                                err1.setSize(324,34);
                                err1.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
                            }
                        }



                    }
                });

            }
        });



        add(new JLabel());
        add(menuCAPN);
        add(new JLabel());
        add(infoChooseLabel);
        add(new JLabel());
        add(buttonNext);
        add(new JLabel());
        add(buttonBack);
        add(new JLabel());
        add(infoInputLabel);
        add(new JLabel());
        add(inventoryNumber);
        add(new JLabel());
        add(err1);
        add(new JLabel());
        add(errAbout);
        add(new JLabel());



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
