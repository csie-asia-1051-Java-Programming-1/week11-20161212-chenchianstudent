package ex;
import java.util.Scanner;
/*
 * 糶祘Α―俱计┮ぇ俱计计のキА俱计フ龄筳秨计
 * ┮ぇ俱计计のキА弘絋计翴材 3 (パ计翴材 4 彼き)
 * Date: 2016/12/12
 * Author: 105021007 朝腝
 */
public class ex02 {
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
String n=scn.nextLine();
String m="";
float sum=0;
float sum1=0;
int a=0;
for(int i=0;i<n.length();i++){
if(n.charAt(i)!=' '){
m=""+n.charAt(i);
}
else{
sum1=Integer.parseInt(m);
sum=sum+sum1;
a++;
}
if(i==n.length()-1){
sum1=Integer.parseInt(m);
sum=sum+sum1;
}
}
double average;
sum1=(float)Math.round((sum/a)*1000f)/1000f;
System.out.println("Size:"+a);
System.out.print("キА计:"+sum1);
		
		
	}
}