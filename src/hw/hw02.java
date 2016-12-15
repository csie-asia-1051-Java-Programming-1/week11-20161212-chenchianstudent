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
int x=1;
int data[]=new int[n];
while(x<n){
for(int i=0;i<data.length;i++){
System.out.print("請輸入整數");
data[i]=scn.nextInt();
x++;
}
}
int sum=0;
int show = 0;
for(int i=0;i<data.length;i++){
	for(int j=0;j<data.length-i;j++)
	if(data[j+1]==data[j]){
	sum++;
	show=data[j];
		
	}	

}
int b=n/2;
if(sum>b){
System.out.print(show);	
}else{
System.out.print("no");	
}

	}
}