package chocolatejargame;

import java.util.Random;
import java.util.Scanner;

public class chocolatejargame {

	
	Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		ChocolateJar ChocolateJar = new ChocolateJar();
		int maxtake = Math.min(3,  ChocolateJar.getItem()-1);
		System.out.println("������ �����մϴ�.");
		System.out.println("�׾Ƹ����� 14���� �������� �ֽ��ϴ�.");
		System.out.println(ChocolateJar.status());
		System.out.println("1~3���� �������� ���� �� ������ ĥ���� ������ �й��մϴ�.");
		System.out.println("����!!");
		while (true) {
			int take = random.nextInt(1000)%maxtake%3 + 1;
			System.out.println("+----- "+i+"��° ��! -----+");
			System.out.print("�� ���� �������?(1~3)");
			int a = sc.nextInt();
			System.out.println("�÷��̾�� "+a+"���� ���ݸ��� ���½��ϴ�.");
			ChocolateJar.takeItem(a);
			System.out.println(ChocolateJar.status());
			if (ChocolateJar.getChocolate() < 1) {
				System.out.println("�÷��̾� �¸�!");
				break;
			}
			System.out.println("��ǻ�ʹ� "+take+"���� ���ݸ��� ���½��ϴ�.");
			ChocolateJar.takeItem(take);
			System.out.println(ChocolateJar.status());
			if (ChocolateJar.getChocolate() < 1) {
				System.out.println("��ǻ�� �¸�!");
				break;
			}
			i++;
		}
}
}
