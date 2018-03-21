import java.util.List;

public class NestedIntegerImpl implements NestedInteger {

	@Override
	public boolean isInteger() {
		if (this.getList() == null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Integer getInteger() {
		/*Integer sum = 0;
		for(Integer i:this.getList() ){
			sum = sum+i;
		}*/
		return null;
	}

	@Override
	public List<NestedInteger> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
