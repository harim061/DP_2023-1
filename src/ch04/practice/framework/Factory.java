package ch04.practice.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 실제로 어떤 제품(객체)를 생성할지는 자식에게 맡김
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
