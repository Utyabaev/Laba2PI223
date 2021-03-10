import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
 
import javax.swing.*;

public class Sorting implements ActionListener {
	@Override
    public void actionPerformed(ActionEvent arg0) {
		final JFrame fra = new JFrame("Пузырьковая сортировка");
	    JPanel gui2 = new JPanel(new BorderLayout());
        
        fra.setContentPane(gui2);
        fra.pack();
        fra.setSize(300,400);
        fra.setLocationByPlatform(true);

        fra.setVisible(true);
        fra.setResizable(false);
        fra.setLayout(null);
        fra.setLocationRelativeTo(null);
		   
        JLabel ishnad = new JLabel("Исходный массив");
        ishnad.setBounds(50, 15, 200, 20);
        gui2.add(ishnad);
        
	    JTextField ish = new JTextField();
	    ish.setBounds(50,40,200,40);
	    ish.setEditable(false);
	    gui2.add(ish);
	    
        JLabel sorted = new JLabel("Отсортированный массив");
        sorted.setBounds(50, 80, 200, 40);
        gui2.add(sorted);
	    
	    JTextField result = new JTextField();
	    result.setBounds(50,115,200,40);
	    result.setEditable(false);
	    gui2.add(result);
		
		JButton generate = new JButton("Отсортировать массив");
		generate.setBounds(50,170,200,40);
		gui2.add(generate);

		JButton back = new JButton("Назад");
	        back.addActionListener( new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                fra.setVisible(false);
	            }
	        });
	        
	    back.setBounds(50,220,200,40);
	    gui2.add(back);
	        
	    class ArrayBubble{
		    private long[] a;   
		    private int elems;  

		    public ArrayBubble(int max){   
		        a = new long[max];          
		        elems = 0;                 
		    }

		    public void into(long value){  
		        a[elems] = value;          
		        elems++;                  
		    }

		    String mas1 = "";
		    
		    public void setter(){         
		        for (int i = 0; i < elems; i++){
		        	mas1 = mas1 + a[i] + " ";
		        }
			    ish.setText(mas1);
		    }
		    
		    String mas = "";

		    public void printer(){          
		        for (int i = 0; i < elems; i++){
		        	mas = mas + a[i] + " ";
		        }
			    result.setText(mas);
			    
		    }

		    private void toSwap(int first, int second){ 
		        long dummy = a[first];     
		        a[first] = a[second];       
		        a[second] = dummy;         
		    }

		    public void bubbleSorter(){   
		        for (int out = elems - 1; out >= 1; out--){  
		            for (int in = 0; in < out; in++){       
		                if(a[in] > a[in + 1])               
		                    toSwap(in, in + 1);          
		            }
		        }
		    }
		}
	    
		generate.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	ArrayBubble array = new ArrayBubble(5); 

		        array.into(163);      
		        array.into(2);
		        array.into(184);
		        array.into(191);
		        array.into(174);
		        array.setter(); 
		        array.bubbleSorter();       
		        array.printer(); 
	        }
	    });
	}
}
		