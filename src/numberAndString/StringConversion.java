package numberAndString;

public class StringConversion {

    public static void main(String[] args) {

        double d = 3.14;
        String s = "3.14";

        String s2 = String.valueOf(d);
        System.out.println(s2);

        double d2 = Double.parseDouble(s);
        System.out.println(d2);

        String s3 = "3.1a4";
        double d3 = Double.parseDouble(s3); //NumberFormatException
        System.out.println(d3);

    }
}
