package intermediate.collectionPackage;

import java.util.LinkedList;
import java.util.List;

public class Node {

    public Node leftNode;
    public Node rightNode;

    public Object value;

    public void add(Object o){

        //判断根节点为空的话，先插入根节点
        if(value == null){
            value = o;
        }else {//如果当前节点有值，就比较大小

            //新增的值小于或等于当前节点值
            if((Integer)o <= (Integer)value){
                //当前节点的左节点是否为空
                if(leftNode == null){
                    leftNode = new Node();
                }
                leftNode.add(o);
            }

            //新增的值大于当前节点值
            else {
                if(rightNode == null){
                    rightNode = new Node();
                }
                rightNode.add(o);
            }
        }

    }

    public List<Object> traverse(){
        List<Object> values = new LinkedList<>();

        if(leftNode != null){
            values.addAll(leftNode.traverse());
        }
        values.add(value);

        if(rightNode != null){
            values.addAll(rightNode.traverse());
        }

        return values;
    }

    public static void main(String[] args) {

        int[] ints = {67,7,30,73,10,0,78,81,10,74};

        Node root = new Node();
        for (int i : ints){
            root.add(i);
        }

        System.out.println(root.traverse());
    }
}

