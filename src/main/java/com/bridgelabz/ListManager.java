package com.bridgelabz;

import java.util.List;

public class ListManager {
    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove an element from the list
    public void removeElement(List<Integer> list, int index) {
        list.remove(index);
    }

    // Method to return the size of the list
    public int getSize(List<Integer> list) {
       return list.size();
    }
}