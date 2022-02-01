package com.example.enviromenttest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prueba1 {

    private int age;
    private String name;

    public Prueba1(final int age, final String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /* Imprimir jugadores agrupados por edad, no importa el orden */

    public static void printPersons(final List<Prueba1> personList) {

        List<Prueba1> list = personList.stream().sorted(Comparator.comparing(Prueba1::getName)).collect(Collectors.toList());

        Map<Integer, List<Prueba1>> listOrder = list.stream()
                .collect(Collectors.groupingBy(Prueba1::getAge));

        System.out.println(listOrder);
    }

    public static void main(final String[] args) {
        final List<Prueba1> nationalTeam = new ArrayList<>();
        nationalTeam.add(new Prueba1(37, "Claudio Bravo"));
        nationalTeam.add(new Prueba1(36, "Jean Beausejour"));
        nationalTeam.add(new Prueba1(34, "Gonzalo Jara"));
        nationalTeam.add(new Prueba1(33, "Gary Medel"));
        nationalTeam.add(new Prueba1(32, "Mauricio Isla"));
        nationalTeam.add(new Prueba1(31, "Charles Aránguiz"));
        nationalTeam.add(new Prueba1(33, "Arturo Vidal"));
        nationalTeam.add(new Prueba1(34, "Matias Fernandez"));
        nationalTeam.add(new Prueba1(36, "Jorge Valdivia"));
        nationalTeam.add(new Prueba1(31, "Alexis Sánchez"));
        nationalTeam.add(new Prueba1(30, "Eduardo Vargas"));
        Prueba1.printPersons(nationalTeam);
    }
}
