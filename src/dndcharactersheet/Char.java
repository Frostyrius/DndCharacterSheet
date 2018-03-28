package dndcharactersheet;

public class Char {
    Stat strength;
    Stat dexterity;
    Stat constitution;
    Stat intelligence;
    Stat wisdom;
    Stat charisma;
    
    int size;
    int xp;
    
    String charName;
    String playerName;
    String campaign;
    
    String race;
    
    Char(){
        
    }
    
    Char(String charName, String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        setStats(strength, dexterity, constitution, intelligence, wisdom, charisma);
        this.charName = charName;
        this.race = race;
    }
    
    void setStats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.strength = new Stat(strength);
        this.dexterity = new Stat(dexterity);
        this.constitution = new Stat(constitution);
        this.intelligence = new Stat(intelligence);
        this.wisdom = new Stat(wisdom);
        this.charisma = new Stat(charisma);
    }
    
    void addXP(int xp){
        this.xp += xp;
    }
    
    int getXP(){
        return this.xp;
    }
    
//    int getLevel(){
//        
//    }

    void debug(){ //dump basic stats to console
        System.out.println("Charecter name: " + this.charName);
        System.out.println("Race: " + this.race);
        System.out.println("Str: " + this.strength.getStat() + " mod: " + this.strength.getModifier());
        System.out.println("Dex: " + this.dexterity.getStat() + " mod: " + this.dexterity.getModifier());
        System.out.println("Con: " + this.constitution.getStat() + " mod: " + this.constitution.getModifier());
        System.out.println("Int: " + this.intelligence.getStat() + " mod: " + this.intelligence.getModifier());
        System.out.println("Wis: " + this.wisdom.getStat() + " mod: " + this.wisdom.getModifier());
        System.out.println("Chr: " + this.charisma.getStat() + " mod: " + this.charisma.getModifier());
        
    }
}
