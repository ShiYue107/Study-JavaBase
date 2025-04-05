package dome03;

public class Method {

    public int getSum(int...number) {
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Method mth=new Method();
        System.out.println(mth.getSum(11,22,33,66,55,5));
    }
}
