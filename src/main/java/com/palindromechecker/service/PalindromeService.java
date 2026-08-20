package com.palindromechecker.service;


import com.palindromechecker.dto.PalindromeResponse;

public interface PalindromeService {

    PalindromeResponse checkPalindrome(String input);
}
