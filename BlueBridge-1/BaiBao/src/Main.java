
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] zl= {5,25,30,45,50};
		int [] jz= {50,200,180,225,200};
		int max=1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <2; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					for (int k = 0; k < 2; k++) {
						for (int k2 = 0; k2 < 2; k2++) {
							int zzl=0;
							int zjz=0;
							if (i==0) {
								zzl+=zl[0];
								zjz+=jz[0];
							}
							if (j==0) {
								zzl+=zl[1];
								zjz+=jz[1];
							}
							if (j2==0) {
								zzl+=zl[2];
								zjz+=jz[2];
							}
							if (k==0) {
								zzl+=zl[3];
								zjz+=jz[3];
							}
							if (k2==0) {
								zzl+=zl[4];
								zjz+=jz[4];
							}
							if(zzl>100) {
								continue;
							}
							if (max<zjz) {
								max=zjz;
							}
						}
					}
				}
			}
		}
		System.out.println("总价值最大为："+max);
	}
}
