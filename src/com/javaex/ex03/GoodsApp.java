package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		
		//	리스트 선언
		List<Goods> goodsList = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		int countOfGoods =0;	// 입력 개수 변수
		System.out.println("상품을 입력해주세요(종료 q)");
		
		while (true) {
			String input = sc.nextLine();	//	한 줄 입력

			if (input.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("==================");
				break;
			}
			// 상품명(String), 가격(int), 개수(int)
			// 입력 값을 콤마(,)로 분리하여 배열에 저장
            String[] data = input.split(",");
            
            // 배열의 각 요소를 변수에 저장
            String name = data[0].trim(); // 앞뒤 공백 제거
            int price = Integer.parseInt(data[1].trim()); // 앞뒤 공백 제거 후 정수형으로 변환
            int count = Integer.parseInt(data[2].trim()); // 앞뒤 공백 제거 후 정수형으로 변환
            
            // Goods 객체 생성
			Goods goods = new Goods(name, price, count);
			
			// 리스트에 저장
			goodsList.add(goods);
		}
		
		//	결과 출력(상품 리스트 전부 출력, 상품의 개수를 집계하여 출력)
		//	상품 리스트
		Iterator<Goods> it = goodsList.iterator();
		while (it.hasNext()) {
			Goods item = it.next();
			countOfGoods += item.getCount();	//	상품 개수 합산
			item.showInfo();
		}
		
		System.out.println("모든 상품의 개수는" + countOfGoods + "입니다.");
		sc.close();
		
//		for (Goods goods : goodsList) {
//			System.out.println(goods);
//		}

	}

}
