package com.saki.linkedin.oop;

public class CallByValueAndModifyingObjects {

    public static void main(String[] args) {

        var modifier = new ValueModifier();
        int value = 42;

        modifier.increase(value);
        System.out.println(value);
    }

    static class ValueModifier {
        void increase(int value) {
            value = value + 1;
        }
    }

    static class ValueWrapper {
        public int value;

        public ValueWrapper(int value){
            this.value = value;
        }
    }

}
