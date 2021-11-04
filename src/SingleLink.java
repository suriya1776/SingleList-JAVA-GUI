import javax.swing.*;
import javax.swing.text.Caret;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;  



public class SingleLink implements ActionListener
{    
	 private listnode head;
	 
	 
	
	 JFrame frame;
   
     JTextField textfield=new JTextField("this is where the list goes");
    
     JFormattedTextField[] inputfield = new JFormattedTextField[13];
     
     JButton[] button=new JButton[13];
     
     JButton createlist,insertfirst,deletefirst,deletelast,insertlast,insertanywhere,deleteanywhere,findvalueexist,
    findposition,listreverse,findmiddle,display;
     
     JFormattedTextField field1,field2,field3,field4,field5,field6,field7,field8,field9,field10,field11,field12;
     
     JPanel panel;
     JPanel anyWherePanel;
     Font myfont= new Font("Ink Free",Font.BOLD,15);
     
     private static class listnode{
    	 
    	 
    	 private int data;
    	 
    	 private listnode next;
    	 
    	public listnode(int data) {
    		this.data=data;
    		this.next=null;
    	 }
    	 
     }
	
  SingleLink(){
	  frame=new JFrame("Singlelist");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(900,900);
	  frame.setLayout(null);
	  
	  textfield =new JTextField();
	  textfield.setBounds(20,10,600,70);
	  textfield.setFont(myfont);
	  textfield.setEditable(false);
	  
	  createlist=new JButton("createlist");
	  insertfirst=new JButton("insertfirst");
	  deletefirst=new JButton("deletefirst");
	  deletelast=new JButton(" deletelast");
	  insertlast=new JButton("insertlast");
	  insertanywhere=new JButton("insertanywhere");
	  deleteanywhere=new JButton("deleteanywhere");
	  findvalueexist=new JButton("findvalueexist");
	  findposition=new JButton("findposition");
	  listreverse=new JButton("listreverse");
	  findmiddle=new JButton("findmiddle");
	  display=new JButton("display");
	  
	  
	  button[0]=createlist;
	  button[1]=insertfirst;
	  button[2]=deletefirst;
	  button[3]=deletelast;
	  button[4]=insertlast;
	  button[5]=insertanywhere;
	  button[6]=deleteanywhere;
	  button[7]=findvalueexist;
	  button[8]=findposition;
	  button[9]=listreverse;
	  button[10]=findmiddle;
	  button[11]=display;
	  
	  NumberFormat nm1= NumberFormat.getInstance();
	  NumberFormatter nm= new NumberFormatter(nm1);
	  nm.setAllowsInvalid(false);
	  field1=new JFormattedTextField(nm);
	  field2=new JFormattedTextField(nm);
	  field3=new JFormattedTextField(nm);
	  field4=new JFormattedTextField(nm);
	  field5=new JFormattedTextField(nm);
	  field6=new JFormattedTextField(nm);
	  field7=new JFormattedTextField(nm);
	  field8=new JFormattedTextField(nm);
	  field9=new JFormattedTextField(nm);
	  field10=new JFormattedTextField(nm);
	  field11=new JFormattedTextField(nm);
	  field12=new JFormattedTextField(nm);
	  
	  
	  inputfield[0]=field1;
	  inputfield[1]=field2;
	  inputfield[2]=field3;
	  inputfield[3]=field4;
	  inputfield[4]=field5;
	  inputfield[5]=field6;
	  inputfield[6]=field7;
	  inputfield[7]=field8;
	  inputfield[8]=field9;
	  inputfield[9]=field10;
	  inputfield[10]=field11;
	  inputfield[11]=field12;
	  
	  button[2].setBackground(Color.CYAN);
	  button[3].setBackground(Color.CYAN);
	  button[9].setBackground(Color.CYAN);
	  button[10].setBackground(Color.CYAN);
	  button[11].setBackground(Color.CYAN);
	  
	  
	  for(int i=0;i<12;i++) {
		 
		  button[i].setSize(5,5);
		  button[i].addActionListener(this); 
		  button[i].setFont(myfont);
		  button[i].setFocusable(false);
		  inputfield[i].addActionListener(this);
		  inputfield[i].setEditable(true);   
	  }
	  
	  panel=new JPanel();
	  anyWherePanel=new JPanel();
	  anyWherePanel.setBounds(600,100,300,100);
	  anyWherePanel.setLayout(new GridLayout(2,3,0,0));
	  anyWherePanel.setBackground(Color.BLACK);
	  panel.setBounds(20,100,500,500);
	  panel.setLayout(new GridLayout(8,2,10,10));
	  panel.setBackground(Color.WHITE);
	  
	  
		  panel.add(button[0]);
		  panel.add(inputfield[0]);
		  panel.add(button[1]);
		  panel.add(inputfield[1]);
		  panel.add(button[2]);
		  panel.add(button[3]);
		  panel.add(button[4]);
		  panel.add(inputfield[2]);
		  panel.add(button[7]);
		  panel.add(inputfield[7]);
		  panel.add(button[8]);
		  panel.add(inputfield[8]);
		  panel.add(button[9]);
		  panel.add(button[10]);
		  panel.add(button[11]);
	      
		  
		
		  
		  anyWherePanel.add(button[5]);
		  anyWherePanel.add(inputfield[3]);
		  anyWherePanel.add(inputfield[4]);
		  anyWherePanel.add(button[6]);
		  anyWherePanel.add(inputfield[5]);
		
		  
	  frame.add(textfield);
	  frame.add(panel);
	  frame.add(anyWherePanel);
	 
	  frame.setVisible(true);
	  
	  
      }
	 public void  actionPerformed(ActionEvent e){  
	 if(e.getSource()==createlist) {
	 int value=Integer.parseInt(field1.getText());
	 createlist(value);
	 }
	 if(e.getSource()==insertfirst) {
		 int value=Integer.parseInt(field2.getText());
		 insertfirst(value);
	 }
	 if(e.getSource()==deletefirst) {
		 deletefirst();
	 }
	 if(e.getSource()==deletelast) {
		 deletelast();
	 }
	 if(e.getSource()==insertanywhere) {
		 
		 int position=Integer.parseInt(field4.getText());
		
		 int value=Integer.parseInt(field5.getText());
		
		 insertanywhere(position,value);
	 }
	 if(e.getSource()==deleteanywhere) {
		 int position=Integer.parseInt(field6.getText());
		 System.out.println(position);
		 deleteanywhere(position);
	 }
	 if(e.getSource()==insertlast) {
		 int value=Integer.parseInt(field3.getText());
		 insertlast(value);
	 }
	 if(e.getSource()==findvalueexist) {
		 int value=Integer.parseInt(field8.getText());
		 boolean validate= findvalueexist(value);
		 if(validate) {
			 textfield.setText("value found in the list");
		 }
		 else
		 {
			 textfield.setText("value not found in the list");
		 }
	   }
	 if(e.getSource()==findposition) {
		 int value=Integer.parseInt(field9.getText());
		
		 int validate= findposition(value);
		 System.out.println(validate);
		 if(validate==-2) {
			 textfield.setText("the list is empty");
		 }
		 else
		 if(validate==-1) {
			 textfield.setText("the value is not in the list");
		 }
		 else
		 {
			 textfield.setText("the position of the value is : " +validate);
		 }
	 }
	 if(e.getSource()==display) {
		 display();
	 }
	 
	
   } 
   
	 
	 
  
  public listnode createlist(int value) {
	 listnode current=new listnode(value);
	 
	 listnode temp=head;
	 
	 if(head==null) {
		 head=current;
		 head.next=null;
		 
		 return head;
	 }
	 else
	 {
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=current;
		temp.next=null;
		head=temp;
		return head;
	 }
	  
  }
   
