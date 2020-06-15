package classAndObject;

public class ObjTest {
    public String name;
    protected float hp;

    public static void main(String[] args) {

        ObjTest obj1 = new ObjTest();
        ObjTest obj2 = new ObjTest();
        ObjTest obj3;
        ObjTest obj4;
        obj3 = obj1;
        obj4 = obj3;

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

    }
}
