package com.mentoring.mju.v1.racing.domain.car;

import java.util.List;
import java.util.Random;

public class Cars{
    private final List<Car> cars;
    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }



}
