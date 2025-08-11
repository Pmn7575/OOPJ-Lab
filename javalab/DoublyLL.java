import java.util.*;
public class DoublyLL{
    class node{
        int data;
        node next;
        node prev;
        public node(int data){
       this.data=data;
       this.next=null;
       this.prev=null;
        }
    }
        public static node head;
         
    
       public void AddFirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
       }
       
       public void InsertAtPsition(int data,int pos){
        node newnode=new node(data);
        node temp=head;
        if(head==null){
           AddFirst(data);
        }
        for(int i=0;i<pos-1 && temp!=null;i++){
         temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        newnode.prev=temp;
        temp.next=newnode;
       }

       public void InsertAtEnd(int data){
        node newnode=new node(data);
        node temp=head;
        if(head==null){
            head=newnode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
       }

      public void DeleteAtFirst(){
        node temp=head;
       if(head==null){
        System.out.println("LL is Empty");
        return;
       }
      head=head.next;
      head.prev=null;
      }

     public void DeleteAtEnd(){
        node temp=head;
        if(head==null){
        System.out.println("LL is Empty");
        return;
       }
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.prev.next=null;
      temp.prev=null;
     }
       public void Display(){
        node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
       }

      public void DeleteAtPos(int pos){
        if(head==null){
            System.out.println("LL is empty");
        }
        if(pos==0){
            DeleteAtFirst();
        }
        node temp=head;
        for(int i=0;i<pos-1 && temp != null;i++){
         temp=temp.next;
        }
          temp.next=temp.next.next;
          temp.next.next.prev=temp;
        }

    
    public static void main(String args[]){
     DoublyLL LL=new DoublyLL();
     Scanner sc=new Scanner(System.in);
     int data,ans,pos;
     do{
        System.out.println("---enter your choice---");
        System.out.println("1:AddFirst");
        System.out.println("2:InsertAtPsition");
        System.out.println("3:InsertAtEnd");
        System.out.println("4:DeleteAtFirst");
        System.out.println("5:DeleteAtEnd");
        System.out.println("6:DeleteAtPos");
        System.out.println("7:Display");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
      switch(ch){
        case 1:System.out.println("enter the data :");
        data=sc.nextInt();
        LL.AddFirst(data);
        break;

        case 2:System.out.println("enter the data :");
         data=sc.nextInt();
         System.out.println("enter the pos");
         pos=sc.nextInt();
        LL.InsertAtPsition(data,pos);
        break;

        case 3:System.out.println("enter the data :");
         data=sc.nextInt();
         LL.InsertAtEnd(data);
         break;

        case 4:LL.DeleteAtFirst();
        break;

        case 5:LL.DeleteAtEnd();
        break;

        case 6:System.out.println("enter the position to delete");
           pos=sc.nextInt();
            LL.DeleteAtPos(pos);
        break;
 
         case 7:LL.Display();
         break;


      }
      System.out.println("Do U want to continue");
      ans=sc.nextInt();
       }while(ans==1);
    }
}