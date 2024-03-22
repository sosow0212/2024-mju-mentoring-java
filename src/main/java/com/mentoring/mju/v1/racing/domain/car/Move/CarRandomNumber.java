package com.mentoring.mju.v1.racing.domain.car.Move;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.mentoring.mju.v1.racing.domain.car.Car;

import java.util.Random;

public class CarRandomNumber implements CarRandomNumberRepository {
    @Override
    public void saveNumber(CarRandomNumber randomNumber){
        //무작위 숫자 뽑기
        Random random = new Random();
        int randomNumberStore =random.nextInt(0, 9);
        if (randomNumberStore>3){
        }
        System.out.println("-");// 나중에 수정
    }
}
