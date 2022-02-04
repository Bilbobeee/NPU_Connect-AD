import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

// 5 Class View Name

public class ViewNamePCForUser extends FormFrame implements ActionListener {

    private String namePC;
    private JLabel labelNamePC ;
    private JLabel labelText ;
    private JButton buttonNext;
    private JButton buttonCopy;
    private JButton buttonBack;
    private JButton buttonEXIT;
    private JTextPane about;
    private JTextPane infoAboutWork;

    public ViewNamePCForUser(String namePC, boolean inCorrectly){

        if (!inCorrectly){
            nameError(namePC);
        }

        this.namePC = namePC;

//        setLayout(null);
        labelNamePC.setSize(300,30);
        labelNamePC.setLocation(100,60);
        labelNamePC.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        labelNamePC.setHorizontalAlignment(JTextField.CENTER);

//        add(new JLabel());
        add(labelNamePC);
        add(new JLabel());
        add(labelText);
        add(new JLabel());
        add(buttonBack);
        add(new JLabel());
        add(buttonEXIT);
        add(new JLabel());
        add(about);

        reSizeForm(new ImageIcon(getClass().getClassLoader().getResource("resources/img/background/backG(500,282).jpg")),500,282);


    }

    public ViewNamePCForUser(String namePC, boolean GUNPU, boolean INDEX_SP) {

        buttonNext = new JButton("Продовжити");

        if (GUNPU & INDEX_SP){
            viewName(namePC);
        } else {
            nameError(namePC);
        }

        this.namePC = namePC;

//        setLayout(null);
        labelNamePC.setSize(400,30);
        labelNamePC.setBounds(150,30,200,40);
        labelNamePC.setLocation(120,30);
        labelNamePC.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        labelNamePC.setHorizontalAlignment(JTextField.CENTER);

        add(new JLabel());
        add(labelNamePC);
        add(new JLabel());
        add(labelText);
        add(new JLabel());
        add(buttonNext);
        add(new JLabel());
        add(buttonBack);
        add(new JLabel());
        add(about);
//        add(new JLabel());


        reSizeForm(new ImageIcon(this.getClass().getClassLoader().getResource("resources/img/background/backG(1540,800).jpg")),450,400);
    }

    public ViewNamePCForUser(String namePC, boolean GUNPU, boolean INDEX_SP, boolean MTO){

        if (GUNPU & INDEX_SP & MTO){
            viewName(namePC);
        } else {
            nameError(namePC);
        }

        this.namePC = namePC;

//        setLayout(null);
        labelNamePC.setSize(400,30);
        labelNamePC.setBounds(140,30,200,40);
        labelNamePC.setLocation(120,30);
        labelNamePC.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        labelNamePC.setHorizontalAlignment(JTextField.CENTER);

        add(new JLabel());
        add(labelNamePC);
        add(new JLabel());
        add(labelText);
        add(new JLabel());
        add(buttonNext);
        add(new JLabel());
        add(buttonBack);
        add(new JLabel());
        add(about);
        add(new JLabel());


        reSizeForm(new ImageIcon(this.getClass().getClassLoader().getResource("resources/img/background/backG(1540,800).jpg")),450,400);


    }

