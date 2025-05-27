package TestingShastra;

public class StringBse {
    public static void main(String[] args) {
        String str = "aadhiandjava";
//        String ressult = str.replace("a", "");
//        System.out.println(ressult);
        StringBuilder res = new StringBuilder();
        
        for (char ch : str.toCharArray()){
            if (ch !='a'){
                res.append(ch);
            }
        }
        System.out.println(res);
    }
}
