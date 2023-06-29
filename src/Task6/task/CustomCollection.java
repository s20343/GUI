package Task6.task;

import java.util.*;

public class CustomCollection<TItem> {

    private List<TItem> elements = new ArrayList<>();
    private CustomIterator iterator = new CustomIterator(this);

    public CustomIterator getIterator() {
        return iterator;
    }

    public List<TItem> getElements() {
        return elements;
    }

    public void replace(int index, TItem item){
        elements.set(index, item);
    }

    public void add(TItem item){
        if (!elements.contains(item)){
            elements.add(item);
        } else
            return;
    }


    public Iterator<TItem> iterator(){
        CustomIterator it = new CustomIterator(this);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        return it;
    }


      class CustomIterator<TItem> implements Iterator<TItem>, ListIterator<TItem> {

          private TItem lastElement;
          private int index = 0;


         public CustomIterator(CustomCollection collection) { }

         @Override
         public boolean hasNext() {
            return index < elements.size() && elements.get(index) != null;
         }

         @Override
         public TItem next() {
             lastElement = (TItem) elements.get(index++);
             return lastElement;
         }

          @Override
          public boolean hasPrevious() {
              return index != 0 && elements.get(index--) != null;
          }

          @Override
          public TItem previous() {
              lastElement  = (TItem) elements.get(index--);
              return lastElement;
          }

          @Override
          public int nextIndex() {
              return index++;
          }

          @Override
          public int previousIndex() {
              return index--;
          }

          @Override
          public void remove(){
             elements.remove(lastElement);
          }

          @Override
          public void set(TItem item) {

          }

          @Override
          public void add(TItem item) {
             add(item);
          }
      }

      public ListIterator<TItem> listIterator(){
        CustomIterator it = new CustomIterator<>(this);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        return it;
      }
}
