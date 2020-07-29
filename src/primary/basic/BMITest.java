package primary.basic;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner inpurt = new Scanner(System.in);
        System.out.println("请输入你的身高(m)： ");
        float height = inpurt.nextFloat();
        System.out.println("请输入你的体重(kg)： ");
        float weight = inpurt.nextFloat();

        float bmi = weight/(height*height);
        System.out.println("你的BMI值为：" +bmi);

        if(bmi<18.5){
            System.out.println("体重过轻");
        }else if(bmi>=18.5 && bmi<24){
            System.out.println("体重正常");
        }else if(bmi>=24 && bmi<27){
            System.out.println("体重过重");
        }else if (bmi>=27 && bmi<30){
            System.out.println("轻度肥胖");
        }else if (bmi>=30 && bmi <35){
            System.out.println("中度肥胖");
        }else {
            System.out.println("重度肥胖");
        }
    }
}
