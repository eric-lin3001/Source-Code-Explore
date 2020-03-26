# JAVA_BASE

- this关键字

  - 表示对“调用方法的那个对象”的引用。

  - 只能在方法内部使用。

  - 假设你希望在方法内部获得对当前对象的引用，如：

    ```java
    Class Banana
      Banana func(int x){
      // implements
      return this; // 这样就返回了下面代码块中的 ”b“引用
    }
    ```

    

    ```java
    Banana b = new Banana(); // b为Banana类的一个对象的引用。
    b.func(3) // 该动作在java内部实际为：
    Banana.func(b,3)  // 但这样又无法通过编译
    ```

    

  
