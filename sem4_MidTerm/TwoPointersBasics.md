Two Pointer ek technique hai jo mostly arrays aur strings ke questions 
solve karne ke liye use hoti hai. Isme hum ek ke badle do pointers (indexes) use karte hain. 
Isse time complexity kam ho jati hai aur code efficient ho jata hai.


1. Pointer kya hota hai

Pointer simple language me array ka index hota hai jo kisi position ko point karta hai.

Example array:

arr = [2, 4, 6, 8, 10]
       0  1  2  3   4

Agar pointer i = 2 hai
to vo 6 ko point kar raha hai.


2. Two Pointer kya hota hai

Jab hum ek hi array me do indexes use karte hain problem solve karne ke liye, use Two Pointer Technique bolte hain.

Example:

arr = [1,2,3,4,5]

left  -> 0
right -> 4
1 2 3 4 5
L       R

Yaha

• left ek pointer hai

• right dusra pointer hai


3. Two Pointer ka main idea

Normally do tarike hote hain.

1️⃣ Opposite direction

Ek pointer start se
Ek pointer end se

1 2 3 4 5
L       R

Use hota hai:

• pair sum

• palindrome

• sorted array problems



2️⃣ Same direction

Dono pointer start se move karte hain

1 2 3 4 5
L R

Use hota hai:

• duplicate remove

• sliding window

• subarray problems



4. Simple Example (Pair Sum)

Question:
Array me 2 numbers find karo jinka sum = target ho

arr = [1,2,3,4,6]
target = 6
Step 1
1 2 3 4 6
L       R
1 + 6 = 7

7 > 6

to right--



Step 2
1 2 3 4 6
L     R
1 + 4 = 5

5 < 6

to left++

Step 3
1 2 3 4 6
  L   R
2 + 4 = 6

Answer mil gaya ✅


5. Code (Java)
int left = 0;
int right = arr.length - 1;

while(left < right){
    
    int sum = arr[left] + arr[right];
    
    if(sum == target){
        System.out.println(arr[left] + " " + arr[right]);
        break;
    }
    else if(sum < target){
        left++;
    }
    else{
        right--;
    }
}


6. Two Pointer kyun use karte hain

Normal approach:

for i
   for j

Time Complexity

O(n²)

Two pointer approach

O(n)
