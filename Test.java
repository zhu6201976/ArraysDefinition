
import java.util.Scanner;
import java.util.Arrays;
/**
数组的四种定义方式：
一、使用默认的初始值来初始化数组中的每一个元素
语法：数组元素类型 [] 数组名 = new 数组元素类型[数组中元素的个数（数组的长度）];
 如：int [] scores = new int[3];

二、先声明，然后再赋予默认的初始值。
语法：数组元素类型 [] 数组名;
      数组名= new 数组元素类型[数组中元素的个数（数组的长度）];
 如：int [] scores;
     scores = new int[3];

三、先声明，然后再使用指定的值进行初始化。
语法：数组元素类型 [] 数组名 = new 数组元素类型[]{元素1，元素2,....};
 如：int [] scores = new int[]{56,78,98};

四、将第三种写法可以简化为（使用数组常量值给数组进行赋值）
语法：数组元素类型 [] 数组名 = {元素1，元素2,....};
 如：int [] scores =  {56,78,98};
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// 第一种，使用默认的初始值来初始化数组中的每一个元素
		int[] scores1 = new int[3];
		System.out.println(Arrays.toString(scores1));
		// 打印结果：[0, 0, 0]
		
		
        // 第二种，先声明，然后再赋予默认的初始值。
		int[] scores2;
		scores2 = new int[3];
		System.out.println(Arrays.toString(scores2));
		
		// 第三种，先声明，然后再使用指定的值进行初始化。
		int[] scores3 = new int[]{56,78,98};
		System.out.println(Arrays.toString(scores3));
		
		// 第四种，将第三种写法可以简化为（使用数组常量值给数组进行赋值）
		int[] scores4 = {56,78,98};
		System.out.println(Arrays.toString(scores4));
	
	}
}