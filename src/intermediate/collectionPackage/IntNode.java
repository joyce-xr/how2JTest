package intermediate.collectionPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 创建4万个随机数，然后用分别用冒泡法，选择法，二叉树3种排序算法进行排序，比较哪种更快
 */
public class IntNode {

    public IntNode leftIntNode;
    public IntNode rightIntNode;
    public Integer nodeValue;//默认值为null

    public void addInt(int v){

        if(nodeValue == null){
            nodeValue = v;
        }else{
            if(v <= nodeValue){
                if(leftIntNode == null){
                    leftIntNode = new IntNode();
                }
                leftIntNode.addInt(v);
            }else {
                if(rightIntNode == null){
                    rightIntNode = new IntNode();
                }
                rightIntNode.addInt(v);
            }

        }
    }

    public List<Integer> traverse(){
        List<Integer> intList = new LinkedList<>();
        if(leftIntNode != null){
            intList.addAll(leftIntNode.traverse());
        }
        intList.add(nodeValue);
        if(rightIntNode != null){
            intList.addAll(rightIntNode.traverse());
        }

        return intList;
    }


    //选择法
    public void selectionMethod(List<Integer> aimlist){

        for(int i=0; i<aimlist.size()-1;i++){
            for(int j=i+1; j<aimlist.size();j++){
                if(aimlist.get(i) > aimlist.get(j)){
                    int temp = aimlist.get(i);
                    aimlist.set(i,aimlist.get(j));
                    aimlist.set(j,temp);
                }
            }
        }

        for(int i=0;i<aimlist.size();i++){
            System.out.printf("%d\t",aimlist.get(i));
        }
    }

    //冒泡法
    public void bubbleMethod(List<Integer> aimlist){

        List<Integer> aimll = new LinkedList<>();
        aimll.addAll(aimlist);

        for(int i=0;i<aimll.size()-1;i++){
            for(int j=0; j<aimll.size()-i-1;j++){
                if(aimll.get(j) > aimll.get(j+1)){
                    int temp = aimll.get(j);
                    aimll.set(j,aimll.get(j+1));
                    aimll.set(j+1,temp);
                }
            }
        }

        for(int i=0;i<aimll.size();i++){
            System.out.printf("%d\t",aimll.get(i));
        }

    }

    //二叉树法
    public void binomialTree(List aimList){

        List<Integer> aimll = new LinkedList<>();




    }

    public List<Integer> randomNumber(int count){

        List<Integer> randomInts = new ArrayList<>();
        for(int i=0; i<count; i++){
            int randomInt = (int)(Math.random()*100);
            randomInts.add(randomInt);
        }

        return randomInts;

    }


    public static void main(String[] args) {
        IntNode test = new IntNode();

        test.selectionMethod(test.randomNumber(5));
        //test.bubbleMethod(randomInts);

    }
}
