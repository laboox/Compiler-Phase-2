Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
    m1(r:A, e:String):C{
        new C
    };
};
Class C inherits B {

    k : B;

    a(d:Int):String{
        k <- c.m1(k,1 + d)
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1} ;
};