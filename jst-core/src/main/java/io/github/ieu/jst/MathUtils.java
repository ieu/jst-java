package io.github.ieu.jst;

public final class MathUtils {
    private MathUtils() {}

    public static int clamp(int val, int min, int max) {
        if (val < min) {
            return min;
        } else if (val > max) {
            return max;
        } else {
            return val;
        }
    }
}
