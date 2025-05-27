package TestingShastra;

public class MemoryManagement {
    public static void main(String[] args) {
        int primitiveVariable=10;
        Person personObj = new Person();
        String stringliteral ="24";
        MemoryManagement memObj = new MemoryManagement();
        memObj.memoryManagementTest(personObj);
       
    }
    private void   memoryManagementTest(Person personObj){
        Person personobj2 = personObj;
        String stribngliteral ="24";
        String stringLiteral3 = new String("24");
    }
}
