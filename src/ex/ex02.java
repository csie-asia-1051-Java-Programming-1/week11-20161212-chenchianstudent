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
		int x = 0;
		int sum=0;
		while(true){
		int n=scn.nextInt();
		x++;
		sum=sum+n;
		System.out.print("�O�_�n�~��(Y/N)");
		char re=scn.next().charAt(0);
		if(re=='N'||re=='n'){
		break;	
		}
		}
		System.out.print("Size="+x);
		System.out.println("�����Ȭ�"+(double)sum/x);
			}
			
		}