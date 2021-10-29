package 基础知识.案例.红包案例2.Red;

import java.util.ArrayList;

public interface OpenMode {
    /**
     * 请将totalMoney分成count份，保存到ArrayList<Integer>中，返回即可。
     *
     * @param totalMoney             总金额为方便计算，已经转换为整数，单位为分。
     * @param totalCount                  红包个数
     * @return Array<Integer>        元素为各个红包的金额值，所有的值累和等于金额。
     *
     */

    ArrayList<Integer> divide(int totalMoney,int totalCount);

}
