import java.util.Arrays;
import java.util.List;

public class TTThj {
    public static void main(String[] args) {
        Integer [] arr=new Integer[]{1,2,3};
        List<Integer> list= Arrays.asList(arr);
//        for (Object num:list ) {
//            System.out.println(num);
//        }
        String [] strs =new String[]{"张三","王五","赵六","小黄"};
        List<String> strList=Arrays.asList(strs);
//        for (Object str:strList) {
//            System.out.println(str);
//        }
        for (int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        for (int i=0;i<strList.size();i++){
            System.out.println(strs[i]);
        }
    }
}
