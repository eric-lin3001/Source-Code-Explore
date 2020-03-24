package com.personal.Array;

public class MyArrayList<E>{

    private int size;

    private Object[] elementData;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};


    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param  initialCapacity  the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity
     *         is negative
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }



    public int size() {
        return size;
    }

    public boolean add(E e)  {
        elementData[size++] = e;
        return true;
    }

    /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks if the given index is in range.  If not, throws an appropriate
     * runtime exception.  This method does *not* check if the index is
     * negative: It is always used immediately prior to an array access,
     * which throws an ArrayIndexOutOfBoundsException if index is negative.
     */
    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("index >= size. Out of bound.");
    }

    public E get(int index) {
        rangeCheck(index);
        return  (E) elementData[index];
    }

    public void pop() {
        elementData[--size] = null; // 将数组最后一个元素置空
    }

    /**
     * 目的：删除数组某个索引的元素，并将后面的元素前移
     * 1. 检查数组是否越界
     * 2. 将指定索引元素置空
     * 3. 后方元素依次前移
     */
    public void delete(int index) {
        rangeCheck(index);
        elementData[index] = null;
        while (index<size){
            elementData[index] = elementData[index+1];
            index++;
        }
        int r =0;
    }

    /**
     * find(item) - looks for value and returns first index with that value, -1 if not found
     */

     public Integer find(E value) {
         // 要考虑数组中有null的情况
         if (value == null) {
             for (int i = 0; i < size; i++)
                 if (elementData[i]==null)
                     return i;
         }else {
             for(int i=0;i<size;i++){
                 if(elementData[i].equals(value)){
                     return i;
                 }
             }
         }


         return -1;
     }

//    public static int getArrayListCapacity(List<Integer> list) throws Exception {
//
//        //get the elementData field from ArrayBasics class
//        Field arrayField = ArrayBasics.class.getDeclaredField("elementData");
//
//        /*
//         * Since the elementData field is private, we need
//         * to make it accessible first
//         */
//        arrayField.setAccessible(true);
//
//        //now get the elementData Object array from our list
//        Object[] internalArray = (Object[]) arrayField.get(list);
//
//        //Internal array length is the ArrayList capacity!
//        return internalArray.length;
//    }
//
//
//    public static List<Integer> initArray() throws Exception {
//        // array静态初始化（在定义的同时指定内容）
//        int[] array = {1, 2, 3, 4, 5};
//        // array静态初始化（先定义指定大小的存储空间,然后再为数组指定内容）
//        int[] array2 = new int[4];
//        array2[0] = 1;
//        array2[1] = 3;
//
//        List<Integer> array3 = new ArrayList<>(2);
//        array3.add(2);
//        array3.add(3);
//        Integer a = getArrayListCapacity(array3);
//        array3.add(3);
//        Integer b = getArrayListCapacity(array3);
//        array3.add(3);
//        Integer c = getArrayListCapacity(array3);
//        array3.add(3);
//        Integer d = getArrayListCapacity(array3);
//        array3.add(3);
//        array3.add(3);
//        array3.add(3);
//        array3.add(3);
//        array3.size();
//
//        return array3;
//    }


}
