Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
};
Class C inherits B {
    a(a:Int, d:String):String{
        let d : String , a : String in d + a + w
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};