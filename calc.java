/* 電卓みたいなプログラム
   since:12/13
   author:sswatanabe*/


public class calc{
  public static void main(String[] args){

   double[] data = new double[256];
   String[] command = new String[256];
   double sum = 0;
   int i=0;
   while(i<256){

     System.out.print("数値を入力してください\n");
     data[i] = new java.util.Scanner(System.in).nextInt();

     if(i != 0){
      switch(command[i-1]){
        case "+":
          sum = sum + data[i];
          System.out.print("++\n");
          break;
	case "-":
	  sum = sum -data[i];
	  break;
	case "*":
	  sum = sum * data[i];
	  break;
        case "/":
          sum = sum / data[i];
          System.out.print("//\n");
          break;
        case ";":
          i = 256;
          break;
        }
        }



     if(i == 0){
	sum = data[i];
	System.out.print("現在の合計値：" + data[i] + "\n");
     }else{
        System.out.print("現在の合計値：" + sum + "\n");
     }

     System.out.print("次の作業を入力してください\n");
     command[i] = new java.util.Scanner(System.in).nextLine();
     
      i++;
    }
  
  }
}
