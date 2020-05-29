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

/* Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]   */ 
public int[] biggerTwo(int[] a, int[] b) {

  int aSum = a[0] + a[1]; 
  int bSum = b[0] + b[1]; 
  
  return (aSum >= bSum) ? a : b;   
  
}

/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]*/
public int[] makeMiddle(int[] nums) {
  
  int[] newArray = new int[2]; 
  
  if(nums.length == 2){
    newArray = nums; 
  }
  
  else if (nums.length > 2){
    newArray[0] = nums[(nums.length/2)-1]; 
    newArray[1] = nums[nums.length/2];
  }
  
  return newArray; 
  
}

/*Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]*/
public int[] plusTwo(int[] a, int[] b) {
  
  int [] newArray = {a[0], a[1], b[0], b[1]};
  return newArray;
  
}

/*Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8] */
public int[] swapEnds(int[] nums) {
  
  int temp = nums[0]; 
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp;
  
  return nums; 
  
}
