import java.util.*;

public class Tree {
    Map<String,List<String>> countMap=new HashMap<>();
    //定义中国的省份
    List<String> chinaList=new ArrayList<>();
    //定义美国的州
    List<String> usaList=new ArrayList<>();
    public void init(){
        //添加中国省份
        chinaList.add(" 北京市");
        chinaList.add(" 上海市");
        chinaList.add(" 天津市");
        chinaList.add(" 重庆市");
        chinaList.add(" 云南省");
        chinaList.add(" 广东省");
        chinaList.add(" 江苏省");
        //添加美国省份
        usaList.add(" 俄克拉荷马州");
        usaList.add(" 阿拉斯加州");
        usaList.add(" 纽约州");
        usaList.add(" 印第安纳州");
        usaList.add(" 德克萨斯州");

        countMap.put("中国",chinaList);
        countMap.put("美国",usaList);
    }

    public void showInfo(){
        //我看看注释能不能编辑

        init();
        System.out.println("中国");
        List city=(List)countMap.get("中国");
        for (int i=0;i<city.size();i++){
            System.out.println(" "+city.get(i));
        }
        System.out.println("美国");
        List city2=(List)countMap.get("美国");
        for (int i=0;i<city2.size();i++){
            System.out.println(" "+city2.get(i));
        }
    }

    public static void main(String[] args) {
        Tree tee = new Tree();
        tee.showInfo();
    }
}
