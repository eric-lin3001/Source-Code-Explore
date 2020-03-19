package com.graphql.demolzy.Array;

import java.util.ArrayList;
import java.util.List;
import com.graphql.demolzy.Array.ArrayBasics;
import com.graphql.demolzy.HelloWorld;

public class TestArrRsts {

    public int size;
    public Object[] ele = {};
    public boolean add(Integer param) {
        ele[size++] = param;
        return true;
    }

    public static void main(String[] args) throws Exception {
        /**
         * 用数组/指针实现：
         * 1. size() —— 数组元素的个数
         * 2. at(index) / get()—— 返回对应索引的元素，且若索引越界则愤然报错
         * 3. is_empty() - 检查数组是否为空。size==0为empty
         * 4. pop() - 删除数组最后一个元素
         * 5. delete() TODO 多种实现？
         * 6. insert(index, item) —— 在指定索引中插入元素，并把后面的元素依次后移。 TODO System.arraycopy()
         * 7. find(E value) 返回该value的第一个索引值。找不到索引返回-1。 TODO elementData[i].equal(null) 与  elementData[i] == null 的不同点
         */
        ArrayBasics<Integer> arr = new ArrayBasics<Integer>(10);
        arr.add(3);
        arr.add(null);
        arr.add(5);
        arr.add(6);
        Integer indexOf = arr.find(null);
//        Integer arrSize = arr.size();
//        Integer arrValueOfIndex = arr.get(0);
//        arr.pop();
        arr.delete(1);


    }
}
