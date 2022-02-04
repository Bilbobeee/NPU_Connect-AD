import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;

// #4

public class MacAddress extends FormFrame implements ActionListener {
    private JTextField field;
    private JLabel labelMac;
    private JLabel labelMacThisPC;

    private JButton back;
    private JButton copyMac;
    private String nameInterface = "";
    private String macAddress = "";
    private JProgressBar progressBar;
    private JButton additionally;
    private JTextPane textPanel;


    private int formHeight;
    private int formLength;

    private boolean formResize = false;

    MyThreadProgressBar myProgress ;
    MyThreadProcess myProcess;

    private ArrayList<String> listForAllNetAdapters = new ArrayList<>();

    {
        listForAllNetAdapters.add("ADMtek");
        listForAllNetAdapters.add("Agere");
        listForAllNetAdapters.add("Allied");
        listForAllNetAdapters.add("Apple");
        listForAllNetAdapters.add("Aquantia");
        listForAllNetAdapters.add("ASIX");
        listForAllNetAdapters.add("ASUS");
        listForAllNetAdapters.add("Atheros");
        listForAllNetAdapters.add("Broadcom");
        listForAllNetAdapters.add("Compex");
        listForAllNetAdapters.add("Corechip");
        listForAllNetAdapters.add("D-link");
        listForAllNetAdapters.add("Davicom");
        listForAllNetAdapters.add("Intel");
        listForAllNetAdapters.add("Intel(R)");
        listForAllNetAdapters.add("Jmicron");
        listForAllNetAdapters.add("Lan_3COM");
        listForAllNetAdapters.add("Linksys");
        listForAllNetAdapters.add("Marvell");
        listForAllNetAdapters.add("Mellanox");
        listForAllNetAdapters.add("MYSON");
        listForAllNetAdapters.add("National");
        listForAllNetAdapters.add("Nvidia");
        listForAllNetAdapters.add("Realtek");
        listForAllNetAdapters.add("SIS");
        listForAllNetAdapters.add("SMC");
        listForAllNetAdapters.add("Sundance");
        listForAllNetAdapters.add("Tehuti");
        listForAllNetAdapters.add("TP-Link");
        listForAllNetAdapters.add("VIA");
        listForAllNetAdapters.add("Winbond");
    }


    private class MyThreadProgressBar extends Thread{
        public void run(){
            progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressBar.setSize(300,20);
            progressBar.setLocation(50,130);

            add(new JLabel());
            add(progressBar);
            add(new JLabel());

        }
    }
    private class MyThreadProcess extends Thread{
        public void run(){
            getMac();
        }
    }


    public MacAddress() {

        additionally = new JButton("Більше");
        additionally.setFont(new Font("Times New Roman", Font.BOLD,10));
        additionally.setSize(70,30);
        additionally.setLocation(400,120);
        additionally.setVisible(false);

        field = new JTextField();
        field.setSize(230,30);
        field.setLocation(240,40);
        field.setFont(new Font("Serif", Font.TYPE1_FONT, 18));
        field.setDisabledTextColor(Color.BLACK);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setEnabled(false);
        field.setVisible(false);


        textPanel = new JTextPane();
        textPanel.setSize(485,180);
        textPanel.setLocation(0,180);
        textPanel.setVisible(false);


        labelMac = new JLabel("МАК Адреса");
        labelMac.setSize(300,30);
        labelMac.setLocation(190,5);
        labelMac.setForeground(Color.white);
        labelMac.setFont(new Font("Serif", Font.TYPE1_FONT, 18));
        labelMac.setVisible(false);

        labelMacThisPC = new JLabel();
        labelMacThisPC.setSize(300,30);
        labelMacThisPC.setLocation(130,40);
        labelMacThisPC.setForeground(Color.white);
        labelMacThisPC.setFont(new Font("Serif", Font.TYPE1_FONT, 18));
        labelMacThisPC.setVisible(false);

        back = new JButton("Назад");
        back.setSize(300,30);
        back.setLocation(90,120);
        back.setVisible(false);

        copyMac = new JButton("Копіювати МАК...");
        copyMac.setSize(230,20);
        copyMac.setLocation(240,75);
        copyMac.setVisible(false);

        add(new JLabel());
        add(field);
        add(new JLabel());
        add(textPanel);
        add(new JLabel());
        add(labelMac);
        add(new JLabel());
        add(labelMacThisPC);
        add(new JLabel());
        add(back);
        add(new JLabel());
        add(additionally);
        add(new JLabel());
        add(copyMac);
        add(new JLabel());


        myProgress = new MyThreadProgressBar();
        myProgress.start();
        myProcess = new MyThreadProcess();
        myProcess.start();

        reSizeForm(new ImageIcon(getClass().getClassLoader().getResource("resources/img/background/backG(500,282).jpg")),500,200);
        formLength = 500;
        formHeight = 200;

    }

