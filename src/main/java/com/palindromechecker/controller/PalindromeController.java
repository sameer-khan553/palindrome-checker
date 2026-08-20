package com.palindromechecker.controller;

import com.palindromechecker.dto.PalindromeResponse;
import com.palindromechecker.service.PalindromeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/palindrome")
public class PalindromeController {

    private final PalindromeService palindromeService;

    public PalindromeController(
            PalindromeService palindromeService) {

        this.palindromeService = palindromeService;
    }

    @GetMapping("/{input}")
    public PalindromeResponse checkPalindrome(
            @PathVariable String input) {

        return palindromeService.checkPalindrome(input);
    }
}