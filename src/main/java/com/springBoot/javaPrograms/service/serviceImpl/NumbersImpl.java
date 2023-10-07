package com.springBoot.javaPrograms.service.serviceImpl;

import com.springBoot.javaPrograms.service.Numbers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NumbersImpl implements Numbers {
    @Override
    public List<Number> getAllNumbers(int id) {
        List<Number> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
        for(int i=0;i<id;i++){
            numbers.add(i);
        }
        System.out.print(numbers);
        return numbers;
    }

    @Override
    public List getWholeNumbers(int limit) {
        List<Number> wholeNumbers = new ArrayList<>();
        for(int i=0;i<limit;i++){
            wholeNumbers.add(i);
        }
        return wholeNumbers;
    }

    @Override
    public List<Integer> getEvenNumbers(int limit) {
        List<Integer> evenNumbers = new ArrayList<>();
        for(int i=2;i<limit;i+=2){
            evenNumbers.add(i);
        }
        return evenNumbers;
    }

    @Override
    public List<Integer> getOddNumbers(int limit) {
        List<Integer> oddNumbers = new ArrayList<>();
//        oddNumbers.stream().filter(0).map(p->p*2).collect(Collectors.toList());
        return oddNumbers;
    }
}
