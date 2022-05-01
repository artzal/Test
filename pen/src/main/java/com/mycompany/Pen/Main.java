/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Pen;

import com.mycompany.model.PenConsumption;
import com.mycompany.service.PenConsumerSort;
import com.mycompany.service.PenConsumerSortImpl;
import com.mycompany.service.PenConsumptionAvg;
import com.mycompany.service.PenConsumptionAvgImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс для main
 * @author arzal
 */
public class Main  {
    private static final Logger log = LogManager.getLogger(Main.class);

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

    public static void main(String[] args) {
        try{
            List<PenConsumption> data = dataGenerator();

            PenConsumptionAvg pcr = new PenConsumptionAvgImpl(data);
            PenConsumerSort penConsumerSort = new PenConsumerSortImpl();

            log.info(penConsumerSort.sortByDepartmentAndFIO(pcr.getAVGConsumption()));
        }
        catch(Exception e){
            log.info("error",e);
        }
    }
}
