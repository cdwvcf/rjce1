package inittaskdemo3.app;

public class Triangle {

    //定义一个常量
    public static final Integer V1 = 100;
    /**
     * description:
     * @param:  * @param a
     * @param b
     * @param c
     * @return: java.lang.String
     */

    public String classify(int  a, int b, int c) {
        long n;
        if (a < 1 || a >  V1 || b < 1 || b >  V1 || c < 1 || c >  V1) {
            return "输入错误";
        }
        if (!((a + b > c) && (a + c > b) && (b + c > a))) {
            return "非三角形";
        } else if (a == b && a == c && b == c) {
            return "等边三角形";
        } else if (a != b && a != c && b != c) {
            return "不等边三角形";
        } else {
            return "等腰三角形";
        }
    }


}
