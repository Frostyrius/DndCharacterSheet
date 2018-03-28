package dndcharactersheet;

import java.io.File;

public class Lookup {
    File charDir = new File("./characters");
    File spellDir = new File("./spells");
    File monsterDir = new File("./monsters");
    File itemDir = new File("./items");
    
    Lookup(){
        
    }
    
    public static void main(String[] args) {
        Lookup lookup = new Lookup();
    }
    
}
