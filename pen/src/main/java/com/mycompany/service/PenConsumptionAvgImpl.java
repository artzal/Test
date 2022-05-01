package com.mycompany.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.model.PenConsumption;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс для вычисления о расходах ручек
 *
 * @author arzal
 */
public class PenConsumptionAvgImpl implements PenConsumptionAvg {
    /**
     * Поле хранет информацию о расходах ручек
     */
    private List<PenConsumption> penCons;

    /**
     * Конструктор
     */
    public PenConsumptionAvgImpl(List<PenConsumption> penCons) {
        this.penCons = penCons.stream().map(PenConsumption::clone).collect(Collectors.toList());
    }

    /**
     * Функция возвращает список о расходах ручек
     */
    public List<PenConsumption> getPenConsumption() {
        return penCons;
    }

    /**
     * Функция для расчета превышиение среднего раскхода
     *
     * @return возвращает список с
     */
    public List<PenConsumption> getAVGConsumption() {
        Map<String, Integer> avgUsePenDepartment = avgUsePen();
        List<PenConsumption> groupPenCons = penCons.stream().map(PenConsumption::clone).collect(Collectors.toList());

        groupPenCons.forEach(
                p -> {
                    p.setCountUsePen(p.getCountUsePen() - avgUsePenDepartment.get(p.getDepartment()));
                }
        );

        return groupPenCons;
    }

    /**
     * Функция для расчета среднего по всем департаментам
     *
     * @return возвращает среднее значение
     */
    private Map<String, Integer> avgUsePen() {
        Map<String, Integer> avg = new HashMap<>();
        Set<String> department = penCons.stream().map(p -> p.getDepartment()).collect(Collectors.toSet());
        for (String d : department) {
            List<Integer> list = penCons.stream().filter(p -> p.getDepartment().equals(d)).map(p -> p.getCountUsePen()).collect(Collectors.toList());
            float avgDepartment = list.size() > 0 ? (list.stream().reduce((x, y) -> x + y).get() / (float) list.size()) : 0;
            avg.put(d, Math.round(avgDepartment));
        }

        return avg;
    }

}
