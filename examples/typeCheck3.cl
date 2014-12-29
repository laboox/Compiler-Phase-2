Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
};
Class C inherits B {

    k : A;
    o : Object;
    a(b:Bool, d:String):String{
        o <- iF((((~d)))) THEN b + d else o fi     -- replace d with d &
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};