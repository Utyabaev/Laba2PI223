import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)
import javax.swing.text.*;
import java.io.*;
import java.awt.*;

public class subversion {
    private MyDocumentFilter documentFilter;
	
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,500);
	main_GUI.setResizable(false); // ������������� ������ ����
    main_GUI.setLocationRelativeTo(null);
    
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �5"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,250,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(190,200,185,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton information = new JButton("����������");
	information.setBounds(10,200, 170, 40);
	ActionListener informationListener = new Info();
	information.addActionListener(informationListener);
	
	JButton numbers = new JButton("���������");
	numbers.setBounds(10,350,170,40);
	ActionListener numberListener = new Generator();
	numbers.addActionListener(numberListener);
	main_panel.add(numbers);
	
	JButton bubble = new JButton("����������� ����������");
	bubble.setBounds(190,350,185,40);
	ActionListener bubbleListener = new Sorting();
	bubble.addActionListener(bubbleListener);
	main_panel.add(bubble);
	
	JButton mas_gen = new JButton("��������� �������");
	mas_gen.setBounds(190,290,185,40);
	ActionListener mas_genListener = new Massive();
	mas_gen.addActionListener(mas_genListener);
	main_panel.add(mas_gen);
	
	JButton lr4 = new JButton("������� �������");
	lr4.setBounds(10,290,170,40);
	main_panel.add(lr4);
	
	lr4.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame("������� ����������� ������");
		frame.setBounds(10, 10, 420, 350);
	    frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JLabel radius = new JLabel("������� ������ (R) (��)");
	    radius.setBounds(10, 15, 180, 15);
	    frame.add(radius);
	    
	    JTextField field1 = new JTextField(15);
	    ((AbstractDocument) field1.getDocument()).setDocumentFilter(
	            new MyDocumentFilter());
	    field1.setBounds(190, 10, 200, 25);
	    frame.add(field1);
	    
	    JLabel obr = new JLabel("������� ���������� (L) (��)");
	    obr.setBounds(10, 45, 180, 15);
	    frame.add(obr);

	    JTextField field2 = new JTextField(15);
	    ((AbstractDocument) field2.getDocument()).setDocumentFilter(
	            new MyDocumentFilter());
	    field2.setBounds(190, 40, 200, 25);
	    frame.add(field2);

	    JButton calculate = new JButton("����������");
	    calculate.setBounds(150, 110, 120, 25);
	    frame.add(calculate); 
	    
	    JButton back = new JButton("�����");
	    back.setBounds(150, 140, 120, 25);
	    frame.add(back);
        back.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
            }
        });

	    JTextField result_window = new JTextField();
	    result_window.setBounds(190, 70, 200, 25);
	    result_window.setText("0 ��.��");
	    result_window.setEditable(false);
	    frame.add(result_window);

	    JLabel result_text = new JLabel("");
	    result_text.setLocation(10,70);
	    frame.add(result_text);
	    
		calculate.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {

	            if(field1.getText().trim().equals("0") || field1.getText().trim().isEmpty())
	            {
	                JOptionPane.showMessageDialog(null, "������� ������!", "��������", JOptionPane.ERROR_MESSAGE);
	                return;
	            }

	            if(field2.getText().trim().equals("0") || field2.getText().trim().isEmpty())
	            {
	                JOptionPane.showMessageDialog(null, "������� ����������!", "��������", JOptionPane.ERROR_MESSAGE);
	                return;
	            }

	            String R_str = field1.getText();
	            double R = Double.parseDouble(R_str);

	            String L_str = field2.getText();
	            double L = Double.parseDouble(L_str);

	            double result = (3.14 * R * (R + L));

	            String result_str = result + "";

	            result_window.setText("~" + result_str + " ��.��");
	        }
	    });
	}
	});
	
	
	main_panel.add(information);
	
	main_GUI.setVisible(true);
	JMenuBar jmb = new JMenuBar();
	main_GUI.setJMenuBar(jmb);
	JMenu menu = new JMenu("����");
	jmb.add(menu);
	JLabel imagelabel = new JLabel();
	
	//user328//
	JMenuItem load = new JMenuItem("��������� ���� � ������ 28");
	menu.add(load);
	//user328//
	
	imagelabel.setIcon(new ImageIcon(getClass().getResource("logo.png")));
	JMenuItem logo = new JMenuItem("���������� ������� �����");
	menu.add(logo);
	logo.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent j) {
	main_panel.add(imagelabel);
	imagelabel.setBounds(260, -200, 500, 500);
	}
	});
	menu.addSeparator();
	JMenuItem exit = new JMenuItem("�����");
	menu.add(exit);
	exit.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
	System.exit(0);
	}
	});
	String[] mover = {"����������� ������� ����� � ������� ������ ����", "����������� ������� ����� � ��������", "����������� ������� ����� � ����� ������� ����"/*/*user428*/, "������������� ������ � ������� 28"/*user428*/};
	JComboBox list = new JComboBox(mover);
	list.setBounds(25,130,350,25);
	main_panel.add(list);
	main_panel.setVisible(true);
	list.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == list) {
	JComboBox cb = (JComboBox)e.getSource();
	String msg = (String)cb.getSelectedItem();
	switch (msg) {
	case "����������� ������� ����� � ������� ������ ����": imagelabel.setLocation(260, -200);
	break;
	case "����������� ������� ����� � ��������": imagelabel.setLocation(130, -200);
	break;
	case "����������� ������� ����� � ����� ������� ����": imagelabel.setLocation(0, -200);
	break;
	}
	}
	}
	});
	main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
	}

}

class MyDocumentFilter extends DocumentFilter {
    @Override
    public void insertString(DocumentFilter.FilterBypass fp
            , int offset, String string, AttributeSet aset)
            throws BadLocationException {
        int len = string.length();
        boolean isValidInteger = true;

        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(string.charAt(i))) {
                isValidInteger = false;
                break;
            }
        }
        if (isValidInteger)
            super.insertString(fp, offset, string, aset);
        else
            Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fp, int offset
            , int length, String string, AttributeSet aset)
            throws BadLocationException {
        int len = string.length();
        boolean isValidInteger = true;

        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(string.charAt(i))) {
                isValidInteger = false;
                break;
            }
        }
        if (isValidInteger)
            super.replace(fp, offset, length, string, aset);
        else
            Toolkit.getDefaultToolkit().beep();
    }
}