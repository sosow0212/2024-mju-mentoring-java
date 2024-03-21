package com.mentoring.mju.v1.racing.domain.car;

import java.util.Random;

public class CarRandomNumber implements CarRandomNumberRepository {
    @Override
    public CarRandomNumberRepository RandomNumberGo(){
        //무작위 숫자 뽑기
        Random random = new Random();
        int randomNumber =random.nextInt(0, 9);
        return null;
    }



}
