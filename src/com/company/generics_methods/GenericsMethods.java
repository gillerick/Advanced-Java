package com.company.generics_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethods {
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for (T object : array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(intList.get(0)); //Returns 1
        System.out.println(boolList.get(1)); //Returns false
        System.out.println(characterList.get(2)); //Returns l
    }
}
