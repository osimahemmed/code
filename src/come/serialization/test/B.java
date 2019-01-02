package come.serialization.test;

import java.io.Serializable;

class B extends A implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3971233093196422363L;
	int j;
     
    // parameterized constructor
    public B(int i,int j) 
    {
        super(i);
        this.j = j;
    }
}
