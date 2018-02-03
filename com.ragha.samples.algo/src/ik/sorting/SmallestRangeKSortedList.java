package ik.sorting;

import java.util.*;
//https://ide.geeksforgeeks.org/25GhRC


public class SmallestRangeKSortedList{
	static int max=1000,min=0;
    static void myfun(int arr[][])
    {
     int row=arr.length;
     int col=arr[0].length,a;int tmax,tmin,nr,nc;heapNode temp,temp1;
     PriorityQueue<heapNode> q=new PriorityQueue<heapNode>(new mycomp());
     for(a=0;a<row;a++)
     {
         temp=new heapNode(arr[a][0],a,0);
        //q.offer(temp);
         q.add(temp);
     }
     
     while(q.size()>=row)
     {
         temp=q.poll();// get the head / min element
         tmin=temp.data;
         Iterator<heapNode> it=q.iterator();tmax=Integer.MIN_VALUE;
         while(it.hasNext())
         {
             temp1=it.next();if(temp1.data>tmax){tmax=temp1.data;}
         }
         if(max-min>tmax-tmin){max=tmax;min=tmin;}
         nr=temp.row;nc=temp.col;
         if(nc<col-1){
             // System.out.println("ok coming"+q.peek().data); 
             temp=new heapNode(arr[nr][nc+1],nr,nc+1);
        q.offer(temp); }
        else{break;}
   //  System.out.println(min+" "+max); 
     }
     
 System.out.println(min+" -- "+max);   }
 
    public static void main (String[] args) {
        int arr[][] = {
                    {4, 7, 9, 12, 15},
                    {0, 8, 14, 16, 20},
                    {11, 12, 16, 30, 50}
                    };
  myfun(arr);  
  
    }
    
    public static class heapNode
    {
        int data;
        int row;int col;
        heapNode(int data,int r,int c)
        {
            this.data=data;row=r;col=c;
        }
    }
    public static    class mycomp implements Comparator<heapNode>
    {
        public int compare(heapNode h1,heapNode h2)
        {
            if(h1.data>h2.data) return 1;
            else return -1;
        }
    } 
}