    private void getMac()  {

        String[] ipConfig = {"powershell.exe","Get-NetAdapter;exit"};
        ProcessBuilder processBuilder = new ProcessBuilder(ipConfig);
        Process process = null;

        try {
            process = processBuilder.start();
        } catch (IOException e){
            e.printStackTrace();
        }

        BufferedReader buff = null;

        try {
            buff = new BufferedReader(new InputStreamReader(process.getInputStream(),"cp866"));
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();

        }

        String line = "";
        ArrayList<String> listGetNetAdapter = new ArrayList<>();

        try {
            while ((line=buff.readLine()) != null){
                listGetNetAdapter.add(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }



        boolean firstNameAdapter = false;
        boolean secondAdapterUPDisconnect = false;
        boolean thirdAdapter = false;


        String lineAllInfo = "";
        String deleteSpace;


        for (int i=3; i<listGetNetAdapter.size(); i++){

            deleteSpace =  listGetNetAdapter.get(i).replaceAll("\\s\\s\\s\\s\\s\\s\\s\\s"," ")+"\n\n";
            lineAllInfo += deleteSpace.replaceAll("\\s\\s\\s"," ");

//            System.out.print(deleteSpace);

        }

        textPanel.setFont(new Font("Times new Roman", Font.TYPE1_FONT, 10));
        textPanel.setText(lineAllInfo);
        textPanel.setVisible(true);
        textPanel.setEditable(false);

        lineAllInfo = null;


        for (int i=3; i<listGetNetAdapter.size(); i++){

            String[] blockForLine = listGetNetAdapter.get(i).split(" ");

            for(int b=0; b<blockForLine.length; b++){

                for (String cell : listForAllNetAdapters){

                    if (blockForLine[b].toLowerCase(Locale.ROOT).equals(cell.toLowerCase(Locale.ROOT)) && !firstNameAdapter){
                        labelMacThisPC.setText(blockForLine[b]);

//                        System.out.print(blockForLine[b]);
//                        System.out.println(b);

                        firstNameAdapter = true;
                        break;

                    }

                }

                if (blockForLine[b].toLowerCase(Locale.ROOT).equals("up") && firstNameAdapter && !secondAdapterUPDisconnect){

                    secondAdapterUPDisconnect = true;

//                        System.out.print(blockForLine[b]);
//                        System.out.println(b);


                } else if (blockForLine[b].length() == 17 && firstNameAdapter && secondAdapterUPDisconnect){

//                        System.out.print(blockForLine[b]);
//                        System.out.println(b);

                    macAddress = blockForLine[b];
                    field.setText(macAddress);
                    firstNameAdapter = false;
                    secondAdapterUPDisconnect = false;
                    thirdAdapter = true;

                    break;
                }


            }

        }

        if (!thirdAdapter && firstNameAdapter && secondAdapterUPDisconnect){

            labelMacThisPC.setText("Помилка");
            macAddress = "";
            field.setText("Натисніть Більше");
            thirdAdapter = false;
        }



        additionally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (formResize == false){

                    for (int i = 200; i<400; i++){

                        setSize(formLength,i);
                        setLocationRelativeTo(null);


                    }

                    additionally.setText("Меньше");
                    setLocationRelativeTo(null);

                    formResize = true;
                } else if (formResize){

                    for (int i = 400; i>200; i--){

                        setSize(formLength,i);
                        setLocationRelativeTo(null);

                    }
                    additionally.setText("Більше");
                    formResize = false;
                }

                setLocationRelativeTo(null);

            }
        });


        copyMac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ctc = macAddress;
                StringSelection stringSelection = new StringSelection(ctc);
                Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                clpbrd.setContents(stringSelection, null);

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                new StartProgram();
            }
        });

        while (true){

            if (macAddress.length()>2){
                progressBar.setVisible(false);
                myProgress.interrupt();

                field.setVisible(true);
                labelMac.setVisible(true);
                labelMacThisPC.setVisible(true);
                back.setVisible(true);
                copyMac.setVisible(true);
                myProcess.interrupt();
                additionally.setVisible(true);

                break;
            } else if (macAddress.length()<2){
                progressBar.setVisible(false);
                myProgress.interrupt();

                field.setVisible(true);
                labelMac.setVisible(true);
                labelMacThisPC.setVisible(true);
                back.setVisible(true);
                myProcess.interrupt();
                additionally.setVisible(true);

                break;
            }

        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }




}

