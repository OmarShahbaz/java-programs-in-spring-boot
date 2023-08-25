package com.boot.javaPrograms.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.boot.javaPrograms.service.TempConverter;
@Service
public class TempConverterImpl implements TempConverter {
    @Override
    public double fahrenheitToCentigrade(int fahrenheit) {
        double centigrade = fahrenheit * 1.8000 - 32;
        return centigrade;
    }

    @Override
    public double CentigradeToFahrenheit(double centigrade) {
        double fahrenheit = centigrade * (9/5) +32;
        return fahrenheit;
    }
}
