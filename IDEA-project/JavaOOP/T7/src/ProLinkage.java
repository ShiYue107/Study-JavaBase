import java.util.*;

public class ProLinkage {
    List list1=new ArrayList();
    List list2=new ArrayList();
    List list3=new ArrayList();
    List list4=new ArrayList();
    Map<String,List<String>> proCity=new HashMap<>();
    public void init(){
        //添加北京的区
        list1.add("东城区");
        list1.add("西城区");
        list1.add("海淀区");
        list1.add("朝阳区");
        list1.add("昌平区");
        //添加上海的区
        list2.add("浦东新区");
        list2.add("徐汇区");
        list2.add("虹口区");
        list2.add("黄浦区");
        list2.add("长宁区");
        //添加重庆的区
        list3.add("重庆1区");
        list3.add("重庆2区");
        list3.add("重庆3区");
        list3.add("重庆4区");
        list3.add("重庆5区");
        //添加天津的区
        list4.add("天津1区");
        list4.add("天津2区");
        list4.add("天津3区");
        list4.add("天津4区");
        list4.add("天津5区");
        proCity.put("北京",list1);
        proCity.put("上海",list2);
        proCity.put("重庆",list3);
        proCity.put("天津",list4);
    }
    public void showInfo(Scanner sc){
        init();
        System.out.print("请选直辖市：");
        Set set=proCity.keySet();
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.print("【"+it.next()+"】");
        }
        System.out.println();
        String name=sc.next();
        List city=(List) proCity.get(name);
        System.out.print("区的名字：");
        for (int i = 0; i <city.size(); i++) {
            System.out.print(city.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ProLinkage page=new ProLinkage();
        page.showInfo(sc);
    }
}
