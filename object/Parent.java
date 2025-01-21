package lang.object;

// 부모가 없으면 묵시적으로 object 클래스를 상속받는다.

// 아래 코드는 다음 코드와 같다.
// public class Parent extends Object
public class Parent {

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
