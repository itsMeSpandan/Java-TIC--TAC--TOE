import java.util.Scanner;
public class TicTacToe
{
	public static void main(String[] args)
    {
        System.out.println("Welcome to Tic-Tac-Toe");
        Scanner devil = new Scanner(System.in);
        String a="a",b="b",c="c",d="d",e="e",f="f",g="g",h="h",i="i",x="X",o="O";
        System.out.println("Watch the Letter for each box and place your turn");
        int xw=0,ow=0;
        System.out.println("Enter the names of 'X'user");
        String xnm=devil.nextLine();
        System.out.println("Enter the names of 'O' user");
        String onm=devil.nextLine();
        for(int j=1;j<5;j++)
        {
          System.out.println(" --- --- ---");
          System.out.println("| "+a+" | "+b+" | "+c+" |");
          System.out.println(" --- --- ---");
          System.out.println("| "+d+" | "+e+" | "+f+" |");
          System.out.println(" --- --- ---");
          System.out.println("| "+g+" | "+h+" | "+i+" |");
          System.out.println(" --- --- ---");
           System.out.println("Turn for "+xnm);
          String xc=devil.nextLine();
          switch(xc){
          case "a":
          a=x;
          break;
          case "b":
          b=x;
          break;
          case "c":
          c=x;
          break;
          case "d":
          d=x;
          break;
          case "e":
          e=x;
          break;
          case "f":
          f=x;
          break;
          case "g":
          g=x;
          break;
          case "h":
          h=x;
          break;
          case "i":
          i=x;
          break;
          default:
          System.exit(0);
        }
        if(a==x&&e==x&&i==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }  
        else if(a==x&&d==x&&g==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }
        else if(b==x&&e==x&&h==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }
        else if(c==x&&f==x&&i==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }
        else if(c==x&&e==x&&g==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }else if(a==x&&b==x&&c==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }
        else if(d==x&&e==x&&f==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }
        else if(g==x&&h==x&&i==x)
        {
            System.out.println(xnm+" wins");
            xw=1;
            break;
        }
          System.out.println(" --- --- ---");
          System.out.println("| "+a+" | "+b+" | "+c+" |");
          System.out.println(" --- --- ---");
          System.out.println("| "+d+" | "+e+" | "+f+" |");
          System.out.println(" --- --- ---");
          System.out.println("| "+g+" | "+h+" | "+i+" |");
          System.out.println(" --- --- ---");
          System.out.println("Turn for "+onm);
          String oc=devil.nextLine();
          switch(oc){
          case "a":
          a=o;
          break;
          case "b":
          b=o;
          break;
          case "c":
          c=o;
          break;
          case "d":
          d=o;
          break;
          case "e":
          e=o;
          break;
          case "f":
          f=o;
          break;
          case "g":
          g=o;
          break;
          case "h":
          h=o;
          break;
          case "i":
          i=o;
          break;
          default:
          System.exit(0);
        }
        if(a==o&&e==o&&i==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }  
        else if(a==o&&d==o&&g==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }
        else if(b==o&&e==o&&h==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }
        else if(c==x&&f==x&&i==x)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }
        else if(c==o&&e==o&&g==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }else if(a==o&&b==o&&c==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }
        else if(d==o&&e==o&&f==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }
        else if(g==o&&h==o&&i==o)
        {
            System.out.println(onm+" wins");
            ow=1;
            break;
        }
        
       }
       if(xw==1)
       {
           System.out.println("Thank U");
       }
       else if(ow==1)
       {
           System.out.println("Thank U");
       }
       else
       {
           System.out.println("-----DraW-----");
       }
    }
}
