# 并发修改异常：
````java
/**异常报错：
Exception in thread "main" java.util.ConcurrentModificationException
at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
at A1_MyJava.基础知识.集合.Collection.List.List集合.List并发修改异常.List_Yi.main(List_Yi.java:24)
*/
````

##程序原码(简略):
````java
//                                                                  [class]
public interface List<E>{                         
    Iterator<E> iterator();
    boolean add(E e);
}

public abstract class AbstractList<E>{
    protected transient int modCount = 0;
    //......
}   //ArrayList<E>的父类

//                                                                  [class]
public class ArrayList<E> extends AbstractList<E> implements List<E>{

    //get方法
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    //add方法
    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }

    //iterator方法
    public Iterator<E> iterator() {
        return new Itr();
    }

    //Itr内部类继承Iterator接口                                      [class]
    private class Itr implements Iterator<E> {

        int expectedModCount = modCount;          //定义次数
        /**
        modCount是实际修改集合的次数
        expectedModCount是预期修改集合的次数
        */
        //实现hasNext方法
        public boolean hasNext() {
            return cursor != size;
        }

        //实现next方法
        public E next() {
            checkForComodification();
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = ArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }

        //判断，抛出异常
        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

}
````
## 分析:
>24行出现的问题:
`String str = itr.next();`
向上是ArrayList的内部类Itr的next方法问题。

>next方法先调用了`checkForComodification();`方法:
>```java
>class ArrayList<E>{
>    final void checkForComodification() {
>        if (modCount != expectedModCount)
>            throw new ConcurrentModificationException();
>    }
>}
>```

>当`modCount != expectedModCount`时，
就抛出了`ConcurrentModificationException`异常

## 原因:
>`modCount`是实际修改集合的次数，`expectedModCount`是预期修改集合的次数

>预期修改集合的次数在`内部类Itr中`:`int expectedModCount = modCount;`

>在Itr当中，是将`实际修改集合次`数赋值给了`预期修改集合次数`
,所以说一开始是一样的，不会报错，但是当进行某些操作时，可能会发生变化

>### 变化:
>`modCount是实际修改集合的次数`的来源在`ArrayList<E>`的父类`AbstractList<E>`当中
> 
>`protected transient int modCount = 0;`protected修饰子类`ArrayList<E>`继承父类
> 
> 所以一开始，`modCount`是实际修改集合的次数，`expectedModCount`是预期修改集合的次数
> 两个值都是相等的0，每次`Itr.next()`都要先执行`checkForComodification();`
> ```java
> class ArrayList<E>{
>     public E next() {
>          checkForComodification();
>          int i = cursor;
>          if (i >= size)
>              throw new NoSuchElementException();
>          Object[] elementData = ArrayList.this.elementData;
>          if (i >= elementData.length)
>              throw new ConcurrentModificationException();
>          cursor = i + 1;
>          return (E) elementData[lastRet = i];
>      }
> }
> ```
> 当进行:
> ```
>    if (str.equals("亚索")){
>        list.add("牛批,卢本伟没有开挂！");
>    }
>```
> 操作时，调用了add方法，跟进add方法:
> ```java
> class ArrayList<E>{
>     public boolean add(E e) {
>          modCount++;
>          add(e, elementData, size);
>          return true;
>     }
> }
>```
>add方法当中，出现了`modCount++;`也就是，实际修改集合次数加1，
> 而`expectedModCount`是预期修改集合的次数没有加1，
> 
> 导致`modCount != expectedModCount`执行抛出异常

## 解决方案
>使用 get方法 和 for循环 进行解决
> ```java
> class ArrayList<E>{
>     public E get(int index) {
>          Objects.checkIndex(index, size);
>          return elementData(index);
>     }
> }
>```
> get方法没有像next方法一样，get没有`checkForComodification();`
> 判断是否相等，更不会抛出`ConcurrentModificationException`异常

># for循环y y d s
