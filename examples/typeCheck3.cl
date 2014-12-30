Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
};
Class C inherits B {

    k : A;
    o : Object;
    a(b:Bool, d:String):Object{
        o <- iF((((not b)))) THEN d.substr(1,1) else d fi     -- replace d with d &
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};