package com.rosyidgrobogan.fullstackspringbootreact.student.helpers;

//import static org.junit.jupiter.api.Assertions.*;
import static  org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EmailValidatorTest {

    private final EmailValidator underTest = new EmailValidator();

    @Test
    void itShouldValidateCorrectEmail() {
        assertThat(underTest.test("hello@gmail.com")).isTrue();
    }

    @Test
    void itShouldValidateAnInCorrectEmail() {
        assertThat(underTest.test("hellogmail.com")).isFalse();
    }

    @Test
    void itShouldValidateAnInCorrectEmailWithoutDotAtTheEnd() {
        assertThat(underTest.test("hello@gmailcom")).isFalse();
    }
}