package com.saki.java.chapter08.exception;

public class NotCloseable implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("close() mag ich nicht");
    }
}