 public listnode insertfirst(int value) {
	 listnode current=new listnode(value);
	 if(head==null) {
		 head=current;
		 return head;
	 }
	 else
	 {
		 current.next=head;
		 head=current;
		 return head;
	 }
 }
 
 public listnode deletefirst() {
	 listnode current=head;
	 if(head==null) {
		 return head;
	 }
	 else
	 {
		 current=head.next;
		 head=current;
		 return head;
	 }
 }
 
 public listnode deletelast() {
	 listnode current=head;
	 if(head==null) {
		 return head;
	 }
	 else
	 {
		 while(current.next.next!=null) {
			 current=current.next;
		 }
		 current.next=null;
		 return head;
	 }
 }
 
 public listnode insertanywhere(int position,int value) {
	 listnode node=new listnode(value);
	 listnode current=head;
	 if(position==1) {
		 node.next=current;
		 current=node;
		 return head;
	 }
	 else
	 {
		 int count=1;
		 while(count<position-1){
			 current=current.next;
			 count++;
		 }
		 node.next=current.next;
		 current.next=node;
		 return head;
		 
	 }
	 
 }
 public listnode deleteanywhere(int position) {
	 listnode current=head;
	 if(position==1) {
		 current=current.next;
		 head=current;
		 return head;
	 }
	 else
	 {
		 int count=1;
		 while(count<position-1) {
			 current=current.next;
			 count++;
		 }
		 current=current.next.next;
		 return head;
	 }
 }
 public listnode insertlast(int value) {
	 listnode current=new listnode(value);
	 listnode node=head;
	 if(head==null) {
		 head=current;
		 return head;
	 }
	 else
	 {
		 while(node.next!=null) {
			 node=node.next;
		 }
		 node.next=current;
		 return head;
		 
	 }
 }
 public boolean findvalueexist(int value) {
	 listnode current=head;

	 while(current.next!=null) {
		 if(current.data==value) {
			 return true;
		 }
		 else
		 {
			 current=current.next;
		 }
	 }
	 return false;
 }
 
 public int findposition(int value) {
	 listnode current=head;
	 if(head==null) {
		 return -2;
	 }
	 else
	 {
	int count=1;
    while(current!=null) {
			 if(current.data==value) {
				 return count;
			 }
			 else
			 {
				 current=current.next;
				 count++;
			 }
		 }
      return -1;
	 }
	 
	
 }
  
  public listnode display() {
	  if(head==null) {
		  textfield.setText("there is no element in the list");
		  return head;
	  }
	  else
	  {   
		 
		  listnode start=head;
		  textfield.setText(null);	
		  while(start!=null) {
		     
			  textfield.replaceSelection(String.valueOf(start.data)+"--->");
			  start=start.next;
		  }
		  textfield.replaceSelection("null");
		  return head;
	  }
  }


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 SingleLink sl=new SingleLink();
  	 
		
 }
}





