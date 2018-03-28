package dndcharactersheet;

import javax.swing.*;

public class Error {
    
    Error(String s, Exception e){
        JDialog dialog = new JDialog();
        dialog.setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));
        dialog.add(panel);
        
        
        JLabel label = new JLabel(e.toString());
        panel.add(label);
        
        
        
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setSize(300, 150);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
