package com.mycompany.service;

import com.mycompany.model.PenConsumption;

import java.util.Collections;
import java.util.List;

/**
 * Класс для сортировки о расходах ручек
 *
 * @author arzal
 */
public class PenConsumerSortImpl implements PenConsumerSort {

    /**
     * Функция возвращает сортированный список по Департаменту и ФИО
     */
    public List<PenConsumption> sortByDepartmentAndFIO(List<PenConsumption> list){
        Collections.sort(list, (one, other) -> {
            int result = one.getDepartment().toString().compareTo(other.getDepartment().toString());
            if(result==0)
                result = one.getFIO().toString().compareTo(other.getFIO().toString()) ;
            return result;
        });

        return list;
    }

}
