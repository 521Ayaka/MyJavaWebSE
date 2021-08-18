# ListIteratorԴ�����
```java
//                                                                  [class]
public interface List<E>{                         
    Iterator<E> iterator();
    //boolean add(E e); //��β���ͨ��list��ӵģ��ò���
    /**
    ����� listIterator����
    */
    ListIterator<E> listIterator();
}

public abstract class AbstractList<E>{
    protected transient int modCount = 0;
    //......
}   //ArrayList<E>�ĸ���

//                                                                  [class]
public class ArrayList<E> extends AbstractList<E> implements List<E>{

    
    /**�ò���
    //get����
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    //add����
    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }

    //iterator����
    public Iterator<E> iterator() {
        return new Itr();
    }

    //Itr�ڲ���̳�Iterator�ӿ�                                      [class]
    private class Itr implements Iterator<E> {
    }
    */
    private class Itr implements Iterator<E> {
    }
    
    /*
    ����� listIterator������ArrayListʵ��
    */
    public ListIterator<E> listIterator() {
        return new ListItr(0);
    }
    //ListItr�̳���Itr
    private class ListItr extends Itr implements ListIterator<E> {
        
        public void add(E e) {
            checkForComodification();

            try {
                int i = cursor;
                ArrayList.this.add(i, e);
                cursor = i + 1;
                lastRet = -1;
                expectedModCount = modCount; //[�ص�]
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
## ��ͬ�㣺
> `ListItr`�е�add����:
> ```java
> private class ListItr extends Itr implements ListIterator<E> {
>       public void add(E e) {
>           checkForComodification();
>           try {
>               int i = cursor;
>               ArrayList.this.add(i, e);
>               cursor = i + 1;
>               lastRet = -1;
>               expectedModCount = modCount; //[�ص�]
>           } catch (IndexOutOfBoundsException ex) {
>               throw new ConcurrentModificationException();
>           }
>       }
> }
> ```
>����add�����������һ��: `expectedModCount = modCount;` ���¾͵����������
> ��`modCount != expectedModCount`Ϊ`false`�Ͳ����׳��쳣��