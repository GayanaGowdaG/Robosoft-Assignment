package sept05;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> object = (a) -> 5 + 9;
		System.out.println("Sum:" + object.apply(8));
	}

}
