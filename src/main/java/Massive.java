import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
 
import javax.swing.*;
 

public class Massive extends Generator implements ActionListener {
	@Override
    public void actionPerformed(ActionEvent arg0) {
		
		final JFrame fr = new JFrame("Генератор чисел в массиве");
	    JPanel gui = new JPanel(new BorderLayout());
        
        fr.setContentPane(gui);
        fr.pack();
        fr.setSize(300,300);
        fr.setLocationByPlatform(true);

        fr.setVisible(true);
        fr.setResizable(false);
        fr.setLayout(null);
        fr.setLocationRelativeTo(null);
       	
        JLabel generated = new JLabel("Сгенерированный массив:");
        generated.setBounds(10, 45, 200, 40);
        gui.add(generated);
        
	    JTextField result = new JTextField();
	    result.setBounds(10,80,265,40);
	    result.setEditable(false);
	    gui.add(result);
	    
		JButton generate = new JButton("Сгенерировать числа");
		generate.setBounds(50,150,200,40);
		gui.add(generate);

		JButton back = new JButton("Назад");
	        back.addActionListener( new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                fr.setVisible(false);
	            }
	        });
	        
	    back.setBounds(50,200,200,40);
	    gui.add(back);
	        
	    
		generate.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	    	    String rnd_str = "";
	        	int[] random  = new int[10];
	        	final int min = 20; 
	    		final int max = 160; 
	        	random[0] = rnd(min, max);
	        	random[1] = rnd(min, max);
	        	random[2] = rnd(min, max);
	        	random[3] = rnd(min, max);
	        	random[4] = rnd(min, max);
	        	random[5] = rnd(min, max);
	        	random[6] = rnd(min, max);
	        	random[7] = rnd(min, max);
	        	random[8] = rnd(min, max);
	        	random[9] = rnd(min, max);
	        	for (int i = 0; i < 10; i++) {
	        		rnd_str = rnd_str + random[i] + " ";
		    		result.setText(rnd_str);
	        		}	
	        }
	    });
	};
}