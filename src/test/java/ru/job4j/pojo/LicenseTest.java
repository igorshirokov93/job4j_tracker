package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqOwner() {
        License first = new License();
        first.setOwner("Igor Shirokov");
        License second = new License();
        second.setOwner("Igor Shirokov");
        assertThat(first, is(second));
    }
}