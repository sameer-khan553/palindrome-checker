package com.palindromechecker.dto;

public class PalindromeResponse {

    private String input;
    private String reversed;
    private int characterCount;
    private boolean palindrome;
    private String message;

    public PalindromeResponse() {
    }

    public PalindromeResponse(
            String input,
            String reversed,
            int characterCount,
            boolean palindrome,
            String message) {

        this.input = input;
        this.reversed = reversed;
        this.characterCount = characterCount;
        this.palindrome = palindrome;
        this.message = message;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getReversed() {
        return reversed;
    }

    public void setReversed(String reversed) {
        this.reversed = reversed;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(int characterCount) {
        this.characterCount = characterCount;
    }

    public boolean isPalindrome() {
        return palindrome;
    }

    public void setPalindrome(boolean palindrome) {
        this.palindrome = palindrome;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}