package hw;
import java.util.Scanner;
/*
 * �ө���K�b�O�Z�W���@�ﱡ�Q�A�L�̦��g�洫��O�ӥ��o�ɶ����ߺD�A���F����L�� �g�����e�Q�����Ǫ��P�ǡA�Ϊ̬O���p�߳Q�Ѯv�S���A
 * ���n���F�̭��g���F��A�L�� �Q��F�@�ӿ�k�A�N�O�⤺�e���Ҧ��r��������ƴX�����r�����N�A�ө���ƴX���� �ƥشN�g�b���e���U�@��C
 * ���O�A���D�ӤF�A�K�bı�o�C���g�����n�b�ƨӼƥh���� �Ʀ����[�K���榡�A��b�O�ӳ·ФF�C
 * ���Sê�󤣷Q�Q�������ݨ줺�e�A��O�o���U�A �g�ӵ{�������o�i�H������g�n�����e��Ʀ����[�K�������A�C
 * �[�K���G���|�v�T��r �����j�p�g�A�B�Ʀr������@�ۦP�B�z�A�����B�z�Ÿ��ίS��r���Τ���C
 * (�Ĥ@�欰�Q��J�����e�A���W�L 100 �Ӧr�A�ĤG�欰�����A�Q��J�����e����A�� ���J�A�Q�n������N���ƥ�)
 * Date: 2016/12/12
 * Author: 105021007 ���Q�w
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�@�q��r");
		String n=scn.nextLine();
		System.out.print("�п�J�n���᪺�Ʀr");
		int x=scn.nextInt();
		char data[]=n.toCharArray();
		char data2[] = null;
		for(int i=0;i<data.length;i++){
		char n1=(char)((int)data[i]+x);
		if(n1=='{'){
		n1='a';	
		}else{
		if(n1=='['){
		n1='b';	
		}
		if(n1=='"'){
		n1=' ';	
		}
		}
		System.out.print(n1);
		}

			}

		}