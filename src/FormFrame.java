import javax.swing.*;
import java.awt.*;

// FOR ALL FORM

public class FormFrame extends JFrame {
    private ImageIcon iconImageBackGround;
    private ImageIcon icon;

    private JLabel labelBackground;

    private Integer sizeWidth;
    private Integer sizeHeight;


    public FormFrame() throws HeadlessException {
        super("Підключення до НПУ");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        icon = new ImageIcon(getClass().getClassLoader().getResource("resources/img/ico/ICO.png"));
        setIconImage(icon.getImage());

    }

    public void reSizeForm(ImageIcon iconImageBackGround,Integer sizeWidth,Integer sizeHeight){

        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;

        setSize(sizeWidth,sizeHeight);


        this.iconImageBackGround = iconImageBackGround;
        labelBackground = new JLabel(iconImageBackGround);
        labelBackground.setSize(sizeWidth,sizeHeight);
        labelBackground.setVisible(true);


        add(new JLabel());
        add(labelBackground);
        add(new JLabel());

        setLocationRelativeTo(null);
        setVisible(true);


    }


}
