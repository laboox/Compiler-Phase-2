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

    a(i:Int, j:Int, k:Int, f:Int):Int{
        let b:Bool, s:String in while ( b <= integer(i,i,k,f)+a(i,a,j,f)-2+3<=s = trUe) loop 1 pool --true check
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};