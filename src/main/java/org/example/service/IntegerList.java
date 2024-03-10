package org.example.service;

import org.example.exception.OutOfBoundException;
import org.example.service.IntegerListImpl;

public interface IntegerList {


    Integer add(Integer item);


    Integer add(int index, Integer item);


    Integer set(int index, Integer item) throws OutOfBoundException;


    Integer remove(Integer item);


    Integer remove(int index);


    boolean contains(Integer item);


    int indexOf(Integer item);


    int lastIndexOf(Integer item);


    Integer get(int index);


    boolean equals(IntegerListImpl otherList);


    int size();


    boolean isEmpty();


    void clear();


    Integer[] toArray();
}
