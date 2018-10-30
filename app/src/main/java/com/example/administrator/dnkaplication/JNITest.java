package com.example.administrator.dnkaplication;

public class JNITest {
    static {
        System.loadLibrary("JniTest");
    }
    public native String getStringNative();
}
