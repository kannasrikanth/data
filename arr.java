import java.lang.*;
public class arr 
{ 
	//private staticTest monitor = newTest(); 
	
	public static void main(String[] args) 
	{ 
		// Arrays of objects:
		
		int[] a; // Local uninitialized variable
		int[] b = new int[5]; // Null references
		int[] c = new int[4]; 
	for(int i = 0; i < c.length; i++) 
			if(c[i] == null) // Can test for null reference
			{
				c[i] = new int();
				System.out.println("nullable object\n");
 			}
		// Aggregate initialization:
		int[] d = {new int(), new int(), new int() }; 
		// Dynamic aggregate initialization:
		a = new int[] { new int(), new int() };
 
		System.out.println("a.length="+ a.length); 
		System.out.println("b.length = "+ b.length); 

		// The references inside the array are
		// automatically initialized to null:
		for(int i = 0; i < b.length; i++) 
			System.out.println("b["+ i + "]="+ b[i]); 
			System.out.println("c.length = "+ c.length); 
			System.out.println("d.length = "+ d.length); 
		a = d; 
		System.out.println("a.length = "+ a.length); 

		// Arrays of primitives:
		int[] e; // Null reference
		int[] f = new int[5]; 
		int[] g = new int[4]; 
		
		for(int i = 0; i < g.length; i++) 
		g[i] = i*i; 
		int[] h = { 11, 47, 93 }; 

		// Compile error: variable e not initialized:
		//!System.out.println("e.length=" + e.length);
		System.out.println("f.length = "+ f.length); 
		// The primitives inside the array are
		// automatically initialized to zero:
		
		for(int i = 0; i < f.length; i++) 
		System.out.println("f["+ i + "]="+ f[i]); 
		System.out.println("g.length = "+ g.length); 
		System.out.println("h.length = "+ h.length); 
		e = h; 
		System.out.println("e.length = "+ e.length); 
		e = new int[] { 1, 2 }; 
		System.out.println("e.length = "+ e.length); 
		//monitor.expect(newString[] {"a.length=2", "b.length = 5", "b[0]=null", "b[1]=null", "b[2]=null", "b[3]=null", "b[4]=null", "c.length = 4", "d.length = 3", "a.length = 3", "f.length = 5", "f[0]=0", "f[1]=0", "f[2]=0", "f[3]=0", "f[4]=0", "g.length = 4", "h.length = 3", "e.length = 3", "e.length = 2"}); 
} 
}
