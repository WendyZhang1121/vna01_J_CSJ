import java.util.concurrent.atomic.AtomicReference;

final class Foo {
	private final AtomicReference<Helper> helperRef =new AtomicReference<Helper>();
	public Helper getHelper() { 
		return helperRef.get();
	}
	public void setHelper(int num) { 
		helperRef.set(new Helper(num));
	} 
	}
