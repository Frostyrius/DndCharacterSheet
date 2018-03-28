package dndcharactersheet;

public class Utils {
    
    static int diceRoll(int dice){
        return ( (int) Math.round( Math.random() * ( dice - 1 ) ) + 1 );
    }
    
    static int getModifier(int val){
        return (int)Math.floor( (val / 2) - 5 );
    }
    
}
