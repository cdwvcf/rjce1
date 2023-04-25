package inittaskdemo3.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillTest1 {
    public Date StrToDate(String str) {
        //SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = null;
        //当try语句中出现异常时，会执行catch 中的语句
        try {
            //parse()将字符串转换为日期类型，以进行后续操作
            date = format.parse(str);
        } catch (ParseException e) {
            //printStackTrace()：在命令行打印异常信息在程序中出错的位置及原因
            e.printStackTrace();
        }
        return date;
    }

    @DisplayName(value="等价类划分")
    @ParameterizedTest
    @CsvFileSource(resources = "/Bill1.csv",numLinesToSkip =1,encoding = "GB2312")
    void parameters_error_test(String a,String e,String b, String c,double d, String remark) {
        Bill bill = new Bill();
        Date st=StrToDate(b);
        Date et=StrToDate(c);
        double fee=bill.get_time(a,e,st,et);
        assertEquals(d, fee);
    }
}