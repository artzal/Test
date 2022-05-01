/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.service.PenConsumptionAvgImpl;
import com.mycompany.model.PenConsumption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.*;

/**
 *
 * @author arzal
 */
public class PenConsumptionAvgTest {
    private static List<PenConsumption> data;

    @BeforeAll
    static void setup(){
        data = dataGenerator();
    }

    /**
     * Тест превышиения среднего раскхода
     */
    @Test
    public void testGetAVGConsumption() {
        System.out.println("getAVGConsumption");
        
        List<PenConsumption> expResult = new ArrayList<>(Arrays.asList(
                new PenConsumption("Иванов И.И", "Отдел изучения", -1),
                new PenConsumption("Петров П.П.", "Отдел поиска", -3),
                new PenConsumption("Сидоров С.С.", "Отдел снабжения", 0),
                new PenConsumption("Васечкин В.В.", "Отдел поиска", 6),
                new PenConsumption("Иванова А.И.", "Отдел поиска", 0),
                new PenConsumption("Петров Д.П.", "Отдел изучения", 1),
                new PenConsumption("Иванов И.И.", "Отдел поиска", -4)
        ));

        PenConsumptionAvgImpl pcr = new PenConsumptionAvgImpl(data);

        List<PenConsumption> result = pcr.getAVGConsumption();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * генератор данных
     */
    private static List<PenConsumption> dataGenerator(){
        return new ArrayList<>(Arrays.asList(
                new PenConsumption("Иванов И.И", "Отдел изучения", 2),
                new PenConsumption("Петров П.П.", "Отдел поиска", 8),
                new PenConsumption("Сидоров С.С.", "Отдел снабжения", 5),
                new PenConsumption("Васечкин В.В.", "Отдел поиска", 17),
                new PenConsumption("Иванова А.И.", "Отдел поиска", 11),
                new PenConsumption("Петров Д.П.", "Отдел изучения", 4),
                new PenConsumption("Иванов И.И.", "Отдел поиска", 7)
        ));
    }
    
}
