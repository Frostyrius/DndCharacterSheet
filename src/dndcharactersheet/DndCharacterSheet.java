package dndcharactersheet;

import java.io.File;
import javax.swing.*;

public class DndCharacterSheet {
    JFrame f;
    
    Char character;
    
    Item [] items;
    Spell [] spells;
    
    File charDir = new File("./characters");
    File raceDir = new File("./races");
    File classDir = new File("./classes");
    File spellDir = new File("./spells");
    File monsterDir = new File("./monsters");
    File itemDir = new File("./items");
    
    
    
    DndCharacterSheet(){
        JFrame frame = new JFrame("window");
        frame.setResizable(false);

        JButton button = new JButton("wtf");
        button.setBounds(130, 100, 100, 40);
        frame.add(button);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        try {
            File dir = new File("./characters/");
            File [] filesList = dir.listFiles();
            System.out.println("Number of files: " + filesList.length);
            for(File f : filesList){
                if(f.isFile()){
                    System.out.println(f.getName());
                }
            }
        } catch (Exception e){
            System.out.println(e);
            Error error = new Error("", e);
        }
    }   
    
}
