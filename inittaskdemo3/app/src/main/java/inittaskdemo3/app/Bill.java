package inittaskdemo3.app;

import java.util.Date;

public class Bill {
    //name1有无时令转换 name2通话开始的时令
    //StartTime起始时间 EndTime结束时间
    public double get_time(String name1, String name2, Date StartTime, Date EndTime) {
        //nm表示一分钟的毫秒数
        double nm = 1000 * 60;
        long diff;
        //通话时间
        double min;
        //返回自1970年1月1日以来，以此日期为准的00:00:00 GMT的毫秒数
        long e = EndTime.getTime();
        long s = StartTime.getTime();
        double sum = 0;

        if (name1.equals("有")) {
            //通话时时令由冬时令转化为夏时令
            if (name2.equals("冬时令")) {
                e -= nm * 60;
            }
            //通话时时令由夏时令转化为冬时令
            else if (name2.equals("夏时令")) {
                e += nm * 60;
            }
        }

        //计算通话时间
        if (e < s) {
            min = -1;
        } else {
            diff = e - s;
            min = diff / nm;
        }

        //对一个数进行上舍入
        min = Math.ceil(min);
        if (min == -1) {
            return min;
        } else if (min <= 20) {
            sum = min * 0.05;
        } else {
            sum = 1 + (min - 20) * 0.1;
        }
        String  str = String.format("%.2f", sum);
        sum = Double.parseDouble(str);
        return sum;
    }
}
