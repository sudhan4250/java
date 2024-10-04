package collection;

import java.util.Collections;
import java.util.LinkedList;

class linkedlist implements Comparable<linkedlist> {
    String name;
    int Id;
    int Rank;
    public linkedlist(String name,int Id,int rank)
    {
        this.name=name;
        this.Id=Id;
        this.Rank=Rank;
    }

     @Override
     public int compareTo(linkedlist o) {
         if (Rank > o.Rank) {
             return 1;
         } else if (Id > o.Id) {
             return -1;
         }
         else {
             return 0;
         }
     }
 }
 class modify {
     public static void main(String args[])
     {
         LinkedList<linkedlist> in=new LinkedList<linkedlist>();
         in.add(new linkedlist("sudhan",36,1));
         in.add(new linkedlist("sudhan",42,2));
         in.add(new linkedlist("sudhan",35,3));
         for(linkedlist o:in)
         {
             System.out.println(o.name+" "+o.Rank+" "+o.Id);
         }
         System.out.println();
         Collections.sort(in);
         for(linkedlist p:in)
         {
             System.out.println(p.name+" "+p.Id+" "+p.Rank);
         }
     }
}
