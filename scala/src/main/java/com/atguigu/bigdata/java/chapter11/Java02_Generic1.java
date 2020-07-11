package com.atguigu.bigdata.java.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Java02_Generic1 {
    public static void main(String[] args) {

        // TODO 泛型

        // TODO 泛型不可变
        //AAA<User> aaa1 = new AAA<Parent>();
        AAA<User> aaa2 = new AAA<User>();
        //AAA<User> aaa3 = new AAA<SubUser>();
        //AAA<User> aaa4 = new AAA<Emp>();

        //System.out.println(aaa1);

        // TODO 泛型的上限，下限
        BBB bbb = new BBB();

        List<Parent> parentList = new ArrayList<Parent>();
        List<User> userList = new ArrayList<User>();
        List<SubUser> subUserList = new ArrayList<SubUser>();
        List<Emp> empList = new ArrayList<Emp>();

        //bbb.extendsTest(parentList); // error
        //bbb.extendsTest(userList); // ok
        //bbb.extendsTest(subUserList); //ok
        //bbb.extendsTest(empList); // error

       // bbb.superTest(parentList); // ok
        //bbb.superTest(userList); //ok
       // bbb.superTest(subUserList); // error
        //bbb.superTest(empList); //error

        // TODO 泛型上限，下限使用的场景

        // TODO 上限一般用于对获取的数据进行限定
        CCC<User> ccc1 = new CCC<User>();
        Message<? extends User> consume = ccc1.consume();
        // subUser, subsubUser.
        User t = consume.t;

        // TODO 下限一般用于插入数据的类型限定
        DDD<User> ddd = new DDD<User>();
        ddd.produce(new Message<User>());
        ddd.produce(new Message<Parent>());

    }
}
class Message<T> {
    public T t;
}
class CCC<T> {
    public Message<? extends T> consume() {
        return null;
    }
}
class DDD<T> {
    public void produce(  Message< ? super T > m ) {

    }
}

class AAA<T> {

}
class BBB {
    // TODO 泛型的上限
    public void extendsTest( List<? extends User> list ) {

    }
    // TODO 泛型的下限
    public void superTest( List<? super User> list  ) {

    }
}
class Parent {

}
class User extends Parent {

}
class SubUser extends User {

}
class Emp {

}
