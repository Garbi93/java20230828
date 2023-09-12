package Algorithms.test;

import java.util.Stack;

public class Solution844 {  // 09/12
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i =0; i < s.length(); i++) {

            if(s.charAt(i) == '#') {
                if(stack1.size()> 0) {
                    stack1.pop();
                }
            }else{
                stack1.push(s.charAt(i));
            }
        }
        for (int i =0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(stack2.size()>0){
                    stack2.pop();
                }

            }else{
                stack2.push(t.charAt(i));
            }
        }

        return stack1.equals(stack2);
    }
}

/*  // 선생님이 풀어주신 부분
public class Solutioin844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stack1.size() > 0) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (stack2.size() > 0) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }

        if (stack1.size() != stack2.size()) {
            return false;
        }

        while (stack1.size() > 0) {
            Character char1 = stack1.pop();
            Character char2 = stack2.pop();

            if (!char1.equals(char2)) {
                return false;
            }
        }

        return true;
    }
}
