import java.util.*;

class Main{

   public ArrayList<String>  Soution (int n, String[] str){
       ArrayList<String> answer= new ArrayList<>();
//       for (String x :str){
//
//           //StringBuilder를 만들면 새로운 객체를 만들지 않고서 처리 가능
//           String temp =new StringBuilder(x).reverse().toString();
//           answer.add(temp);
//
//       }

       for (String x : str){

           char[] s = x.toCharArray();
//           System.out.println(s[0]);
           int pt1=0;
           int pt2=x.length()-1;

           while(pt1<pt2){
               char temp=s[pt1];
               s[pt1]=s[pt2];
               s[pt2]=temp;
               pt1++;
               pt2--;
           }
           String Reversed=String.valueOf(s);
           answer.add(Reversed);
       }

       return answer;
   }




public static void main(String[]args) {

    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] str = new String[n];

    //배열에 하나씩 넣음
    for (int i = 0; i < n; i++) {

        str[i] = kb.next();
    }

    for (String x: T.Soution(n,str)){
        System.out.println(x);

    }


   }
}
