package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog =new Dog();
        Car car =new Car();

        action(dog);
        action(car);
    }

    public static void action(Object obj){
        //Object는 모든 객체의 부모다 따라서 어떤 객체든지 인자로 전달할 수 있다.

     //   obj.move(); 불가능, 컴파일 오류, Object는 sound()가 없다.
    //    obj.sound();
        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog){
            dog.sound();

            // Dog 인스턴스의 sound()를 호출하려면 다음과 같이 다운캐스팅을 해야한다.

        } else if (obj instanceof Car car) {
            car.move();

        }

    }
}
