package com.zjm.utils;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtils {
    public static void closeAll(AutoCloseable ... closeables){
        for (AutoCloseable c : closeables){
            try {
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
