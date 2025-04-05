package doem01;

public class TowerDefense {
    int x;
    int y;

    public TowerDefense() {

    }

    public TowerDefense(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("·ÀÓùËþÒÑ¾­±»ÊµÀý»¯ÁË");
        System.out.println("·ÀÓùËþºá×ø±ê="+x+"\t"+"·ÀÓùËþ×Ý×ø±ê="+y);
    }

    public static void main(String[] args) {
//        TowerDefense t1=new TowerDefense(10,20);
    	int i=0,j=9;
    	do{
    		if(i++ > j--){
    		break;
    	}
    	}while(i<4);
    	System.out.println("i="+i+"and j="+j);

    }
}
