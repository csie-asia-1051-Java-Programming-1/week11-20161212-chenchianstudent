package hw;
import java.util.Scanner;
/*
 * �@�ӧt N �Ӿ�ƪ��ǦC���A�X�{�W�v�W�L N/2 ����ƺ٬��y�L�b�����z�C
 * �g�@�ӵ{���D�@��ƧǦC�O�_���L�b����(�@��ƧǦC�H�ť���j�}�Ʀr;0 < N < 11; �ǦC�����Ʀr���O integer; 
 * ��J�]�t�h ��A�@�欰�@������C�Y�� �L�b�����A ��X�Ӽ�; �_�h��X NO)
 * Date: 2016/12/12
 * Author: 105021007 ���Q�w
 */
public class hw02 {
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.print("�п�Jn���h�֭Ӽ�(0<n<11)");
int n=scn.nextInt();
int x=1;
int data[]=new int[n];
while(x<n){
for(int i=0;i<data.length;i++){
System.out.print("�п�J���");
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