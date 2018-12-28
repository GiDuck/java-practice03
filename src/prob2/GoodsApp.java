package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Goods[] goodsArr = new Goods[COUNT_GOODS];
		
		
		for(int i=0; i<COUNT_GOODS; ++i) {
			
			System.out.println("제품과 가격을 입력하세요.. 제품과 가격 사이에는 스페이스바로 분리합니다.");
			String input = sc.nextLine();
			String inputToken[] = input.split(" ");
			goodsArr[i] = new Goods(inputToken[0], Integer.parseInt(inputToken[1]));
		
		}
		
		
		System.out.println();
		
		
		for(Goods good : goodsArr) {
			
			good.show();
			
		}
		
		
	}
}
