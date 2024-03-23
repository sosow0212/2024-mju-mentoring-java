package com.mentoring.mju.v1.racing.view;

import com.mentoring.mju.v1.racing.domain.car.Move.CarRandomNumber;

import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);
    public static String[] carNamesArray;


    private int chance;

    public int getChance() {
        System.out.println("시도할 횟수는 몇회 인가요?");
        int chance = input.nextInt();

        for (int i = 0; i < chance; i++) {
            System.out.println("-"); // 예시로 현재 이동 횟수 출력
        }
        return chance;
    }

    public static InputView CarNameInput() { // 자동차 이름을 받기 구현
        int maxLength = 5;
        System.out.println("경주할 자동차 이름을 입력하세요:(이름은 , (쉼표)를 기준으로 구분");
        String carsName = input.nextLine(); //carsName이라는 곳에 자동차 이름 입력완료
        carNamesArray = carsName.split(","); // 쉼표 기준으로 구분하기
        if (carsName.length() > maxLength) { //글자수 제한걸기
            return null;
        }
        return new InputView();
    }


}
