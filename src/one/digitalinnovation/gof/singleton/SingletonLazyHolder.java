package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author falvojr
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder() {
        super();
    }
    
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public String toString() {
        return "Instância do SingletonLazyHolder: " + this.hashCode();
    }
}
