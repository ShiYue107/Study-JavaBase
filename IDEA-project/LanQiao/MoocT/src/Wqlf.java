import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/10 13:38
 */
public class Wqlf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for (int a = 2; a <= N; a++) {
            for (int b = 2; b < a; b++) {
                for (int c = b ; c < a; c++) {
                    for (int d = c; d < a; d++) {
                        if (a*a*a == b*b*b + c*c*c + d*d*d){
                            System.out.println("Cube="+ a +";Triple=("+b+","+c+","+d+")");
                        }
                    }
                }
            }
        }
    }
}
