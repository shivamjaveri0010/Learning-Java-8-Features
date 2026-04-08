package org.example;

import java.util.Arrays;
import java.util.List;

public class Method_Reference {

    public static void main(String[] args) {
        Method_Reference obj = new Method_Reference();
        List<String> friends = Arrays.asList("Shivam", "Akash", "Aryan", "Kaustubh");
        friends.forEach(obj::print);
    }
    
    public void print(String s) {
        System.out.println(s);
    }
}
