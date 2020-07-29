package primary.interfaceAndImplement.practice;

public class Fish extends Animals implements Pet {

    private String name;

    Fish(){
        super(0);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void play() {

    }

    @Override
    public void walk(){
        System.out.println("鱼没有腿，不能走路");
    }
}
