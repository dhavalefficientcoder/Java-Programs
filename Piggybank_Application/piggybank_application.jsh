//importing java swing package
import static javax.swing.JOptionPane.*;
//importing java integer class
import static java.lang.Integer.*;

//creating variables

var balance =0;
var lt =0;

//function  creation - for printing
void statement(int balance,int lt){
showMessageDialog(null,"Balance = " + balance + "\n" + " Last Transaction = "+lt);
}

//function for deposit

void deposit(int v){
balance+=v;
lt=v;
statement(balance,lt);
}

//function for withdraw
void withdraw(int v){
if(balance > v){
balance-=v;
lt= -v;
statement(balance,lt);
}
else
{
showMessageDialog(null,"Insufficient Balance");
}
}

//just for test
//statement(balance,lt);

//prompting for value from user
String sr1 = showInputDialog("Enter amount to deposit");
var read= parseInt(sr1);
deposit(read);

//deposit
var r2 = parseInt(showInputDialog("Enter amount to deposit"));
deposit(r2);

//withdraw
withdraw(parseInt(showInputDialog("Enter amount to withdraw")));
