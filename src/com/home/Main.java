package com.home;

import com.pattern.singleton.Singleton;
import com.pattern.state.GetState;
import com.pattern.state.Request;

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
    }
}
