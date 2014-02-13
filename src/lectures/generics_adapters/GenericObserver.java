package lectures.generics_adapters;
public interface GenericObserver<Observable> {
	public void update(Observable anObservable);
}
