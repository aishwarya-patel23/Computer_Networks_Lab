import java.util.*;
public class leaky_bucket
{
static int min(int x,int y)
{
if(x<y)
return x;
else
return y;
}
public static void main(String[] args)
 { int drop=0,mini,nsec,cap,count=0,i,process;
int inp[]=new int[25];
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Bucket Size\n");
cap= sc.nextInt();
System.out.println("Enter The Flow Rate\n");
process= sc.nextInt();
System.out.println("Enter The No. Of Seconds You Want To Stimulate\n");
nsec=sc.nextInt();
for(i=0;i<nsec;i++)
{ System.out.print("Enter The Size Of The Packet Entering At "+ i+1 + " sec ");
inp[i] = sc.nextInt();
}
System.out.println("\nSecond | Packet Recieved | Packet Sent | Packet Left |Packet Dropped|\n");
System.out.println("------------------------------------------------------------------------\n");
for(i=0;i<nsec;i++)
{ count+=inp[i];
if(count>cap)
{ drop=count-cap;
count=cap;
}
System.out.print(i+1);
System.out.print("\t\t"+inp[i]);
mini=min(count,process);
System.out.print("\t\t"+mini);
count=count-mini;
System.out.print("\t\t"+count);
System.out.print("\t\t"+drop);
drop=0;
System.out.println();
}
for(;count!=0;i++)
{
if(count>cap)
{
drop=count-cap;
count=cap;
}
System.out.print(i+1);
System.out.print("\t\t0");
mini=min(count,process);
System.out.print("\t\t"+mini);
count=count-mini;
System.out.print("\t\t"+count);
System.out.print("\t\t"+drop);
System.out.println();
}
}
 }

////////////
// Output
//Enter The Bucket Size

//10
//Enter The Flow Rate

//2
//Enter The No. Of Seconds You Want To Stimulate

//5
//Enter The Size Of The Packet Entering At 01 sec 5
//Enter The Size Of The Packet Entering At 11 sec 3
//Enter The Size Of The Packet Entering At 21 sec 6
//Enter The Size Of The Packet Entering At 31 sec 4
//Enter The Size Of The Packet Entering At 41 sec 3

//Second | Packet Recieved | Packet Sent | Packet Left |Packet Dropped|

//------------------------------------------------------------------------

//1               5               2               3               0
//2               3               2               4               0
//3               6               2               8               0
//4               4               2               8               2
//5               3               2               8               1
//6               0               2               6               0
//7               0               2               4               0
//8               0               2               2               0
//9               0               2               0               0