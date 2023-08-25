package com.boot.javaPrograms.service;

import java.util.List;

public interface Numbers {

    List getAllNumbers(int limit);

    List getWholeNumbers(int limit);

    List<Integer> getEvenNumbers(int limit);

    List<Integer> getOddNumbers(int limit);
}
