package Playgame;

public abstract class Charater {
     WaponBehavior weapo;
    private SwordBehavior swordBehavior;
    private BowandborrowBehavior bowandborrowBehavior;
    private KnightBehavior knightBehavior;
    private AxebEHAVIOR axEhavior;

    public void  performFight(){
        WaponBehavior.usewapond();
    }

    public void setWeapo(WaponBehavior weapo) {
        this.weapo = weapo;
    }

    public void setAxEhavior(AxebEHAVIOR axEhavior) {
        this.axEhavior = axEhavior;
    }

    public void setBowandborrowBehavior(BowandborrowBehavior bowandborrowBehavior) {
        this.bowandborrowBehavior = bowandborrowBehavior;
    }

    public void setKnightBehavior(KnightBehavior knightBehavior) {
        this.knightBehavior = knightBehavior;
    }

    public void setSwordBehavior(SwordBehavior swordBehavior) {
        this.swordBehavior = swordBehavior;
    }

    public void performWord() {
        WaponBehavior.usewapond();
    }
    public void fight(){

    }
}
