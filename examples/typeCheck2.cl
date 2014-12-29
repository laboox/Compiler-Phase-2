Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
    m1(r:A, e:String):C{
        1
    };
};
Class C inherits B {

    k : B;

    a(d:String):String{
        k <- c.m1(k,e + d)
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1} ;
};