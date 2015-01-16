/*
 * Copyright (c) 1998, 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * 本包提供Java编程语言设计的基础类，Object和Class是最重要的两个类。
 * Object类是类层次结构树的根，Class实例表示正在运行的Java应用程序的类和接口。
 * 
 * <p>使用对象表示基本数据类型的值是有必要的，包装器类(wrapper classes)就为这个目标服务。
 * 常用的包装器类有Integer、Long。例如，一个Integer类型的对象通过包含一个int类型的字段来表示值，
 * 这样它就可以被存储在一个引用类型的变量中。
 * 这些类还提供在基本类型之间转换的一些方法，同时还支持如equals和hashCode这样的标准方法。
 * 
 * <p>Math类提供常用的数学函数。
 * String、StringBuffer和StringBuilder类相似地提供字符串的常用操作。
 * 
 * <p>ClassLoader、Process、ProcessBuilder、Runtime、SecurityManager和System类
 * 提供"系统操作"，用来管理类型(classes)的动态加载、外部进程的创建、主机环境的查询和
 * 安全策略的执行。
 * 
 * <p>Throwable类封装了可能被throw语句抛出的对象，
 * Throwable子类可以表示错误(errors)和异常(exceptions)。
 * 
 * <h3>字符编码</h3>
 * 
 * Charset类的规范描述字符编码的命名规范和一组标准的编码。
 * 
 * <p><p>Provides classes that are fundamental to the design of the Java
 * programming language. The most important classes are {@code
 * Object}, which is the root of the class hierarchy, and {@code
 * Class}, instances of which represent classes at run time.
 *
 * <p>Frequently it is necessary to represent a value of primitive
 * type as if it were an object. The wrapper classes {@code Boolean},
 * {@code Character}, {@code Integer}, {@code Long}, {@code Float},
 * and {@code Double} serve this purpose.  An object of type {@code
 * Double}, for example, contains a field whose type is double,
 * representing that value in such a way that a reference to it can be
 * stored in a variable of reference type.  These classes also provide
 * a number of methods for converting among primitive values, as well
 * as supporting such standard methods as equals and hashCode.  The
 * {@code Void} class is a non-instantiable class that holds a
 * reference to a {@code Class} object representing the type void.
 *
 * <p>The class {@code Math} provides commonly used mathematical
 * functions such as sine, cosine, and square root. The classes {@code
 * String}, {@code StringBuffer}, and {@code StringBuilder} similarly
 * provide commonly used operations on character strings.
 *
 * <p>Classes {@code ClassLoader}, {@code Process}, {@code
 * ProcessBuilder}, {@code Runtime}, {@code SecurityManager}, and
 * {@code System} provide "system operations" that manage the dynamic
 * loading of classes, creation of external processes, host
 * environment inquiries such as the time of day, and enforcement of
 * security policies.
 *
 * <p>Class {@code Throwable} encompasses objects that may be thrown
 * by the {@code throw} statement. Subclasses of {@code Throwable}
 * represent errors and exceptions.
 *
 * <a name="charenc"></a>
 * <h3>Character Encodings</h3>
 *
 * The specification of the {@link java.nio.charset.Charset
 * java.nio.charset.Charset} class describes the naming conventions
 * for character encodings as well as the set of standard encodings
 * that must be supported by every implementation of the Java
 * platform.
 *
 * @since JDK1.0
 */
package java.lang;
