package DataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testingTest() {
        LinkedList testList = new LinkedList();
        assertEquals("Should return string with NULL", "NULL", testList.toString());
        System.out.println(testList);

        testList.insert(2);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);

        System.out.println(testList);
        assertEquals("Should return string representing all nodes", "{5} -> {5} -> {5} -> {2} -> NULL", testList.toString());

        assertTrue("Should return true", testList.includes(5));
        assertFalse("Should return false", testList.includes(3));
        assertFalse("should be false", testList.includes(0));

    }
}
