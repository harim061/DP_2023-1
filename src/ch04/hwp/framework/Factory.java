package ch04.hwp.framework;

public abstract class Factory {

    public final Product create(String modelName) {
        Product c = createProduct(modelName);
        registerProduct(c);
        return c;
    }

    protected abstract Product createProduct(String modelName);

    protected abstract void registerProduct(Product product);

}
