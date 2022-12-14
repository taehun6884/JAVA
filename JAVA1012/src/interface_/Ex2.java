package interface_;

public class Ex2 {

	public static void main(String[] args) {
		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
		
		동물 동물 = 고래상어;
		동물.번식();

	}

}

// 고래와 상어의 특징을 추상화하여 동물 인터페이스로 정의
interface 동물 {
	// 인터페이스 내의 모든 메서든 추상메서드
	public abstract void 번식();
}

// 헤엄칠수 있는 특징을 갖는 인터페이스 '헤엄칠수있는' 정의
interface 헤엄칠수있는 {}

// 동물 인터페이스와 헤엄칠수있는 인터페이스를 상속받는 서브인터페이스 고래, 상어 정의
// => 인터페이스끼리의 상속은 implements 가 아닌 extends 사용
// => 인터페이스끼리의 상속은 다중 상속도 지원 가능
interface 고래 extends 동물, 헤엄칠수있는 {}
interface 상어 extends 동물, 헤엄칠수있는 {}

// 고래와 상어 인터페이스를 동시에 상속받아 구현하는 서브클래스 고래상어 정의
// => 클래스에서 인터페이스를 상속(구현)받을 경우 implements 키워드를 사용하며
//    반드시 인터페이스가 가진 추상메서드를 오버라이딩하여 구현해야 한다!
// => 또한, 복수개의 인터페이스를 상속받을 수 있다.

class 고래상어 implements 고래, 상어 {
	
	// 인터페이스 내에서는 슈퍼클래스(인터페이스) 모든 메서드가 추상메서드이므로
	// 중복되는 메서드에 대한 구별없이 직접 구현하면 되기 때문에
	// 중복된 메서드로 인한 혼란이 없음(= 다이아몬드 상속에서의 문제점이 사라짐)
	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식!");
	}
}








