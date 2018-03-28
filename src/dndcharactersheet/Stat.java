package dndcharactersheet;

public class Stat {
    int val;
    boolean prof;
    int override;
    
    Stat(int val){
        this.val = val;
        this.prof = false;
        this.override = -1; //-1 for override disabling, because character can reach 0 stat (if it's strength, char dies)
    }
    
    int getStat(){
        if(override != -1){
            return this.override;
        }
        return this.val;
    }
    
    void setStat(int val){
        this.val = val;
    }
    
    boolean getProf(){
        return this.prof;
    }
    
    void setProf(boolean prof){
        this.prof = prof;
    }
    
    void setOverride(int override){
        this.override = override;
    }
    
    void removeOverride(){
        this.override = -1;
    }
    
    int getModifier(){
        return (int)Math.floor( (this.val / 2) - 5 );
    }
}
