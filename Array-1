/*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1*/ 

public int start1(int[] a, int[] b) {
  if (a.length > 0 && b.length > 0) {
      if (a[0] == 1 && b[0] == 1) return 2; 
      else if (a[0] == 1 && b[0] != 1) return 1; 
      else if (a[0] != 1 && b[0] == 1) return 1; 
  }
  
  else if (a.length > 0 && !(b.length > 0)){
    if(a[0] == 1) return 1;
  }
  
   else if (b.length > 0 && !(a.length > 0)){
    if(b[0] == 1) return 1;
  }
  
  return 0; 
}
