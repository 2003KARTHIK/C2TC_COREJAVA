//Program to define generic functional interface Palindrome

package com.tnsif.daynineteen;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
