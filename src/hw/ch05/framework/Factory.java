package hw.ch05.framework;

public abstract class Factory {
    // 제푼 생산 시 하는 큰 흐름

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
