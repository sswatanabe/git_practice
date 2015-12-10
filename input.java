/**
* date:12/8
* purpose:practice
* producer:sho
*/
public class input {
  public static void main(String arg[]) {
    System.out.println("名前を入力して");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("年齢を入力して");
    String age = new java.util.Scanner(System.in).nextLine();
    boolean j = true;

    try{
	Integer.parseInt(age);
    }catch(NumberFormatException e){
	j = false;
    }
  
    if(j == true) {
    	System.out.println("ようこそ" + age + "歳の" + name + "さん");
    }else{
	System.out.println("年齢の入力が間違っています");
    }
  }
}

