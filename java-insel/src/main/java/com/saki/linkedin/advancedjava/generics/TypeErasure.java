package com.saki.linkedin.advancedjava.generics;

public class TypeErasure {

    static class Box<T> {

        private T content;

        public Box(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "content=" + content +
                    '}';
        }
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(123);
        Box<String> stringBox = new Box<>("Hello");

        if(integerBox.getClass().equals(stringBox.getClass())) {
            System.out.println("Both Boxes are the same");
        } else {
            System.out.println("Both Boxes are not the same");
        }

        System.out.println(integerBox.getClass().getName());
    }
}
