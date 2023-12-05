import java.util.Scanner;
public class syncthread{
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Table you want to run by Thread 1:");
		int number1=sc.nextInt();
		System.out.print("Enter the Table you want to run by Thread 2:");
		int number2=sc.nextInt();
		System.out.print("Enter the Table you want to run by Thread 3:");
		int number3=sc.nextInt();
		multiplicationTable m=new multiplicationTable();
		MyThread1 t=new MyThread1(number1,m);
		MyThread2 t1=new MyThread2(number2,m);
		MyThread3 t2=new MyThread3(number3,m);
		t.start();
		t1.start();
		t2.start();
		
	}
}
class MyThread1 extends Thread{
	multiplicationTable t;
	int num;
	MyThread1(int num, multiplicationTable t){
		this.num=num;
		this.t=t;
	}
	public void run() {
		t.printMultiplicationTable(num);
	}
}
class MyThread2 extends Thread{
	multiplicationTable t;
	int num;
	MyThread2(int num,multiplicationTable t){
		this.num=num;
		this.t=t;
	}
	public void run() {
		t.printMultiplicationTable(num);
	}
}
class MyThread3 extends Thread{
	multiplicationTable t;
	int num;
	MyThread3(int num,multiplicationTable t){
		this.num=num;
		this.t=t;
	}
	public void run() {
		t.printMultiplicationTable(num);
		
	}
}
class multiplicationTable{
	synchronized void printMultiplicationTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+number+"="+i*number);
		}
		System.out.println(" ");
	}
}
