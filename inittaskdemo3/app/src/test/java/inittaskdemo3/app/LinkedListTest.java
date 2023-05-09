package inittaskdemo3.app;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    @DisplayName("remove的元素为null并且list为{}")
    void remove_find_null1() {
        List<String> list = new LinkedList<>();

        list.remove(null);

        assertEquals(0,list.size());
    }

    @Test
    @DisplayName("remove的元素为null并且list为{null}")
    void remove_find_null2() {
        List<String> list = new LinkedList<>();
        list.add(null);

        list.remove(null);

        assertEquals(0,list.size());
    }

    @Test
    @DisplayName("remove的元素为null并且list为{a,null}")
    void remove_find_null3() {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add(null);

        list.remove(null);

        assertEquals(1,list.size());
    }

    @Test
    @DisplayName("remove的元素为null并且list为{a,b}")
    void remove_find_null4() {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");

        list.remove(null);

        assertEquals(2,list.size());
    }
    @Test
    @DisplayName("remove的元素为a并且list为{}")
    void remove_find_a1() {
        List<String> list = new LinkedList<>();

        list.remove("a");

        assertEquals(0,list.size());
    }
    @Test
    @DisplayName("remove的元素为a并且list为{a}")
    void remove_find_a2() {
        List<String> list = new LinkedList<>();
        list.add("a");

        list.remove("a");

        assertEquals(0,list.size());
    }
    @Test
    @DisplayName("remove的元素为a并且list为{a,b}")
    void remove_find_a3() {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");

        list.remove("a");

        assertEquals(1,list.size());
    }
    @Test
    @DisplayName("remove的元素为a并且list为{b,c}")
    void remove_find_a4() {
        List<String> list = new LinkedList<>();
        list.add("b");
        list.add("c");

        list.remove("a");

        assertEquals(2,list.size());
    }
}
