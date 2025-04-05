package Test0426;
//Ö½ÅÆÈý½Ç
public class Main2 {
    public static void main(String[] args) {
        int count =0;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        for (int e = 1; e < 10; e++) {
                            for (int f = 1; f < 10; f++) {
                                for (int g = 1; g < 10; g++) {
                                    for (int h = 1; h < 10; h++) {
                                        for (int i = 1; i < 10; i++) {
                                            if ((a+b+d+f)==(a+c+e+i)&&(a+b+d+f)==(f+g+h+i)
                                            &&a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&a!=g&&a!=h&&a!=i
                                            &&b!=c&&b!=d&&b!=e&&b!=f&&b!=g&&b!=h&&b!=i
                                            &&c!=d&&c!=e&&c!=f&&c!=g&&c!=h&&c!=i
                                            &&d!=e&&d!=f&&d!=g&&d!=h&&d!=i
                                            &&e!=f&&e!=g&&e!=h&&e!=i
                                            &&f!=g&&f!=h&&f!=i
                                            &&g!=h&&g!=i
                                            &&h!=i){
                                                count++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count/6);
    }
}
