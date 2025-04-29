import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("STOU");

        Container c = frame.getContentPane();

        JLabel text1 = new JLabel("Application Form");
        c.add(text1, BorderLayout.NORTH);

        JPanel panel = new JPanel(new FlowLayout());

        JLabel text2 = new JLabel("Apllication No. (AP_ID): ");
        JTextField text3 = new JTextField(20);
        JPanel g1 = new JPanel(new FlowLayout());
        g1.add(text2);
        g1.add(text3);

        JLabel text4 = new JLabel("Name - Surname (AP_NAME): ");
        JTextField text5 = new JTextField(20);
        JPanel g2 = new JPanel(new FlowLayout());
        g2.add(text4);
        g2.add(text5);

        JLabel text6 = new JLabel("Address (AP_ADDRESS): ");
        JTextField text7 = new JTextField(20);
        JPanel g3 = new JPanel(new FlowLayout());
        g3.add(text6);
        g3.add(text7);

        JLabel text8 = new JLabel("Province (AP_CHW): ");
        JTextField text9 = new JTextField(20);
        JPanel g4 = new JPanel(new FlowLayout());
        g4.add(text8);
        g4.add(text9);

        JLabel text10 = new JLabel("Gender (AP_SEX): ");
        JRadioButton radio1 = new JRadioButton("Male");
        JRadioButton radio2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);
        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(text10);
        radioPanel.add(radio1);
        radioPanel.add(radio2);

        JLabel text11 = new JLabel("Education (AP_ED): ");
        JTextField text12 = new JTextField(20);
        JPanel g5 = new JPanel(new FlowLayout());
        g5.add(text11);
        g5.add(text12);

        JLabel text13 = new JLabel("Major (AP_MAJ): ");
        JTextField text14 = new JTextField(20);
        JPanel g6 = new JPanel(new FlowLayout());
        g6.add(text13);
        g6.add(text14);

        String Skills[] = { "Java", "Python", "C++", "C#", "PHP" };
        JLabel text15 = new JLabel("Skill (QUAL_DESC) 5 Max");
        JComboBox<String> skillList1 = new JComboBox<>(Skills);
        JComboBox<String> skillList2 = new JComboBox<>(Skills);
        JComboBox<String> skillList3 = new JComboBox<>(Skills);
        JComboBox<String> skillList4 = new JComboBox<>(Skills);
        JComboBox<String> skillList5 = new JComboBox<>(Skills);
        JPanel g7 = new JPanel(new FlowLayout());
        g7.add(skillList1);
        g7.add(skillList2);
        g7.add(skillList3);
        g7.add(skillList4);
        g7.add(skillList5);

        String Positions[] = { "Programmer", "Tester", "Analyst", "Designer", "Manager" };
        JLabel text16 = new JLabel("Position (POS_Name) 3 Max ");
        JComboBox<String> positionList1 = new JComboBox<>(Positions);
        JComboBox<String> positionList2 = new JComboBox<>(Positions);
        JComboBox<String> positionList3 = new JComboBox<>(Positions);
        JPanel g8 = new JPanel(new FlowLayout());
        g8.add(positionList1);
        g8.add(positionList2);
        g8.add(positionList3);

        JButton submit = new JButton("Submit");

        panel.add(g1);
        panel.add(g2);
        panel.add(g3);
        panel.add(g4);
        panel.add(radioPanel);
        panel.add(g5);
        panel.add(g6);
        panel.add(text15);
        panel.add(g7);
        panel.add(text16);
        panel.add(g8);
        panel.add(submit);

        c.add(panel);

        Container c2 = frame.getContentPane();

        JTextArea tf = new JTextArea();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = text3.getText();
                String name = text5.getText();
                String address = text7.getText();
                String chw = text9.getText();
                String sex = "";
                if (radio1.isSelected()) {
                    sex = "Male";
                } else {
                    sex = "Female";
                }
                String ed = text12.getText();
                String maj = text14.getText();
                String skill1 = (String) skillList1.getSelectedItem();
                String skill2 = (String) skillList2.getSelectedItem();
                String skill3 = (String) skillList3.getSelectedItem();
                String skill4 = (String) skillList4.getSelectedItem();
                String skill5 = (String) skillList5.getSelectedItem();
                String pos1 = (String) positionList1.getSelectedItem();
                String pos2 = (String) positionList2.getSelectedItem();
                String pos3 = (String) positionList3.getSelectedItem();
                tf.setText(id + ",\n" + name + ",\n" + address + ",\n" + chw + ",\n" + sex + ",\n"
                        + ed + ",\n" + maj + ",\n" + skill1 + ", " + skill2 + ", " + skill3 + ", " + skill4
                        + ", " + skill5 + ",\n" + pos1 + ", " + pos2 + ", " + pos3);
            }
        });

        c2.add(tf, BorderLayout.SOUTH);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}