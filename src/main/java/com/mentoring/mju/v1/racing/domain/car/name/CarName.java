package com.mentoring.mju.v1.racing.domain.car.name;


import com.mentoring.mju.v1.racing.domain.car.Car;
import com.mentoring.mju.v1.racing.view.InputView;

public class CarName implements CarNameRepository{
    private String car1;


    @Override //저장한 자동차 데이터 배열 정의
    public void save(Car carName){
        InputView CarNameInput;
        for (int i = 0; i<10;) {
            car1= InputView.carNamesArray[i];
            i++;
        }
    }

    public static void main(String[] args) {

    }


}
