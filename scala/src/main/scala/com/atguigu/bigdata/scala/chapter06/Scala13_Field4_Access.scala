package com.atguigu.bigdata.scala.chapter06

object Scala13_Field4_Access {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 访问权限
        /*

        Java : 4种访问权限

        private   : 私有权限，  同类
        (default) : 包权限，    同类，同包
        protected : 受保护权限，同类，同包，子类
        public    : 公共权限，  任意的地方

        Scala : 4种访问权限

        private        : 私有权限    同类
        private[包名]  : 包私有权限，同类，同包
        protected      : 受保护权限，同类，子类
        (default)      : 公共权限，  任意的地方, scala中没有public关键字
         */

    }
    // 内部类
    class User {
        var name : String = _

    }
}

