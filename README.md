# 设计模式

## 代理模式

### 静态代理

代码在

**优点**

1、在不修改目标对象功能的前提下，能通过代理对象对目标功能扩展

**缺点**

1、因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类

2、一旦接口增加方法，目标对象与代理对象都要维护

### 动态代理