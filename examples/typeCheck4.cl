Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
    integer (a:Int, b:Int, c:Int, d:Int): Int{
        1
    };
};
Class C inherits B {

    k : A;

    a(i:Int, j:Int, k:Int, f:Int):Object{
        let b:Bool, s:Int in while (  s <= 2+3) loop 1 pool --true check
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};