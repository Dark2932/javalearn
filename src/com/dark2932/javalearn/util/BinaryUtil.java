package com.dark2932.javalearn.util;

public class BinaryUtil {

    public static double fromBinToDec(double bin) {
        return Math.pow(2, Math.log10(bin));
    }

    public static double fromHexToDec(double hex) {
        return Math.pow(16, Math.log10(hex));
    }

}
