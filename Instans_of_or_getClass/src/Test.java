public class Test {
    public static void main(String[] args) {
        MyChildObject child = new MyChildObject();//Create the instance of an ancestor
        child.setField("str1");//Set a value of a parental class field = "str1"
        child.setV1(true);//set childClass field V1= true

        MyObject my = new MyObject();// create an instance of parental class
        my.setField("str1");// set field = "str1"

        /*
        child's fields: field = "str1";
                        V1= true;
        my's  fields: field = "str1";
         */

        System.out.println("my.equals(child) = " + my.equals(child));
        System.out.println("child.equals(my) = " + child.equals(my));
    }
}
