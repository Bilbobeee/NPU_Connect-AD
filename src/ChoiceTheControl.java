import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// 6 Class choice the Organization

public class ChoiceTheControl extends FormFrame {
    private JLabel about;
    private JCheckBox gun;
    private JCheckBox mto;
    private JCheckBox cap;
    private boolean capB;
    private boolean gunB;
    private boolean mtoB;
    private JButton buttonNext;
    private JLabel backGround;

    public ChoiceTheControl() {

        makeTheChoice();
        reSizeForm(new ImageIcon(this.getClass().getClassLoader().getResource("resources/img/background/backG(500,282).jpg")),500,220);

    }




    private void makeTheChoice(){

        about = new JLabel("Виберіть свій орган Національної Поліції");
        about.setLocation(140,0);
        about.setSize(310,30);
        about.setForeground(Color.white);
        about.setVisible(true);

        cap = new JCheckBox("Центральний апарат національної поліції (ЦАНП)");
        cap.setLocation(105,40);
        cap.setSize(320,20);

        gun = new JCheckBox("Головне управління національної поліції (ГУНП)");
        gun.setLocation(105,65);
        gun.setSize(320,20);

        mto = new JCheckBox("Міжрегіональний територіальний орган (MTO)     ");
        mto.setLocation(105,90);
        mto.setSize(320,20);


        gunB = false;
        mtoB = false;
        capB = false;

        cap.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cap.isSelected()){
                    capB = true;
                    gunB = false;
                    mtoB = false;

                    mto.setSelected(false);
                    gun.setSelected(false);


                } else if (!(cap.isSelected()) && capB) {
                    capB = false;

                }
            }
        });


        gun.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (gun.isSelected()){
                    capB = false;
                    gunB = true;
                    mtoB = false;

                    mto.setSelected(false);
                    cap.setSelected(false);


                } else if (!(gun.isSelected()) && gunB) {
                    gunB = false;

                }
            }
        });

        mto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (mto.isSelected()){
                    capB = false;
                    gunB = false;
                    mtoB = true;

                    gun.setSelected(false);
                    cap.setSelected(false);


                } else if (!(mto.isSelected()) && mtoB) {
                    mtoB = false;

                }
            }
        });

        buttonNext = new JButton("Далі");
        buttonNext.setSize(300,30);
        buttonNext.setLocation(115,130);

        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cap.isSelected() & !gun.isSelected() & !mto.isSelected()){
//                    System.out.println("CAPNP");

                    setVisible(false);
                    new CANPU();
                } else if(!cap.isSelected() & gun.isSelected() & !mto.isSelected()){
//                    System.out.println("GUNPU");

                    setVisible(false);
//                    new GUNPU();
                } else if (!cap.isSelected() & !gun.isSelected() & mto.isSelected()){
//                    System.out.println("MTOU");

                    setVisible(false);
//                    new MTOU();
                }
            }
        });


        add(new JLabel());
        add(about);
        add(new JLabel());
        add(cap);
        add(new JLabel());
        add(gun);
        add(new JLabel());
        add(mto);
        add(new JLabel());
        add(buttonNext);
        add(new JLabel());




    }


}
