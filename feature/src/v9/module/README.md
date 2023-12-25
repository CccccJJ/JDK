1. module-info.java
2. requires、opens、exports 指令
   1. open module: 表示模块内的所有包都允许通过 Java 反射访问
   2. requires [transitive] <module>：声明一个依赖；加上 transitive 表示传递依赖。A 依赖 B，B 依赖 C，即 A 依赖 C
   3. exports [to]：导出模块内的包，如果需要定向到处，可以使用 to 关键字
   4. opens <package> [to <module1>[, <module2>...]]: 开放模块内的包（允许通过 Java 反射访问）；定向开放使用 `to` 关键字
   5. provides <interface | abstract class> with <class1>[, <class2> ...]：声明模块提供的 Java SPI 服务，一个可以声明多个服务实现类
   6. uses <interface | abstract class>: 声明模块依赖的 Java SPI 服务，加上后模块内就可以通过 `ServiceLoader.load(Class)` 一次性加载所声明的 SPI 服务的所有实现类
3. open、opens 支持在运行时反射调用
4. requires、exports 是一对支持导入和导出调用
5. providers、uses 是一对支持 Java SPI 调用

具体代码查看 jmods 文件夹下模块