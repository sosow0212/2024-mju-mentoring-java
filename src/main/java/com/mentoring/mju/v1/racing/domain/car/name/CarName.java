package com.mentoring.mju.v1.racing.domain.car.name;


import com.mentoring.mju.v1.racing.domain.car.Car;
import com.mentoring.mju.v1.racing.view.InputView;

public class CarName implements CarNameRepository {
    private String car1;
    private String[] carDataArray = new String[5];

    @Override //저장한 자동차 데이터 배열 정의
    public void save(Car carName) {
        InputView CarNameInput;
        for (int i = 0; i < 5; ) {
            carDataArray[i] = InputView.carNamesArray[i];
            i++;
        }
    }
    public void printCarData() {
        String car1 = ""; // car1 변수 초기화
        for (String car : carDataArray) {
            car1 += car + " "; // 배열에 저장된 자동차 데이터를 car1 변수에 추가
        }
        System.out.println(car1.trim()); // car1 변수 출력 (앞뒤 공백 제거)
    }
}
