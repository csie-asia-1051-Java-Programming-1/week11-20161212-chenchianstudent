package ex;
import java.util.Scanner;
/*
 * �g�@�ӵ{���D�@��ƧǦC�ҧt����ƭӼƤΥ����ȡC�@��ƧǦC�H�ť���j�}�Ʀr�C
 * �ǦC�ҧt����ƭӼƤΥ����ȡC��T�ܤp���I�� 3 ��(�Ѥp���I�� 4 ��|�ˤ��J)
 * Date: 2016/12/12
 * Author: 105021007 ���Q�w
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
System.out.print("������:"+sum1);
		
		
	}
}