import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
 
import javax.swing.*;
 
import java.io.File;

public class Info implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
    	
        final JFrame f = new JFrame("Информация");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("src/main/java"));
        
        JPanel gui = new JPanel(new BorderLayout());

        final JEditorPane document = new JEditorPane();
        gui.add(new JScrollPane(document), BorderLayout.CENTER);
        
        JButton open = new JButton("Выбрать файл...");
        open.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int result = fileChooser.showOpenDialog(f);
                if (result==JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        document.setPage(file.toURI().toURL());
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        gui.add(open, BorderLayout.NORTH);

        JButton back = new JButton("Назад");
        back.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
            }
        });
        
        gui.add(back, BorderLayout.SOUTH);
        
        f.setContentPane(gui);
        f.pack();
        f.setSize(300,300);
        //f.setLocationByPlatform(true);

        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        
      
    }
}