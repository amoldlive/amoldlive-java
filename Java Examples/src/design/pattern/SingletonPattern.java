package design.pattern;

final class SingleTone {

	private static volatile SingleTone _instance;

	private SingleTone() {
	}

	public static SingleTone getInstance() {

		if (null == _instance) {
			synchronized (SingleTone.class) {
				if (null == _instance)
					_instance = new SingleTone();
			}
		}
		return _instance;
	}

}

public class SingletonPattern {
	public static void main(String[] args) {

		SingleTone s1 = SingleTone.getInstance();
		SingleTone s2 = SingleTone.getInstance();
		SingleTone s3 = SingleTone.getInstance();
		System.out.println(s1 + "  " + s2 + "   " + s3);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
	}
}
