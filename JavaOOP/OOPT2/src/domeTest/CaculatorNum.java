package domeTest;

public class CaculatorNum {
	int num1,num2;
	char operator;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public void caculate(char operator) {
		int ret=0;
		switch (operator) {
		case '+':
			ret = Tools.add(num1, num2);
			System.out.println("��ӵĽ��Ϊ��"+ret);
			break;
		case '-':
			ret=Tools.minus(num1, num2);
			System.out.println("����Ľ��Ϊ��"+ret);
			break;
		case '*':
			ret=Tools.multiplicate(num1, num2);
			System.out.println("��˵Ľ��Ϊ��"+ret);
			break;
		case '/':
			ret=Tools.divide(num1, num2);
			System.out.println("����Ľ��Ϊ��"+ret);
			break;
		default:
			break;
		}
	}
	
}
