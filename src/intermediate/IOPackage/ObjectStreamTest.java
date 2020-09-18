package intermediate.IOPackage;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class ObjectStreamTest {

    public static void main(String[] args) {
        //test1();

        serializeArray();
    }

    public static void serializeArray(){

        SerializableObject[] serializableObjects = new SerializableObject[10];
        for(int i=0;i<10;i++){
            serializableObjects[i] = new SerializableObject("hero:"+i,100);
        }

        try {
            File file = new File("D:\\ideaWorkSpace\\fileTest\\objectsStream.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializableObjects);

            objectOutputStream.flush();

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerializableObject[] serializableObjectsR = (SerializableObject[]) objectInputStream.readObject();

            System.out.println("打印文件中反序列化出来的元素");
            for(SerializableObject o : serializableObjectsR){
                System.out.println(o.name);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void test1(){

        SerializableObject serializableObject = new SerializableObject();
        serializableObject.name="序列化对象名";
        serializableObject.hp = 1000;

        File file = new File("D:\\ideaWorkSpace\\fileTest\\objectStream.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(serializableObject);

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            SerializableObject serializableObject2 = (SerializableObject) objectInputStream.readObject();

            System.out.println("读取文件中序列表对象属性值：");
            System.out.println(serializableObject2.name);
            System.out.println(serializableObject2.hp);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}


/**
 * 序列化对象实体类
 */
class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;

    public SerializableObject(){}

    public SerializableObject(String name,float hp){
        this.name = name;
        this.hp =hp;
    }
}
