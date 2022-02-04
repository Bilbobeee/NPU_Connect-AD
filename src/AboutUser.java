import org.apache.poi.ss.usermodel.*;


import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;


public class AboutUser extends FormFrame implements ActionListener {
    private JLabel info;

    private JLabel infoSurname;
    private JTextField surnameField;

    private JLabel infoName;
    private JTextField nameField;

    private JLabel infoSecondName;
    private JTextField secondNameField;

    private JLabel infoPosition;
    private JTextField positionField;

    private JLabel infoRank;
    private JTextField rankField;

    private JLabel infoPhone;
    private JTextField phoneField;

    private JButton back;
    private JButton next;

    private JLabel error;

    private String surname;
    private String name;
    private String secondName;
    private String position;
    private String rank;
    private String phone;

    private boolean surnameBoolean;
    private boolean nameBoolean;
    private boolean secondNameBoolean;
    private boolean positionBoolean;
    private boolean rankBoolean;
    private boolean phoneBoolean;

    public AboutUser() throws IOException {

        runInfoUser();
        reSizeForm(new ImageIcon(getClass().getClassLoader().getResource("resources/img/background/backG(775,400).jpg")),775,400);

    }

    public void runInfoUser() throws IOException {

        error = new JLabel("← Заповніть поле");
        error.setSize(200,30);
        error.setFont(new Font("Times new roman", Font.BOLD,14));
        error.setForeground(Color.RED);
        error.setVisible(false);

        info = new JLabel("Інформація про Користувача");
        info.setSize(250,40);
        info.setLocation(300,5);
        info.setFont(new Font("Times new roman",Font.BOLD,18));
        info.setForeground(Color.WHITE);


        infoSurname = new JLabel("Прізвище");
        infoSurname.setLocation(200,50);
        infoSurname.setSize(100,30);
        infoSurname.setFont(new Font("Times new roman", Font.BOLD,18));
        infoSurname.setForeground(Color.WHITE);

// Field for surname
        surnameField = new JTextField();
        surnameField.setLocation(330,50);
        surnameField.setSize(300,30);
        surnameField.setVisible(true);
        surnameField.setFont(new Font("Times new roman", Font.BOLD,18));
        surnameField.setHorizontalAlignment(JTextField.CENTER);

        infoName = new JLabel("Ім'я");
        infoName.setLocation(200,90);
        infoName.setSize(100,30);
        infoName.setFont(new Font("Times new roman", Font.BOLD,18));
        infoName.setForeground(Color.WHITE);

// Field for name
        nameField = new JTextField();
        nameField.setLocation(330,90);
        nameField.setSize(300,30);
        nameField.setVisible(true);
        nameField.setFont(new Font("Times new roman", Font.BOLD,18));
        nameField.setHorizontalAlignment(JTextField.CENTER);

        infoSecondName = new JLabel("По батькові");
        infoSecondName.setLocation(200,130);
        infoSecondName.setSize(150,30);
        infoSecondName.setFont(new Font("Times new roman", Font.BOLD,18));
        infoSecondName.setForeground(Color.WHITE);

// Field for second name
        secondNameField = new JTextField();
        secondNameField.setLocation(330,130);
        secondNameField.setSize(300,30);
        secondNameField.setVisible(true);
        secondNameField.setFont(new Font("Times new roman", Font.BOLD,18));
        secondNameField.setHorizontalAlignment(JTextField.CENTER);


        infoPosition = new JLabel("Посада");
        infoPosition.setLocation(200,180);
        infoPosition.setSize(100,30);
        infoPosition.setFont(new Font("Times new roman", Font.BOLD,18));
        infoPosition.setForeground(Color.WHITE);

// Field for position
        positionField = new JTextField();
        positionField.setLocation(330,180);
        positionField.setSize(300,30);
        positionField.setVisible(true);
        positionField.setFont(new Font("Times new roman", Font.BOLD,18));
        positionField.setHorizontalAlignment(JTextField.CENTER);


        infoRank = new JLabel("Звання / Державний службовець / Вільний найм");
        infoRank.setSize(350,60);
        infoRank.setLocation(5,215);
        infoRank.setFont(new Font("Times new roman", Font.BOLD,14));
        infoRank.setForeground(Color.WHITE);

// Field for rank
        rankField = new JTextField();
        rankField.setLocation(330,230);
        rankField.setSize(300,30);
        rankField.setVisible(true);
        rankField.setFont(new Font("Times new roman", Font.BOLD,18));
        rankField.setHorizontalAlignment(JTextField.CENTER);

        infoPhone = new JLabel("Телефон");
        infoPhone.setLocation(200,280);
        infoPhone.setSize(100,30);
        infoPhone.setFont(new Font("Times new roman", Font.BOLD,18));
        infoPhone.setForeground(Color.WHITE);

// Field for phone
        phoneField = new JTextField();
        phoneField.setLocation(330,280);
        phoneField.setSize(300,30);
        phoneField.setVisible(true);
        phoneField.setFont(new Font("Times new roman", Font.BOLD,18));
        phoneField.setHorizontalAlignment(JTextField.CENTER);

        back = new JButton("Назад");
        back.setLocation(10,320);
        back.setSize(200,30);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new StartProgram();
            }
        });


        next = new JButton("Далі");
        next.setLocation(550,320);
        next.setSize(200,30);


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                error.setVisible(false);

                surname = surnameField.getText().replaceAll(" ","");
                name = nameField.getText().replaceAll(" ","");
                secondName = secondNameField.getText().replaceAll(" ","");
                position = positionField.getText();
                rank = rankField.getText();
                phone = phoneField.getText();


                surnameBoolean = surname.isBlank();
                nameBoolean = name.isBlank();
                secondNameBoolean = secondName.isBlank();
                positionBoolean = position.isBlank();
                rankBoolean = rank.isBlank();
                phoneBoolean = phone.isBlank();



                if (!(surnameBoolean)&&!(nameBoolean)&&!(secondNameBoolean)&&!(positionBoolean)&&!(rankBoolean)&&!(phoneBoolean)){

                     //In the Variable "directory" contains path to Program and variable "files" have in list all files in this directory
                    final String DIRECTORY = System.getProperty("user.dir");
                    File myFolder = new File(DIRECTORY);
                    File[] files = myFolder.listFiles();

                    //The Variable "infoAllUserFile" is an array, it created for save all file with path and the variable "infoUserFile"
                    // will store the filename "infoUser.xlsx" or null if the file is not found

                    String[] infoAllUserFile = null;
                    String infoUserFile = null;


                    // cycle for enumeration, name file with path and split on "\", then last index from array put to "infoUserFile"
                    // if the variable have is "infoUser.xlsx" cycle is break
                    // the cycle in every repeat "infoAllUserFile" "infoUserFile" is clearing memory for this variables
                    for (File cell : files){

                        infoAllUserFile = String.valueOf(cell).split("\\\\");
                        infoUserFile = infoAllUserFile[infoAllUserFile.length-1];

                        if (infoUserFile.equals("infoUser.xlsx")){

                            break;
                        }

                        infoAllUserFile = null;
                        infoUserFile = null;
                    }

                    //Condition if "infoUserFile" haven to "null", then ".xlsx" copies file in path with program
                    // this is means what file not found and need created new file (search infoUser.xlsx)

                    if (infoUserFile == null){

                        try {
                            Files.copy(new File(DIRECTORY+"\\src\\resources\\information\\infoUser.xlsx").toPath(), new File(DIRECTORY+"\\infoUser.xlsx").toPath());
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                        // file is created

                    }

                    FileInputStream fis = null;
                    Workbook workbook = null;
                    Sheet sheet = null;
                    Row row = null;
                    Cell cellSurname = null;
                    Cell cellName = null;
                    Cell cellSecondName = null;
                    Cell cellPosition = null;
                    Cell cellRank = null;
                    Cell cellPhone = null;

                    try {
                        fis = new FileInputStream(DIRECTORY+"\\infoUser.xlsx");
                        workbook = WorkbookFactory.create(fis);
                        sheet = workbook.getSheetAt(0);
                        row = sheet.getRow(5);
                        cellSurname = row.getCell(9);
                        cellName = row.getCell(10);
                        cellSecondName = row.getCell(11);
                        cellPosition = row.getCell(12);
                        cellRank = row.getCell(13);
                        cellPhone = row.getCell(14);

                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    cellSurname.setCellValue(surname);
                    cellName.setCellValue(name);
                    cellSecondName.setCellValue(secondName);
                    cellPosition.setCellValue(position);
                    cellRank.setCellValue(rank);
                    cellPhone.setCellValue(phone);


                    FileOutputStream fos = null;
                    try {
                        fos = new FileOutputStream(DIRECTORY+"\\infoUser.xlsx");
                        workbook.write(fos);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    try {
                        fis.close();
                        fos.flush();
                        fos.close();
                    } catch (IOException NOP){

                    }

                    System.out.println("OK");

                } else if (surnameBoolean) {
//                    System.out.println("BAD surname");
                    error.setLocation(635,50);
                    error.setVisible(true);

                } else if (nameBoolean) {
//                    System.out.println("BAD name");
                    error.setLocation(635,90);
                    error.setVisible(true);

                } else if (secondNameBoolean) {
//                    System.out.println("BAD secondName");
                    error.setLocation(635,128);
                    error.setVisible(true);

                } else if (positionBoolean) {
//                    System.out.println("BAD position");
                    error.setLocation(635,180);
                    error.setVisible(true);

                } else if (rankBoolean) {
//                    System.out.println("BAD rank");
                    error.setLocation(635,230);
                    error.setVisible(true);

                } else if (phoneBoolean) {
//                    System.out.println("BAD phone");
                    error.setLocation(635,280);
                    error.setVisible(true);
                } else {
//                    System.out.println("ALL BAD");
                    error.setLocation(635,300);
                    error.setVisible(true);
                }


        // this String directory put to myFolder path
//        final String directory = System.getProperty("user.dir");
//
//        File myFolder = new File("D:\\");
//        File[] files = myFolder.listFiles();
//        String infoUser = null;


        // search previous file about user
//        for(File cell : files){
//            String nameFile = String.valueOf(cell);
//
//            String[] name = nameFile.split("\\\\");
//
//            if (name[name.length-1].equals("infoUser.xlsx")){
//                infoUser = name[name.length-1];
//            }
//            nameFile = null;
//        }
//
//
//        // if the user file is created then it will be edited
//        if (infoUser != null){
//            System.out.println(infoUser);
//        } else {
//
//        }



//





            }
        });

        add(error);

        add(info);
        add(infoSurname);
        add(infoName);
        add(infoSecondName);
        add(infoPosition);
        add(infoRank);
        add(infoPhone);

        add(surnameField);
        add(nameField);
        add(secondNameField);
        add(positionField);
        add(rankField);
        add(phoneField);

        add(back);
        add(next);


//
//
//        // this String directory put to myFolder path
//        final String directory = System.getProperty("user.dir");
//
//        File myFolder = new File("D:\\");
//        File[] files = myFolder.listFiles();
//        String infoUser = null;
//
//
//        // search previous file about user
//        for(File cell : files){
//            String nameFile = String.valueOf(cell);
//
//            String[] name = nameFile.split("\\\\");
//
//            if (name[name.length-1].equals("infoUser.xlsx")){
//                infoUser = name[name.length-1];
//            }
//            nameFile = null;
//        }
//
//
//        // if the user file is created then it will be edited
//        if (infoUser != null){
//
//        } else {
//
//        }
//
//
//
//
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
