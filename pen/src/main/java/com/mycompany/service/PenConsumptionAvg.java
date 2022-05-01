package com.mycompany.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.model.PenConsumption;

import java.util.List;

/**
 * Интерфейс для вычисления о расходах ручек
 *
 * @author arzal
 */
public interface PenConsumptionAvg {

    /**
     * Функция возвращает список о расходах ручек
     */
    List<PenConsumption> getPenConsumption();

    /**
     * Функция для расчета превышиение среднего раскхода
     *
     * @return возвращает список с
     */
    List<PenConsumption> getAVGConsumption();

}
