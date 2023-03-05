package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class InitialsTest {
    @Test
    public void test() {
        assertEquals("������ �.�.", Initials.convert(new String[] {"������", "����", "������"}));
        assertEquals("��������� �.�.", Initials.convert(new String[] {"���������", "�����", "����������"}));
    }
}