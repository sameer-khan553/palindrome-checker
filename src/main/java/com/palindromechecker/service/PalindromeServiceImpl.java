package com.palindromechecker.service;


import com.palindromechecker.dto.PalindromeResponse;
import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImpl implements PalindromeService {

        @Override
        public PalindromeResponse checkPalindrome(String input) {

            if (input == null || input.isBlank()) {
                throw new IllegalArgumentException(
                        "Input cannot be empty"
                );
            }

            String original = input.trim();

            /*
             * Remove spaces and special characters
             * and convert everything to lowercase.
             *
             * Example:
             *
             * "A man, a plan, a canal: Panama"
             *
             * becomes:
             *
             * "amanaplanacanalpanama"
             */
            String cleanedInput = original
                    .replaceAll("[^a-zA-Z0-9]", "")
                    .toLowerCase();

            String reversed = new StringBuilder(cleanedInput)
                    .reverse()
                    .toString();

            boolean palindrome =
                    cleanedInput.equals(reversed);

            String message = palindrome
                    ? "It is a palindrome"
                    : "It is not a palindrome";

            return new PalindromeResponse(
                    original,
                    reversed,
                    cleanedInput.length(),
                    palindrome,
                    message
            );
        }
    }
