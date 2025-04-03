package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setup() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // To verify that elements are added correctly
    @Test
    public void shouldAddElementToTheList() {
        listManager.addElement(list, 1);
        listManager.addElement(list, 3);
        listManager.addElement(list, 5);

        Assertions.assertEquals(3, list.size());
        Assertions.assertTrue(list.contains(1));
        Assertions.assertFalse(list.contains(2));
    }

    // To verify that elements are removed correctly
    @Test
    public void shouldRemoveElementFromTheList() {
        listManager.addElement(list, 2);
        listManager.addElement(list, 4);
        listManager.addElement(list, 6);

        listManager.removeElement(list, 1);

        Assertions.assertEquals(2, list.size());
        Assertions.assertFalse(list.contains(4));
    }

    // To verify that the size of the list is updated correctly
    @Test
    public void shouldReturnSizeOfTheList() {
        listManager.addElement(list, 2);
        listManager.addElement(list, 4);
        listManager.addElement(list, 6);

        int size = listManager.getSize(list);
        Assertions.assertEquals(3, size);
    }
}