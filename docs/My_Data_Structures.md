# DATA STRUCTURES

## ArrayList（数组）

- （0316）动态数组，且占用**连续的**内存空间<font color="#dd0000">（内存如何分配？）</font>

- （0316）时间复杂度<font color="#dd0000">（空间复杂度？）</font>：

  O（1）：查询，修改，在最后一位删除或增加。

  O（n）：删除或增加。

- （0317）实现了"MyArraylist" Class，含有基本的功能。
- <font color="#dd0000">ArrayList为什么是线程不安全的？</font>

## LinkedList（链表）

#### SinglyLinkedList

- （0319）单链表（MyLinkedList）内每个元素（node）都包含2部分：

  1）该node的值：`E item`

  2）下一个node的引用：`MyLinkedlist<E> next`

- 时间复杂度：

  O（1）：在某个node后插入（相当于ArrayList的在某个index后插入）

  O（n）：查询某个位置的node（需要用递归，所以复杂度由linkedlist长度决定。）

- （0320）在一条单链表中，若已知其中一个node，需要在该node（nodeA）和其后一个node（nodeB）中间插入一个值为e的新node（nodeC），主要代码为：

  ```java
  public void insertAfter(E e){
    this.next = new MyLinkedList(e,next);
  }
  ```

  思路：使用构造函数，创建一个新的MyLinkedList（nodeC）,其中item部分赋值为参数e，next部分赋值为nodeA的next（即nodeB），再把构建好的nodeC赋值给nodeA的next（用动画展示效果更好）。

- （0320）找到单链表位置i的node：

  ```java
  public MyLinkedList nth(int pos){
    if(pos==1){
      return this;
    }else if(pos<1 || next==null){
      error
    }else{
      return this.next.nth(pos - 1);
    }
  }
  ```

  思路：

  - 刚进入这个函数时，this为该linkedlist的第一个node，包含item和next。所以如果要找的位置是1，直接返回。
  - 若找的位置不合法，则报错。
  - 若找的位置合法且不为1，则使用递归函数，每次都找到下一个node，并且更新pos = pos -1`<因为对于要找的node对应的pos，this(pos)=this.next(pos-1)>。`）。直到下一个node的pos为1（即下个thisNode的pos为1），返回this即为要找的node。

- <font color="#dd0000">其他单链表函数的实现</font>
- <font color="#dd0000">双链表的含义和实现</font>

## Stack（栈）

- （0318）后进先出
- 应用场景
  - （0318）括号匹配

## Queue（队列）

- （0319）先进先出
- 应用场景
- 实现