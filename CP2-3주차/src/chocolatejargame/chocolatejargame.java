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
		System.out.println("게임을 시작합니다.");
		System.out.println("항아리에는 14개의 아이템이 있습니다.");
		System.out.println(ChocolateJar.status());
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다.");
		System.out.println("시작!!");
		while (true) {
			int take = random.nextInt(1000)%maxtake%3 + 1;
			System.out.println("+----- "+i+"번째 턴! -----+");
			System.out.print("몇 개를 뽑을까요?(1~3)");
			int a = sc.nextInt();
			System.out.println("플레이어는 "+a+"개의 초콜릿을 꺼냈습니다.");
			ChocolateJar.takeItem(a);
			System.out.println(ChocolateJar.status());
			if (ChocolateJar.getChocolate() < 1) {
				System.out.println("플레이어 승리!");
				break;
			}
			System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
			ChocolateJar.takeItem(take);
			System.out.println(ChocolateJar.status());
			if (ChocolateJar.getChocolate() < 1) {
				System.out.println("컴퓨터 승리!");
				break;
			}
			i++;
		}
}
}
