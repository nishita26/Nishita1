package thirteen_may;

public class StoreAndFetch<T> {
	
	private T t;
	
	public void store(T t) {
		this.t=t;
	}
	
	public T fetch() {
		return t;
	}

	public static void main(String[] args) {
	
		StoreAndFetch<String> sfs1=new StoreAndFetch<String>();
		StoreAndFetch<String> sfs2=new StoreAndFetch<String>();
		StoreAndFetch<Integer> ifs=new StoreAndFetch<Integer>();
		
		sfs1.store(new String("I am Nishita Mehta"));
		sfs2.store(new String("My roll no is"));
		ifs.store(new Integer(35));
		
		System.out.print(sfs1.fetch()+"\n"+sfs2.fetch()+" "+ifs.fetch());
		
	}

}
