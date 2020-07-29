package primary.interfaceAndImplement.practice;

public class Cat extends Animals implements Pet{

    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");
    }

    public String toString(){
        return this.name;
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
    public void eat() {

    }

    public static void main(String[] args) {
        new Cat("ketty").walk();
    }
}
