package com.javacurse.ce.JavaDevelopmentKit.JavaDevelopmentKitSeminar.Seminar4;


import java.util.ArrayList;
import java.util.List;



/*Создать справочник сотрудников
        Необходимо:
        Создать класс справочник сотрудников, который содержит внутри
        коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
        Табельный номер
        Номер телефона
        Имя
        Стаж
        Добавить метод, который ищет сотрудника по стажу (может быть список)
        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
        Добавить метод, который ищет сотрудника по табельному номеру
        Добавить метод добавление нового сотрудника в справочник*/
public class Employee {

    public int tabNumber;
    public int telephone;
    public String name;
    public int experience;

    @Override
    public String toString() {
        return "Сотрудник : " +
                "Табель -" + tabNumber +
                ", Телефон -" + telephone +
                ", Имя '" + name + '\'' +
                ", Стаж- " + experience +
                '}';
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Employee(int tabNumber, int telephone, String name, int experience) {
        this.tabNumber = tabNumber;
        this.telephone = telephone;
        this.name = name;
        this.experience = experience;



    }
}






