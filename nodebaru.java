/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import sun.applet.Main;

/**
 *
 * @author venom
 */
public class nodebaru {
      public nodebaru head = null;
    public nodebaru tail = null;
    
    
    
    public int data;
    public nodebaru next;
    
    
    public nodebaru (int d){
        this.data = d;
        this.next = null;
    } 
    public void addfirst(int serahnamanya){
        nodebaru newnode = new nodebaru(serahnamanya);
        
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            nodebaru isisementara = head;
             head = newnode;
             head.next = isisementara;
        }   
    }
    
    
    public void addlast(int serahnamanya){
        nodebaru newnode = new nodebaru(serahnamanya);
        
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode; 
            tail = newnode;
             
        }   
    }
    public void hilang(int pos){
        if (pos == 0){
            head = head.getnext();
            return;
        }
        nodebaru current =head;
        int count =0;
        while (count < pos -1){
            current = current.getnext();
            if(current == null){
                throw new IndexOutOfBoundsException("gak ketemu");
            }
            count++;
        }
        if(current.getnext()==null){
            throw new IndexOutOfBoundsException("gak ketemu");
        }
        current.setnext(current.getnext().getnext());
    }
    public nodebaru(){
        this.getClass();
    }
    public String txt(){
        String output = "";
        nodebaru current = head;
        while(current!=null){
            output += current.getdata()+",";
            current = current.getnext();
        }
        return output;
    }
    public int getdata(){return data;}
    public nodebaru getnext(){return next;}
    
    public void setdata(int d){data = d ;}
    public void setnext (nodebaru lol){next = lol;}
    
         public static void main(String[]args){
        nodebaru nb = new nodebaru();
        nb.addlast(6);
        nb.addfirst(1);
        nb.addlast(4);
        nb.addlast(7);
        nb.addfirst(9);
        
        System.out.println(nb.txt());
        
        nb.hilang(1);
        System.out.println(nb.txt());
         
    }
  
}
