package ex4;

import java.util.Set;

public class SetType implements SetInter {

	private Set<Integer> set;

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	@Override
	public Set<Integer> getSet() {
		// TODO Auto-generated method stub
		return set;
	}

}
