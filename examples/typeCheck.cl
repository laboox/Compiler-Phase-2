Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
};
Class C inherits B {

    k : A;

    a(d:String):Int{
        case d of
        	 a : A => a + 2;
        esac
    };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};