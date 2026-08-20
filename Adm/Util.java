package Adm;

import java.util.List;

public class Util {
    public Util() {
    }

    public static <T> T primeiro(List<T> var0) {
        return (T)(var0.isEmpty() ? null : var0.get(0));
    }
}