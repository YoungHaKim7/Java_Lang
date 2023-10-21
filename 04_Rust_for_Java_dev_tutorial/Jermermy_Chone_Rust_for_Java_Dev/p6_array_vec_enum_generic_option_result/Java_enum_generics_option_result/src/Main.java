import java.util.Optional;

enum Activity {
	Sleeping,
	Skiing,
	Coding,
}

class Foo {
}

class Foonull {
}

class Activity02 {
}

class Sleeping02 extends Activity02 {
	public int hours;

	public Sleeping02(int hours) {
		this.hours = hours;
	}
}

class Skiing02 extends Activity02 {
	public String resort;

	Skiing02(String resort) {
		this.resort = resort;
	}
}

class Coding02 extends Activity02 {
}

class Container<T extends Comparable<T>> {
	T item;

	Container(T item) {
		this.item = item;
	}

	int compareItem(T otherItem) {
		return item.compareTo(otherItem);
	}
}

public class Main {
	public static void main(String[] args) {
		// 4) enum
		Activity activity_now = Activity.Coding;
		switch (activity_now) {

			case Sleeping:
				System.out.println("Wake up!");
				break;
			case Skiing:
				System.out.println("Awesome!!");
				break;
			case Coding:
				System.out.println("Hopefully in Java!");
				break;
		}
		Activity02 activity_now02 = new Sleeping02(9);
		if (activity_now02 instanceof Sleeping02) {
			Sleeping02 sl = (Sleeping02) activity_now02;
			System.out.println("Wake up!" + sl.hours);
		} else if (activity_now02 instanceof Skiing02) {
			Skiing02 sk = (Skiing02) activity_now02;
			System.out.println("Awesome!!" + sk.resort);
		} else if (activity_now02 instanceof Coding02) {
			System.out.println("Hopefully in Java!");
		} else {
			System.out.println("unknown");
		}

		// message(4)enum
		String message;
		if (activity_now02 instanceof Sleeping02) {
			Sleeping02 sl = (Sleeping02) activity_now02;
			message = "Wake up! " + sl.hours;
		} else if (activity_now02 instanceof Skiing02) {
			Skiing02 sk = (Skiing02) activity_now02;
			message = "Awesome!! " + sk.resort;
		} else if (activity_now02 instanceof Coding02) {
			message = "Hopefully in Java!";
		} else {
			message = "unknown";
		}
		System.out.println(message);

		System.out.println("-------");
		System.out.println(" Generics");

		// 5) Generics
		Container<Integer> c1 = new Container<Integer>(123);
		Container<String> c2 = new Container<String>("Hello");

		System.out.println("compare 1: " + c1.compareItem(1));
		System.out.println("compare 2: " + c2.compareItem("zzz"));
		System.out.println("compare 3: " + Main.compare(222, 111));

		// Option (v. s. Null, ~Optional)
		Foonull foo_null = null;
		System.out.println("null" + foo_null);
		// Foo foo = new Foo();
		// import optional
		// Optional<Foo> foo = Optional.of(new Foo());
		Optional<Foo> foo = Optional.empty();
		System.out.println("foo: " + foo);

		// 7) Result (v.s. Exception)
		// int result = Main.floorDivide(10, 0); // 값이 max 값 나온다.
		try {
			int result = Main.floorDivide(10, 4);
			System.out.println("result: " + result);
		} catch (Exception ex) {
			System.out.println("ERROR CAUGHT - " + ex);
		}
	}

	// 5)generic -- compare
	public static <T extends Comparable<T>> int compare(T a, T b) {
		return a.compareTo(b);
	}

	// 7) Result
	public static int floorDivide(float num, float by) {
		if (by == 0) {
			throw new RuntimeException("Cannot divide by 0");
		}
		return (int) Math.floor(num / by);
	}
}
