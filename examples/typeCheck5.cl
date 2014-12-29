Class A {};
Class B inherits A {
    a : Int;
    b : String;
    c : SELF_TYPE;
};
Class C inherits B {

    k : A;

    a(d:String):String{
        case d of
        	 a : A => a;
        esac
    };

    method5(num : Int) : E {  -- factorial
          (let x : Int <- 1 in
    	 {
    	    (let y : Int <- 1 in
    	       while y <= num loop
    	          {
                     x <- x * y;
    	             y <- y + 1;
    	          }
    	       pool
    	    );
    	    (new E).set_var(x);
    	 }
          )
       };
};
Class D inherits A {};
Class E {};
Class F inherits E {};
Class Main {
    main() : Object{1};
};