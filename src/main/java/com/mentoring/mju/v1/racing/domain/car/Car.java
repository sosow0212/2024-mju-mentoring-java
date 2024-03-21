package com.mentoring.mju.v1.racing.domain;

//domain 패키지에는 일단 MVC 모델중 Model 형식으로 작성하는 것을 기억하고 해보자


import java.util.Scanner;

public class Car {

    private final String CarName;

    public Car(String carName) {
        CarName = carName;
    }

    public String getCarName() {
        return CarName;
    }
}

