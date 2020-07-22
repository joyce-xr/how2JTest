package interfaceAndImplement.practice;

public class Spider extends Animals {

    public Spider(int legs){
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("Spider eat");
    }

}
