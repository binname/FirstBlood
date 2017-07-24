import java.util.Scanner;

public class Jiecheng{

	public static void main(String[] args) {
		
		Scanner han=new Scanner(System.in);
		System.out.println("请输入数字：");
		int n=han.nextInt();
		int i;
		int factor=1;
		for(i=1;i<=10;i++)
		{
			factor=factor*i;
			System.out.println(factor);
		}
	}
}
