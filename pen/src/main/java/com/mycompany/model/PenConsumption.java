/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс для хренния данными о расходах ручки одним сотрудником
 *
 * @author arzal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PenConsumption implements Cloneable{
    /**
     * ФИО
     */
    private String FIO;
    /**
     * Отдел
     */
    private String department;
    /**
     * Количество ручек
     */
    private int countUsePen;

    @Override
    public PenConsumption clone() {
        return new PenConsumption(FIO, department, countUsePen);
    }

    @Override
    public String toString() {
        return "FIO: " + FIO + " department:" + department + " count_use_pen:" + countUsePen;
    }
}