    private void viewName(String namePC){

        labelText = new JLabel();
        labelText.setLocation(160,-5);
        labelText.setSize(200,50);
        labelText.setText("Ім'я вашого ПК");
        labelText.setForeground(Color.white);
        labelText.setFont(new Font("Calibri", Font.BOLD,18));

        about = new JTextPane();
        about.setText("Ім'я є логічно вірним \nПеревірте чи вибраний саме ваший варіант та натисніть \"Продовжити\" \nЯкщо виникла помилка натисніть \"Корегувати\"");
        about.setFont(new Font("Times New Roman",Font.BOLD,11));
        about.setVisible(true);
        about.setLocation(10,110);
        about.setSize(415,50);
        about.setEditable(false);

        infoAboutWork = new JTextPane();
        infoAboutWork.setFont(new Font("Times new Roman", Font.TYPE1_FONT,14));
        infoAboutWork.setVisible(true);
        infoAboutWork.setSize(415,130);
        infoAboutWork.setLocation(10,170);
        infoAboutWork.setEditable(false);

        labelNamePC = new JLabel();
        labelNamePC.setText(" "+namePC);
        labelNamePC.setForeground(Color.white);
        labelNamePC.setFont(new Font("Serif", Font.TYPE1_FONT, 18));
        labelNamePC.setLocation(120,30);


        buttonNext = new JButton("Продовжити");
        buttonNext.setLocation(275,320);
        buttonNext.setSize(150,30);
        buttonNext.setVisible(true);

        buttonCopy = new JButton("Копіювати Ім'я");
        buttonCopy.setSize(200,30);
        buttonCopy.setLocation(120,75);

        buttonCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ctc = namePC;
                StringSelection stringSelection = new StringSelection(ctc);
                Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                clpbrd.setContents(stringSelection, null);
            }
        });



        String[] nameSplit = namePC.split("-");
        String infoWork = "              Ваші дані та місцезнаходження робочої станції:           \n\n";

        Library library = new Library();


        if (nameSplit.length == 3){

            if (nameSplit[0].equals("CA")){
                infoWork += "Центральний апарат національної поліції\n";
            }

            for (Map.Entry<String,String> GU : library.getABBREVIATION_GUNPU().entrySet()){
                if (nameSplit[0].equals(GU.getKey())){
                    infoWork += GU.getValue()+"\n";
                }
            }

            for (Map.Entry<Integer,String> DEP : library.getINDEX_SPA().entrySet()){
                if (Integer.parseInt(nameSplit[1]) == DEP.getKey()){
                    infoWork += DEP.getValue()+"\n";
                }
            }

            infoWork += "Інвентарний номер ПК: "+nameSplit[2];



        } else if (nameSplit.length == 4){

            for (Map.Entry<String,String> GU : library.getABBREVIATION_GUNPU().entrySet()){
                if (nameSplit[0].equals(GU.getKey())){
                    infoWork += GU.getValue()+"\n";
                }
            }

            for (Map.Entry<Integer,String> DEP : library.getINDEX_SPA().entrySet()){
                if (Integer.parseInt(nameSplit[1]) == DEP.getKey()){
                    infoWork += DEP.getValue()+"\n";
                }
            }

            for (Map.Entry<String,String> MTOU : library.getABBREVIATION_MTOU().entrySet()){
                if (nameSplit[2].equals(MTOU.getKey())){
                    infoWork += MTOU.getValue()+"\n";
                }
            }


            infoWork += "Інвентарний номер ПК (останні 6 цифр): "+nameSplit[3];
        }


        infoAboutWork.setText(infoWork);

        add(new JLabel());
        add(infoAboutWork);
        add(new JLabel());
        add(buttonCopy);
//        add(new JLabel());


        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
//                new DomainConnection();
            }
        });

        buttonBack = new JButton("Корегувати");
        buttonBack.setLocation(10,320);
        buttonBack.setSize(150,30);
        buttonBack.setVisible(true);

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                new ChoiceTheControl();
            }
        });

    }

    private void nameError(String namePC){
        labelText = new JLabel();
        labelText.setLocation(195,10);
        labelText.setSize(200,50);
        labelText.setText("Ім'я вашого ПК");
        labelText.setForeground(Color.white);
        labelText.setFont(new Font("Calibri", Font.BOLD,18));

        about = new JTextPane();
        about.setText("    Ім'я цього ПК є НЕВІРНИМ натисніть \"Корегувати\" та введіть ім'я \n    згідно  інструкції  або натисніть  \"Вийти\"  щоб  завершити  роботу");
        about.setFont(new Font("Time New Roman",Font.BOLD,12));
        about.setVisible(true);
        about.setLocation(35,140);
        about.setSize(415,40);
        about.setEditable(false);

        labelNamePC = new JLabel();
        labelNamePC.setText(" "+namePC);
        labelNamePC.setForeground(Color.white);
        labelNamePC.setFont(new Font("Serif", Font.TYPE1_FONT, 20));
        labelNamePC.setLocation(150,30);

        buttonEXIT = new JButton("Вийти");
        buttonEXIT.setLocation(325,200);
        buttonEXIT.setSize(150,30);
//        buttonEXIT.setVisible(true);

        buttonEXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });


        buttonBack = new JButton("Корегувати");
        buttonBack.setLocation(10,200);
        buttonBack.setSize(150,30);
//        buttonBack.setVisible(true);

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
//                new ChoiceTheControl();
            }
        });


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
