package cn.it.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：List方法测试
 * User:
 * Date: 2015/8/21
 * Time: 14:33
 */
public class ListMethod {
    public static void main(String[] args) {
        ListMethod listMethod=new ListMethod();
//        listMethod.testIsEmpty();
    }

    /**
     * 测试 isEmpty()
     * true if this list contains no elements
     * 根据list.size()判断
     *
     * @exception : list=null空指针异常
     */
    private void testIsEmpty(){
        List list=null;
        list=new ArrayList();
        System.out.println(list.isEmpty());
    }
}
