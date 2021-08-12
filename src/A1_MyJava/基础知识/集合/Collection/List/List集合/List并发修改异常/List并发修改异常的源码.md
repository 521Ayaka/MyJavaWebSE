# �����޸��쳣��
````java
/**�쳣����
Exception in thread "main" java.util.ConcurrentModificationException
at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
at A1_MyJava.����֪ʶ.����.Collection.List.List����.List�����޸��쳣.List_Yi.main(List_Yi.java:24)
*/
````

##����ԭ��(����):
````java
//                                                                  [class]
public interface List<E>{                         
    Iterator<E> iterator();
    boolean add(E e);
}

public abstract class AbstractList<E>{
    protected transient int modCount = 0;
    //......
}   //ArrayList<E>�ĸ���

//                                                                  [class]
public class ArrayList<E> extends AbstractList<E> implements List<E>{

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

        int expectedModCount = modCount;          //�������
        /**
        modCount��ʵ���޸ļ��ϵĴ���
        expectedModCount��Ԥ���޸ļ��ϵĴ���
        */
        //ʵ��hasNext����
        public boolean hasNext() {
            return cursor != size;
        }

        //ʵ��next����
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

        //�жϣ��׳��쳣
        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

}
````
## ����:
>24�г��ֵ�����:
`String str = itr.next();`
������ArrayList���ڲ���Itr��next�������⡣

>next�����ȵ�����`checkForComodification();`����:
>```java
>class ArrayList<E>{
>    final void checkForComodification() {
>        if (modCount != expectedModCount)
>            throw new ConcurrentModificationException();
>    }
>}
>```

>��`modCount != expectedModCount`ʱ��
���׳���`ConcurrentModificationException`�쳣

## ԭ��:
>`modCount`��ʵ���޸ļ��ϵĴ�����`expectedModCount`��Ԥ���޸ļ��ϵĴ���

>Ԥ���޸ļ��ϵĴ�����`�ڲ���Itr��`:`int expectedModCount = modCount;`

>��Itr���У��ǽ�`ʵ���޸ļ��ϴ�`����ֵ����`Ԥ���޸ļ��ϴ���`
,����˵һ��ʼ��һ���ģ����ᱨ�����ǵ�����ĳЩ����ʱ�����ܻᷢ���仯

>### �仯:
>`modCount��ʵ���޸ļ��ϵĴ���`����Դ��`ArrayList<E>`�ĸ���`AbstractList<E>`����
> 
>`protected transient int modCount = 0;`protected��������`ArrayList<E>`�̳и���
> 
> ����һ��ʼ��`modCount`��ʵ���޸ļ��ϵĴ�����`expectedModCount`��Ԥ���޸ļ��ϵĴ���
> ����ֵ������ȵ�0��ÿ��`Itr.next()`��Ҫ��ִ��`checkForComodification();`
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
> ������:
> ```
>    if (str.equals("����")){
>        list.add("ţ��,¬��ΰû�п��ң�");
>    }
>```
> ����ʱ��������add����������add����:
> ```java
> class ArrayList<E>{
>     public boolean add(E e) {
>          modCount++;
>          add(e, elementData, size);
>          return true;
>     }
> }
>```
>add�������У�������`modCount++;`Ҳ���ǣ�ʵ���޸ļ��ϴ�����1��
> ��`expectedModCount`��Ԥ���޸ļ��ϵĴ���û�м�1��
> 
> ����`modCount != expectedModCount`ִ���׳��쳣

## �������
>ʹ�� get���� �� forѭ�� ���н��
> ```java
> class ArrayList<E>{
>     public E get(int index) {
>          Objects.checkIndex(index, size);
>          return elementData(index);
>     }
> }
>```
> get����û����next����һ����getû��`checkForComodification();`
> �ж��Ƿ���ȣ��������׳�`ConcurrentModificationException`�쳣

># forѭ��y y d s
