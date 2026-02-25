package com.saki.linkedin.advancedjava.generics.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericStack<T> {
    // class GenericStack<T> for stack-memory

    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public Optional<T> pop() {
        if(stack.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(stack.removeLast());
    }

    public Optional<T> peek() {
        if(stack.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(stack.getLast());
    }

    public void push(T item) {
        stack.add(item);
    }

    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println(stringStack.peek());

        System.out.println(stringStack.pop());
        stringStack.push("Tiger");
        System.out.println(stringStack.peek());
        stringStack.peek().ifPresent(System.out::println);
        stringStack.pop().ifPresent(System.out::println);
        stringStack.pop().ifPresent(System.out::println);
        stringStack.peek().ifPresent(System.out::println);
        stringStack.pop().ifPresent(System.out::println);
        stringStack.peek().ifPresent(System.out::println);

    }

    // methods push(T ement) puts an object to the stack,
    // use Optional as Return-Type for: pop() deletes the last object, peek() returns the last object
    // Collection for storage
    // use all of them in main



}
