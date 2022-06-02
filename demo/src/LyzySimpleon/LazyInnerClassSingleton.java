package LyzySimpleon;

public class LazyInnerClassSingleton {
    //解决饿懒汉单例模式内存浪费和synchronized性能问题

    //使用LazyInnerClassSingleton的时候，默认会初始化内部类
    //如果没使用，内部类是不加载的

    private LazyInnerClassSingleton(){
    }

    //每一个关键字都不多余，static使单例空间共享，保证这个方法不会被重写、重载
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final  LazyInnerClassSingleton LAZY=new LazyInnerClassSingleton();
    }
}
