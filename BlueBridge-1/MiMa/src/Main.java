import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		String num=rd.nextInt(1000)+100+"";
		int cou=0;
		int ci=0;
		String tm=null;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					String m=""+i+j+k;
					cou++;
					System.out.println(m);
					if (num.equals(m)) {
						ci=cou;
						tm=m;
					}
				}
			}
		}
		System.out.println("һ���У�"+cou+"�ֿ���");
		System.out.println("��ȷ������Ϊ��"+ci+"�εģ�"+tm+"\n�ѿ�����");
	}

}
