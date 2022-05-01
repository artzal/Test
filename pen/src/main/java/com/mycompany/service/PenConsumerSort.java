package com.mycompany.service;

import com.mycompany.model.PenConsumption;

import java.util.List;

/**
 * Интерфейс для сортировки о расходах ручек
 *
 * @author arzal
 */
public interface PenConsumerSort {

    /**
     * Функция возвращает сортированный список по Департаменту и ФИО
     */
    List<PenConsumption> sortByDepartmentAndFIO(List<PenConsumption> list);
}
