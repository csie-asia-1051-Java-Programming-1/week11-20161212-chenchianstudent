package hw;
import java.util.Scanner;
/*
 * 一個含 N 個整數的序列中，出現頻率超過 N/2 的整數稱為『過半元素』。
 * 寫一個程式求一整數序列是否有過半元素(一整數序列以空白鍵隔開數字;0 < N < 11; 序列中的數字都是 integer; 
 * 輸入包含多 行，一行為一筆測資。若有 過半元素， 輸出該數; 否則輸出 NO)
 * Date: 2016/12/12
 * Author: 105021007 陳麒安
 */
public class hw02 {
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.print("請輸入n為多少個數(0<n<11)");
int n=scn.nextInt();
while(n>=11||n<=0){
System.out.print("請重新輸入：");
int n1=scn.nextInt();
n1=n;
break;
}
int x=1;
int data[]=new int[n];
while(x<n){
for(int i=0;i<n;i++){
System.out.print("請輸入整數");
data[i]=scn.nextInt();
x++;
}
}

	}
}