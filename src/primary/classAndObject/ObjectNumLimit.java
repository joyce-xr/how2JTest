package primary.classAndObject;

public class ObjectNumLimit {

    private static int objectNum = 0;

    private ObjectNumLimit(){
        System.out.println("创建一个ObjectNumLimitTest对象");
    }

    public static ObjectNumLimit getObject(){
        System.out.println("objectNum===="+objectNum);
        if(objectNum<=5){
            objectNum++;
            return new ObjectNumLimit();
        }else {
            return null;
        }
    }

}
