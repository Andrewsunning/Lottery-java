import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;
import java.lang.*;
public class Lottery implements ActionListener{
	static Frame f1;
	static Frame f2;
	static Frame f3;
	static TextField tf1;
	static TextField tf2;
	static TextField tf3;
	static TextField tf4;
	static TextField tf5;
	static TextField tf11;
	static TextField tf12;
	static TextField tf13;
	static TextField tf14;
	static TextField tf15;
	static TextField tf16;
	Label l5;
	Label l2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Panel p2;
	Panel p5;
	public static void main(String[] agrs){
		Lottery a=new Lottery();
		a.init();
	} 
	void init(){
		f1=new Frame("How to play!");
		f1.addWindowListener(new WindowHandler());
		Label l1=new Label("Which one you want to play?");
		Button b1=new Button("play 1");
		b1.addActionListener(this);
		Button b2=new Button("play 2");
		b2.addActionListener(this);
		Panel p1=new Panel();
		p1.add(b1);
		p1.add(b2);
		f1.add(l1,BorderLayout.NORTH);
		f1.add(p1,BorderLayout.SOUTH);
		f1.setSize(300,300);
		f1.pack();
		f1.setVisible(true);
	}
	void input1(){
		f2=new Frame("playing 1");
		f2.setLayout(new GridLayout(4,1));
		f2.addWindowListener(new WindowHandler());
		l2=new Label("which number you buy from 1 to 11:");
		tf1=new TextField(2);
		tf2=new TextField(2);
		tf3=new TextField(2);
		tf4=new TextField(2);
		tf5=new TextField(2);
		b3=new Button("commit1");
		b3.addActionListener(this);
		b5=new Button("resetting1");
		b5.addActionListener(this);
		p2=new Panel();
		Panel p8=new Panel();
		p2.add(l2);
		p2.add(tf1);
		p2.add(tf2);
		p2.add(tf3);
		p2.add(tf4);
		p2.add(tf5);
		p8.add(b3);
		p8.add(b5);
		f2.add(p2);
		f2.add(p8);
		f2.setSize(800,300);
		f2.pack();
		f2.setVisible(true);
		//System.out.println(tf1.getText().trim());
		//System.out.println(tf2.getText().trim());
		//System.out.println(tf3.getText().trim());
		//System.out.println(tf4.getText().trim());
		//System.out.println(tf5.getText().trim());
	}
	void check1() throws NumberRangeException{
		Label l3=new Label("five random number:");
		TextField tf6=new TextField(2);
		TextField tf7=new TextField(2);
		TextField tf8=new TextField(2);
		TextField tf9=new TextField(2);
		TextField tf10=new TextField(2);
		//System.out.println(tf1.getText().trim());
		//System.out.println(tf2.getText().trim());
		//System.out.println(tf3.getText().trim());
		//System.out.println(tf4.getText().trim());
		//System.out.println(tf5.getText().trim());
		Random random=new Random();
		boolean[] bool=new boolean[12];
		int[] randInt=new int[5];
		for(int j=0;j<5;j++){
			do{
				randInt[j]=random.nextInt(11)+1;
			}while(bool[randInt[j]]);
			bool[randInt[j]]=true;
		}
		String[] str=new String[5];
		for(int i=0;i<5;i++){
			str[i]=randInt[i]+"";
		}
		tf6.setText(str[0]);
		tf7.setText(str[1]);
		tf8.setText(str[2]);
		tf9.setText(str[3]);
		tf10.setText(str[4]);
		Label l4=new Label("the outcome:");
		int a1=Integer.parseInt(tf1.getText());
		int a2=Integer.parseInt(tf2.getText());
		int a3=Integer.parseInt(tf3.getText());
		int a4=Integer.parseInt(tf4.getText());
		int a5=Integer.parseInt(tf5.getText());
		//System.out.println(a1);
		//System.out.println(a2);
		//System.out.println(a3);
		//System.out.println(a4);
		//System.out.println(a5);
		int count=0;
		for(int i=0;i<5;i++){
			if(a1==randInt[i]){
				count++;
			}
		}
		for(int i=0;i<5;i++){
			if(a2==randInt[i]){
				count++;
			}
		}
		for(int i=0;i<5;i++){
			if(a3==randInt[i]){
				count++;
			}
		}
		for(int i=0;i<5;i++){
			if(a4==randInt[i]){
				count++;
			}
		}
		for(int i=0;i<5;i++){
			if(a5==randInt[i]){
				count++;
			}
		}
		//System.out.println(count);
		TextField tf11=new TextField(35);
		if((a1<0||a1>11)||(a2<0||a2>11)||(a3<0||a3>11)||(a4<0||a4>11)||(a5<0||a5>11)){
			NumberRangeException e=new NumberRangeException("Input Error!");
			throw e;
		}
		else{
			switch(count){
				case 0:
				case 1:
				case 2:
					tf11.setText("Sorry! You are not winning!");
					break;
				case 3:
					tf11.setText("Congratulations! You get the third prize!");
					break;
				case 4:
					tf11.setText("Congratulations! You get the second prize!");
					break;
				case 5:
					tf11.setText("Congratulations! You get the first prize!");
					break;
			}
			tf11.setEditable(false);
			//System.out.println(tf11.getText());
			Panel p3=new Panel();
			Panel p4=new Panel();
			p3.add(l3);
			p3.add(tf6);
			p3.add(tf7);
			p3.add(tf8);
			p3.add(tf9);
			p3.add(tf10);
			p4.add(l4);
			p4.add(tf11);
			f2.add(p3);
			f2.add(p4);
		}
			f2.setSize(800,300);
			f2.pack();
			f2.setVisible(true);
		
	}
	void input2(){
		f3=new Frame("playing 2");
		f3.setLayout(new GridLayout(4,1));
		f3.addWindowListener(new WindowHandler());
		l5=new Label("which number you buy from 1 to 5:");
		tf12=new TextField(2);
		tf13=new TextField(2);
		tf14=new TextField(2);
		tf15=new TextField(2);
		tf16=new TextField(2);
		b4=new Button("commit2");
		b4.addActionListener(this);
		b6=new Button("resetting2");
		b6.addActionListener(this);
		p5=new Panel();
		Panel p9=new Panel();
		p5.add(l5);
		p5.add(tf12);
		p5.add(tf13);
		p5.add(tf14);
		p5.add(tf15);
		p5.add(tf16);
		p9.add(b4);
		p9.add(b6);
		f3.add(p5);
		f3.add(p9);
		f3.setSize(800,300);
		f3.pack();
		f3.setVisible(true);
		//System.out.println(tf12.getText().trim());
		//System.out.println(tf13.getText().trim());
		//System.out.println(tf14.getText().trim());
		//System.out.println(tf15.getText().trim());
		//System.out.println(tf16.getText().trim());
	}
	void check2() throws NumberRangeException{
		//System.out.println(tf12.getText().trim());
		//System.out.println(tf13.getText().trim());
		//System.out.println(tf14.getText().trim());
		//System.out.println(tf15.getText().trim());
		//System.out.println(tf16.getText().trim());
		Label l6=new Label("five random number :");
		TextField tf17=new TextField(2);
		TextField tf18=new TextField(2);
		TextField tf19=new TextField(2);
		TextField tf20=new TextField(2);
		TextField tf21=new TextField(2);
		Random random=new Random();
		int[] randInt=new int[5];
		for(int i=0;i<5;i++){
			randInt[i]=random.nextInt(5)+1;
		}
		String[] str=new String[5];
		for(int i=0;i<5;i++){
			str[i]=randInt[i]+"";
		}
		tf17.setText(str[0]);
		tf18.setText(str[1]);
		tf19.setText(str[2]);
		tf20.setText(str[3]);
		tf21.setText(str[4]);
		//System.out.println(tf17.getText().trim());
		//System.out.println(tf18.getText().trim());
		//System.out.println(tf19.getText().trim());
		//System.out.println(tf20.getText().trim());
		//System.out.println(tf21.getText().trim());
		Label l7=new Label("the outcome:");
		TextField tf22=new TextField(35);
		int count=0;
		int b1=Integer.parseInt(tf12.getText());
		int b2=Integer.parseInt(tf13.getText());
		int b3=Integer.parseInt(tf14.getText());
		int b4=Integer.parseInt(tf15.getText());
		int b5=Integer.parseInt(tf16.getText());
		if((b1<0||b1>5)||(b2<0||b2>5)||(b3<0||b3>5)||(b4<0||b4>5)||(b5<0||b5>5)){
			NumberRangeException e=new NumberRangeException("Input Error!!!");
			throw e;
		}
		else{
			if(b1==randInt[0])
				count++;
			if(b2==randInt[1])
				count++;
			if(b3==randInt[2])
				count++;
			if(b4==randInt[3])
				count++;
			if(b5==randInt[4])
				count++;
			//System.out.println(count);
			switch(count){
				case 0:
				case 1:
				case 2:
					tf22.setText("Sorry! You are not winning!");
					break;
				case 3:
					tf22.setText("Congratulations! You get the third prize!");
					break;
				case 4:
					tf22.setText("Congratulations! You get the second prize!");
					break;
				case 5:
					tf22.setText("Congratulations! You get the first prize!");
					break;
			}
			//System.out.println(tf22.getText().trim());
			tf22.setEditable(false);
			Panel p6=new Panel();
			Panel p7=new Panel();
			p6.add(l6);
			p6.add(tf17);
			p6.add(tf18);
			p6.add(tf19);
			p6.add(tf20);
			p6.add(tf21);
			p7.add(l7);
			p7.add(tf22);
			f3.add(p6);
			f3.add(p7);
		}
		f3.setSize(800,300);
		f3.pack();
		f3.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Lottery a=new Lottery();
		if(e.getActionCommand()=="play 1"){
				a.input1();		
			}
		else if(e.getActionCommand()=="play 2"){
			a.input2();
		}
		else if(e.getActionCommand()=="commit1"){
			try{
				a.check1();
			}
			catch(NumberRangeException ee){
				TextField tf23=new TextField();
				tf23.setText("Input error!!! Please input again!");
				tf23.setEditable(false);
				f2.add(tf23);
				f2.setSize(800,300);
				f2.pack();
				f2.setVisible(true);
			}
		}
		else if(e.getActionCommand()=="commit2"){
			try{
				a.check2();
			}
			catch(NumberRangeException ee){
				TextField tf24=new TextField();
				tf24.setText("Input error!!! Please input again!");
				tf24.setEditable(false);
				f3.add(tf24);
				f3.setSize(800,300);
				f3.pack();
				f3.setVisible(true);
			}
		}
		else if(e.getActionCommand()=="resetting1"){
			a.input1();
		}
		else if(e.getActionCommand()=="resetting2"){
			a.input2();
		}
	}
}
class WindowHandler implements WindowListener{
	public void windowClosing(WindowEvent e){
			System.exit(1);
		}
	public void windowOpened(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
}
class NumberRangeException extends Exception{
	NumberRangeException(String msg){
		super(msg);
	}
}