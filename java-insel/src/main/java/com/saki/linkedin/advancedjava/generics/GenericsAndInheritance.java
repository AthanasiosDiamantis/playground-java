package com.saki.linkedin.advancedjava.generics;

public class GenericsAndInheritance {

    static class Box<T> {

        private T content;

        public Box(T content){
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

    static class ColoredBox<T> extends Box<T> {

        private String color;

        public ColoredBox(T content, String color) {
            super(content);
            this.color = color;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "ColoredBox{" +
                    "color='" + color + '\'' +
                    ", content=" + getContent() +
                    '}';
        }
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box(123);

        System.out.println(box);

        ColoredBox<String> coloredBox = new ColoredBox<>("Hello Generics", "blue");
        System.out.println(coloredBox);
    }
}
