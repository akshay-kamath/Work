public class Sort {
   private int data;
   private Sort next;   


   public Sort(int initialData, Sort initialLink) {
      data = initialData;
      next = initialLink;
   }


   public void addAfter(int item) {
      next = new Sort(item, next);
   }          


  public int getData( ) {
      return data;
   }


   public Sort getLink( ) {
      return next;                                               
   } 


   public static Sort listCopy(Sort source) {
      Sort copyHead;
      Sort copyTail;

      if (source == null)
         return null;

      copyHead = new Sort(source.data, null);
      copyTail = copyHead;

      while (source.next != null)
      {
         source = source.next;
         copyTail.addAfter(source.data);
         copyTail = copyTail.next;
      }

      return copyHead;
   }


   public static Sort[ ] listCopyWithTail(Sort source) {
      Sort copyHead;
      Sort copyTail;
      Sort[ ] answer = new Sort[2];

      if (source == null)
         return answer;

      copyHead = new Sort(source.data, null);
      copyTail = copyHead;

      while (source.next != null)
      {
         source = source.next;
         copyTail.addAfter(source.data);
         copyTail = copyTail.next;
      }

      answer[0] = copyHead;
      answer[1] = copyTail;
      return answer;
   }


   public static int listLength(Sort head) {
      Sort pointer;
      int answer;

      answer = 0;
      for (pointer = head; pointer != null; pointer = pointer.next)
         answer++;

      return answer;
   }


   public static Sort[ ] listPart(Sort start, Sort end) {
      Sort copyHead;
      Sort copyTail;
      Sort pointer;
      Sort[ ] answer = new Sort[2];

      copyHead = new Sort(start.data, null);
      copyTail = copyHead;
      pointer = start;

      while (pointer != end)
      {
         pointer = pointer.next;
         if (pointer == null)
            throw new IllegalArgumentException
            ("end node was not found on the list");
         copyTail.addAfter(pointer.data);
         copyTail = copyTail.next;
      }

      answer[0] = copyHead;
      answer[1] = copyTail;
      return answer;
   }        


   public static Sort listPosition(Sort head, int position) {
      Sort pointer;
      int i;

      if (position <= 0)
           throw new IllegalArgumentException("position is not positive");

      pointer = head;
      for (i = 1; (i < position) && (pointer != null); i++)
         pointer = pointer.next;

      return pointer;
   }


   public static Sort listSearch(Sort head, int target) {
      Sort pointer;

      for (pointer = head; pointer != null; pointer = pointer.next)
         if (target == pointer.data)
            return pointer;

      return null;
   }


   public void removeNodeAfter( ) {
      next = next.next;
   }          


   public void setData(int newData)   
   {
      data = newData;
   }                                                               


   public void setLink(Sort newLink) {
      next = newLink;
   }


public static void selectionSort(Sort head) {
        for (Sort p1 = head; p1 != null; p1= p1.getLink()) {
            Sort min = p1;
        for (Sort p2 = p1; p2 != null; p2 = p2.getLink()) {
            if (min.getData() > p2.getData()) {
                min = p2;
            }

        }
        Sort temp = new Sort(p1.getData(), null);
        p1.setData(min.getData());
        min.setData(temp.getData());
    }
   }
    
}    
    
    public static void main(String args[]) {
    Sort head = new Sort(-1, null);
    Sorter sorter = new Sorter();

    head.addAfter(4);
    head.addAfter(5);
    head.addAfter(2);
    head.addAfter(3);
    head.addAfter(6);
    head.addAfter(9);
    head.addAfter(8);
    head.addAfter(10);

    Sort.selectionSort(head);

    for (Sort i = head; i != null; i = i.getLink()) {
        System.out.println(i.getData());
        }
    }
