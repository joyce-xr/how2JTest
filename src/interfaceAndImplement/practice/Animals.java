package interfaceAndImplement.practice;

public abstract class Animals {
    protected int legs;
    protected Animals(int legs){
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.printf(this + "是用%d条腿行走的" , legs);
    }
}
