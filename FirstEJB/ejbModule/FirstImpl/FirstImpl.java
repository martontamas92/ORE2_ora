package FirstImpl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import ejb_interface.First;
@Stateless(name="first")
@Remote(First.class)
public class FirstImpl implements First{

	@Override
	public int f(int value) {
		return value*2;
	}

}
