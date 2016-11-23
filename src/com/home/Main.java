package com.home;

import com.pattern.adapter.Adapter;
import com.pattern.adapter.Target;
import com.pattern.factory_method.*;
import com.pattern.prototype.ConcretePrototype;
import com.pattern.prototype.Prototype;
import com.pattern.singleton.Singleton;

import com.pattern.state.GetState;
import com.pattern.state.Request;

import com.pattern.abstract_factory.AbstractFactory;
import com.pattern.abstract_factory.ConcreteFactory1;
import com.pattern.abstract_factory.ConcreteFactory2;
import com.pattern.abstract_factory.AbstractProductA;
import com.pattern.abstract_factory.AbstractProductB;

import com.pattern.builder.Builder;
import com.pattern.builder.BuilderA;
import com.pattern.builder.Director;
import com.pattern.builder.BuilderB;

public class Main {

    /**
     * @desc
     * 1 开闭原则 － 对扩展开放，对修改关闭
     * 2 里氏替换原则 － 任何基类出现的地方，子类一定可以出现
     * 3 依赖倒转原则 － 对接口编程，依赖于抽象而不是具体
     * 4 接口隔离原则 － 使用多个隔离的接口比使用单个接口更好
     * 5 迪米特原则（最少知识原则） － 一个实体应当尽量少与其他实体之间发生作用，使得系统功能模块相对独立
     * 6 合成复用原则 － 原则是尽量使用合成｜聚合的方式，而不是使用继承
     @param
     */

    public static void main(String[] args) {

        /**
         * 单例模式
         * 保证类只有一个实例，并提供一个访问它的全局访问点
         * 适用性
         *   当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时
         *   当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时
         */
        System.out.println("----- singleton pattern -----");
        Singleton singleton = Singleton.getInstance();
        System.out.print(singleton.toString());

        /**
         * 状态模式
         * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类
         * 适用性
         *   一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为
         *   一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。这个状态通常用一个或多个枚举常量表示。
         *   通常，有多个操作包含这一相同的条件结构。State模式将每一个条件分支放入一个独立的类中。这使得你可以根据对象
         *   自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化。
         */
        System.out.println("----- state pattern -----");
        Request request = new Request(new GetState());
        request.Start();
        request.Start();
        request.Start();

        /**
         * 抽象工厂
         * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类（里氏替换原则）
         * 适用性
         *   一个系统要独立于它的产品的创建、组合和表示时
         *   一个系统要由多个产品系列中的一个来配置时
         *   当你要强调一系列相关的产品对象的设计以便进行联合使用时
         *   当你提供一个产品类库，而只想显示它们的接口而不是实现时
         */
        System.out.println("---- abstract factory pattern ----");
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA1 = factory1.CreateProductA();
        AbstractProductA productA2 = factory2.CreateProductA();
        AbstractProductB productB1 = factory1.CreateProductB();
        AbstractProductB productB2 = factory2.CreateProductB();
        productA1.display();
        productA2.display();
        productB1.display();
        productB2.display();

        /**
         * 建造者模式
         * 将一个复杂对象的创建与表示分离，使得同样的构建过程可以创建不同的表示（依赖倒转）
         * 适用性
         *   当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时
         *   当构造过程必须允许被构造的对象有不同的表示时
         */
        System.out.println("----- builder pattern ------");
        Builder builder = new BuilderA();
        Director director = new Director(builder);
        director.BuildFood();

        builder = new BuilderB();
        director = new Director(builder);
        director.BuildFood();

        /**
         * 工厂方法模式
         * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
         * 适用性
         *   当一个类不知道它所必须创建的对象的类的时候
         *   当一个类希望由它的子类来指定它所创建的对象的时候
         *   当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候
         */
        System.out.println("----- factory method pattern -----");
        System.out.println("抽象类实现方式");
        DBFactory creator = new MongoDBFactory();
        Database db = creator.CreateDB();
        db.display();
        creator = new MysqlDBFactory();
        db = creator.CreateDB();
        db.display();

        System.out.println("接口与泛型反射实现方式");
        PenFactory pen_factory = new ConcretePenFactory();
        Pen pencil = pen_factory.createPen(Pencil.class);
        Pen brush = pen_factory.createPen(Brush.class);
        pencil.display();
        brush.display();

        /**
         * 原型模式
         * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
         * 适用性
         *   当一个系统应该独立于它的产品创建、构成和表示时，要使用Prototype模式
         *   当要实例化的类是在运行时刻指定时，例如，通过动态装载
         *   为了避免创建一个与产品类层次平行的工厂类层次时
         *   当一个类的实例只能有几个不同状态组合中一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
         */
        System.out.println("----- prototype pattern -----");
        Prototype proto1 = new ConcretePrototype("proto 1");
        Prototype proto2 = (Prototype)proto1.clone();
        proto1.getName();
        proto2.getName();

        /**
         * 适配器模式
         * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
         * 适用性
         *   你想使用一个已经存在的类，而它的接口不符合你的需求
         *   你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口可能不一定兼容的类）协同工作
         *   （仅适用于对象Adapter）你想使用一些已经存在的子类，但是不可能对每一个都进行子类化以匹配它们的接口。对象适配器可以适配它的父类接口
         */
        System.out.println("----- adapter pattern -----");
        Target target = new Adapter();
        target.Request1();
        target.Request2();
    }
}
