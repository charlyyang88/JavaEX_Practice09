package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

//		ArrayList<Friend> friendList = new ArrayList<Friend>();
		List<Friend> friendList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
//			String name = sc.next();
//			String hp = sc.next();
//			String school = sc.next();
			String line = sc.nextLine(); // 한 줄 입력
			String[] data = line.split(" "); // 공백으로 분할

			// Friend 객체 생성
//			Friend friend = new Friend(name, hp, school);
			Friend friend = new Friend(data[0], data[1], data[2]);

			// 리스트에 추가
			friendList.add(friend);
		}

		sc.close();

		// 친구 정보 출력
//		for (Friend friend : friendList) {
//			System.out.println(friend);
//		}
		Iterator<Friend> it = friendList.iterator();
		while (it.hasNext()) {
			Friend item = it.next();
			item.showInfo();
		}

	}

}
