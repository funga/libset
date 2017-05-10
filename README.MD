> 本着不重复造轮子的思想，本项目收集牛逼哄哄的第三方类库。通过示例来论证相关类库确实够牛逼，我们在项目中可以直接使用。

#### Google Guava

Guava 是一个 Google 的基于java1.6的类库集合的扩展项目，包括 *collections*, *caching*, *primitives support*, *concurrency libraries*, *common annotations*, *string processing*, *I/O*, 等等. 这些高质量的 API 可以使你的JAVa代码更加优雅，更加简洁，让你工作更加轻松愉悦。

**源码包的简单说明：**

- `com.google.common.annotations`：普通注解类型。
- `com.google.common.base`：基本工具类库和接口。
- `com.google.common.cache`：缓存工具包，非常简单易用且功能强大的JVM内缓存。
- `com.google.common.collect`：带泛型的集合接口扩展和实现，以及工具类，这里你会发现很多好玩的集合。
- `com.google.common.eventbus`：发布订阅风格的事件总线。
- `com.google.common.hash`： 哈希工具包。
- `com.google.common.io`：I/O工具包。
- `com.google.common.math`：原始算术类型和超大数的运算工具包。
- `com.google.common.net`：网络工具包。
- `com.google.common.primitives`：八种原始类型和无符号类型的静态工具包。
- `com.google.common.reflect`：反射工具包。
- `com.google.common.util.concurrent`：多线程工具包。

**Guava Maven**

```
    <dependency>
        <groupId>com.google.guava</groupId>
        <artifactId>guava</artifactId>
        <version>21.0</version>
    </dependency>
```

相关示例代码见`cn.funga.libset.guava`包。



