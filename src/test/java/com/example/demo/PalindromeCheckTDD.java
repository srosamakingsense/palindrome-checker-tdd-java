package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PalindromeCheckTDD {

    @Test
    void palindrome_check_case_1() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("mom"));
    }

    /*@Test
    void palindrome_check_case_2() {
        Assertions.assertFalse(PalindromeChecker.isPalindrome("bill"));
    }*/

    /*@Test
    void palindrome_check_case_3() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("radar"));
    }*/

    /*@Test
    void palindrome_check_case_4() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Mom"));
    }*/

    /*@Test
    void palindrome_check_case_5() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Was It A Rat I Saw"));
    }*/

}
