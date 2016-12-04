package com.home;

import com.pattern.adapter.Adapter;
import com.pattern.adapter.Target;
import com.pattern.bridge.Abstraction;
import com.pattern.bridge.ConcreteImplementorA;
import com.pattern.bridge.ConcreteImplementorB;
import com.pattern.bridge.RefinedAbstraction;
import com.pattern.composite.Composite;
import com.pattern.composite.Leaf;
import com.pattern.decorator.Component;
import com.pattern.decorator.ConcreteComponent;
import com.pattern.decorator.ConcreteDecorator;
import com.pattern.decorator.Decorator;
import com.pattern.facade.Facade;
import com.pattern.factory_method.*;
import com.pattern.flyweight.FlyweightFactory;
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

        /**
         * 桥接模式
         * 将抽象部分与它的实现部分分离，使它们都可以独立地变化
         * 适用性
         *   你不希望在抽象和它的实现部分之间有一个固定的绑定关系，例如这种情况可能是因为在程序运行时刻实现部分应可以被选择或者切换。
         *   类的抽象以及它的实现都应该可以通过生成子类的方法加以扩充，这时Bridge模式使你可以对不同的抽象接口和实现部分进行组合，并分别对它们进行扩充。
         *   对一个抽象的实现部分的修改应对客户不产生影响，即客户的代码不必重新编译。
         *   （C++）你想对客户完全隐藏抽象的实现部分。在C++中， 类的表示在类接口中是可见的。
         *   正如在意图一节的第一个类图中所示的那样，在许多类要生成。这样一种类层次结构说明你必须将一个对象分解成两个部分。
         *   你想在多个对象间共享实现（可能使用引用计数），但同时要求客户并不知道这一点。
         */
        System.out.println("----- bridge pattern -----");
        Abstraction bridge = new RefinedAbstraction();
        bridge.SetImplementor(new ConcreteImplementorA());
        bridge.implementor.display();
        bridge.SetImplementor(new ConcreteImplementorB());
        bridge.implementor.display();

        /**
         * 组合模式
         * 将对象组合成树形以表示“部分-整体”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性
         * 适用性
         *   你想表示对象的部分-整体层次结构
         *   你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象
         */
        System.out.println("----- Composite pattern -----");
        Composite pRoot = new Composite("pRoot");
        pRoot.Add(new Leaf("leafRoot"));
        Leaf pLeaf1 = new Leaf("pLeaf1");
        Leaf pLeaf2 = new Leaf("pLeaf2");
        pLeaf1.Add(pLeaf2);
        pLeaf1.Remove(pLeaf2);

        Composite pCom = new Composite("pCom");
        pCom.Add(pLeaf1);
        pCom.Add(pLeaf2);
        pCom.Operation();
        pRoot.Add(pCom);
        pRoot.GetChild(0);
        pRoot.Operation();

        /**
         * 装饰模式
         * 动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活
         * 适用性
         * 在不影响其他对象的情况下，以动态透明的方式给单个对象添加职责
         * 处理那些可以撤消的职责
         * 当不能采用生成子类的方法进行扩充时。一种情况是，可能有大量独立的扩展，为支持每一种组合将产生大量的子类，
         * 使得子类数目呈爆炸性增长。另一种情况可能是因为类定义被隐藏，或 类定义不能用于生成子类。
         */
        System.out.println("----- decorator pattern -----");
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.display();

        /**
         * 外观模式
         * 为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
         * 适用性
         *   当你要为一个复杂子系统提供一个简单接口时。子系统往往因为不断深化而变得越来越复杂。大多数模式使用时都会产生
         *   更多更小的类。这使得子系统更具可重用性，也更容易对子系统进行定制，但这也给那些不需要定制子系统的用户带来一
         *   些使用上的困难。Facade可以提供一个简单的缺省视图，这一视图对大多数用户来说已经足够，而那些需要更多的可定制
         *   的用户可以越过Facade层。
         *   客户程序与抽象类的实现部分之间存在着很大的依赖性。引入Facade将这个子系统与客户以及其他的子系统分离，可以提高
         *   子系统的独立性和可移植性。
         *   当你需要构建一个层次结构的子系统时，使用facade模式定义子系统中每层的入口点。如果子系统之间是相互依赖的，你可以
         *   让它们仅通过facade进行通讯，从而简化了它们之间的依赖关系。
         */
        System.out.println("----- facade pattern -----");
        Facade.method1();
        Facade.method2();

        /**
         * 享元模式
         * 运用共享技术有效地支持大量细粒度的对象
         * 适用性
         *   一个应用程序使用了大量的对象
         *   完全由于使用大量的对象，造成很大的存储开销
         *   对象的大多数状态都可变为外部状态
         *   如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象
         *   应用程序不依赖对象标识。由于Flyweight对象可以被共享，对于概念上明显有别的对象，标识测试将返回真值
         */
        System.out.println("----- flyweight pattern -----");
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight("A");
        flyweightFactory.getFlyweight("B");
        flyweightFactory.getFlyweight("B");
        System.out.println("size: " + flyweightFactory.getSize());
    }
}
