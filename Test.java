
import java.util.Scanner;
import java.util.Arrays;
/**
��������ֶ��巽ʽ��
һ��ʹ��Ĭ�ϵĳ�ʼֵ����ʼ�������е�ÿһ��Ԫ��
�﷨������Ԫ������ [] ������ = new ����Ԫ������[������Ԫ�صĸ���������ĳ��ȣ�];
 �磺int [] scores = new int[3];

������������Ȼ���ٸ���Ĭ�ϵĳ�ʼֵ��
�﷨������Ԫ������ [] ������;
      ������= new ����Ԫ������[������Ԫ�صĸ���������ĳ��ȣ�];
 �磺int [] scores;
     scores = new int[3];

������������Ȼ����ʹ��ָ����ֵ���г�ʼ����
�﷨������Ԫ������ [] ������ = new ����Ԫ������[]{Ԫ��1��Ԫ��2,....};
 �磺int [] scores = new int[]{56,78,98};

�ġ���������д�����Լ�Ϊ��ʹ�����鳣��ֵ��������и�ֵ��
�﷨������Ԫ������ [] ������ = {Ԫ��1��Ԫ��2,....};
 �磺int [] scores =  {56,78,98};
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// ��һ�֣�ʹ��Ĭ�ϵĳ�ʼֵ����ʼ�������е�ÿһ��Ԫ��
		int[] scores1 = new int[3];
		System.out.println(Arrays.toString(scores1));
		// ��ӡ�����[0, 0, 0]
		
		
        // �ڶ��֣���������Ȼ���ٸ���Ĭ�ϵĳ�ʼֵ��
		int[] scores2;
		scores2 = new int[3];
		System.out.println(Arrays.toString(scores2));
		
		// �����֣���������Ȼ����ʹ��ָ����ֵ���г�ʼ����
		int[] scores3 = new int[]{56,78,98};
		System.out.println(Arrays.toString(scores3));
		
		// �����֣���������д�����Լ�Ϊ��ʹ�����鳣��ֵ��������и�ֵ��
		int[] scores4 = {56,78,98};
		System.out.println(Arrays.toString(scores4));
	
	}
}