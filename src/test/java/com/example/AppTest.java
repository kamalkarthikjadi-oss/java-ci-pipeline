package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest 
{
    @Test
    public void testAdd() {
        assertEquals(10, App.add(5, 3));
    }
}