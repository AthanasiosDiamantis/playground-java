package com.saki.javainsel15.chapter08.exception;

public class NotCloseable implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("close() mag ich nicht");
    }
}