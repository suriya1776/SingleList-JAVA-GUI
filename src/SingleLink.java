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
     Font myfont= new Font("Ink Free",Font.BOLD,30);
     
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
	  
	  
	  for(int i=0;i<12;i++) {
		 
		  button[i].setSize(10,10);
		  button[i].addActionListener(this);
		  button[i].setFont(myfont);
		  button[i].setFocusable(false);
		  inputfield[i].addActionListener(this);
		  inputfield[i].setEditable(true);
	  }
	  
	  panel=new JPanel();
	  panel.setBounds(20,100,400,500);
	  panel.setLayout(new GridLayout(12,2,10,10));
	  panel.setBackground(Color.WHITE);
	  
	  for(int i=0;i<12;i++) {
		  panel.add(button[i]);
		  panel.add(inputfield[i]);
	  }
	  
	  frame.add(panel);
	  frame.add(textfield);
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
  
  public listnode display() {
	  if(head==null) {
		  textfield.setText("there is no element in the list");
		  return head;
	  }
	  else
	  {   
		  System.out.println(head.data);
		  listnode start=head;
		  textfield.setText(null);	
		  while(start!=null) {
		      System.out.println(start.data);
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





