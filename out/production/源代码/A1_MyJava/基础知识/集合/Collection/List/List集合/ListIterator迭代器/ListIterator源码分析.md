# ListIterator源码分析
```java
//                                                                  [class]
public interface List<E>{                         
    Iterator<E> iterator();
    //boolean add(E e); //这次不是通过list添加的，用不到
    /**
    新添加 listIterator方法
    */
    ListIterator<E> listIterator();
}

public abstract class AbstractList<E>{
    protected transient int modCount = 0;
    //......
}   //ArrayList<E>的父类

//                                                                  [class]
public class ArrayList<E> extends AbstractList<E> implements List<E>{

    
    /**用不到
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
    }
    */
    private class Itr implements Iterator<E> {
    }
    
    /*
    新添加 listIterator方法，ArrayList实现
    */
    public ListIterator<E> listIterator() {
        return new ListItr(0);
    }
    //ListItr继承了Itr
    private class ListItr extends Itr implements ListIterator<E> {
        
        public void add(E e) {
            checkForComodification();

            try {
                int i = cursor;
                ArrayList.this.add(i, e);
                cursor = i + 1;
                lastRet = -1;
                expectedModCount = modCount; //[重点]
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
    }
    
    final void checkForComodification() {
        if (modCount != expectedModCount)
            throw new ConcurrentModificationException();
    }
}
```
## 不同点：
> `ListItr`中的add方法:
> ```java
> private class ListItr extends Itr implements ListIterator<E> {
>       public void add(E e) {
>           checkForComodification();
>           try {
>               int i = cursor;
>               ArrayList.this.add(i, e);
>               cursor = i + 1;
>               lastRet = -1;
>               expectedModCount = modCount; //[重点]
>           } catch (IndexOutOfBoundsException ex) {
>               throw new ConcurrentModificationException();
>           }
>       }
> }
> ```
>其中add方法里面多了一步: `expectedModCount = modCount;` 重新就导致两数相等
> 则`modCount != expectedModCount`为`false`就不会抛出异常。