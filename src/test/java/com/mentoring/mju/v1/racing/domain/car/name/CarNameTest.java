package com.mentoring.mju.v1.racing.domain.car.name;

import com.mentoring.mju.v1.racing.domain.car.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {
    @Test //테스트 통과
    @DisplayName("자동차이름테스트")
    void 자동차_이름_테스트(){
        CarName carName = new CarName();
        String carDataArray="cda, dadd,ddda";
        System.out.println(carDataArray);
    }
}