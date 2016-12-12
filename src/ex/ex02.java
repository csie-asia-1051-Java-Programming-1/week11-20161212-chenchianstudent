package ex;
import java.util.Scanner;
/*
 * 寫一個程式求一整數序列所含之整數個數及平均值。一整數序列以空白鍵隔開數字。
 * 序列所含之整數個數及平均值。精確至小數點第 3 位(由小數點第 4 位四捨五入)
 * Date: 2016/12/12
 * Author: 105021007 陳麒安
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x = 0;
		int sum=0;
		while(true){
		int n=scn.nextInt();
		x++;
		sum=sum+n;
		System.out.print("是否要繼續(Y/N)");
		char re=scn.next().charAt(0);
		if(re=='N'||re=='n'){
		break;	
		}
		}
		System.out.print("Size="+x);
		System.out.println("平均值為"+(double)sum/x);
			}
			
		}