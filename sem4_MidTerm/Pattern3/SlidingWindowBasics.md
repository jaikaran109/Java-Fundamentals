Sliding Window bhi Two Pointer ki hi technique hai. 
Ye mostly subarray / substring problems me use hoti hai


1 . Sliding Window kya hota hai

Simple language me:

👉 Array ya string ka ek chota part (window) lekar usko slide (aage move) karte hain.

Example array:

[1,2,3,4,5]

Agar window size = 3

Window 1
[1,2,3] 4 5

Window 2
1 [2,3,4] 5

Window 3
1 2 [3,4,5]

Window shift hoti rehti hai, isliye naam Sliding Window.



2 . Sliding Window kyun use karte hain

Agar hum normal approach karein:

for(i)
   for(j)

Time Complexity

O(n²)

Sliding window se

O(n)

ban jata hai.



3. Sliding Window ke types
1️⃣ Fixed Window

Window size fix hota hai

Example:

size = 3
2️⃣ Variable Window

Window size change hota rehta hai

Example:

longest substring

Aaj hum Fixed Window se start karenge (sabse easy).




Question 1️⃣
Maximum Sum Subarray of Size K

Array:

arr = [2,1,5,1,3,2]
k = 3

Find maximum sum of subarray size 3

Step 1 (Normal Approach)
[2,1,5] = 8
[1,5,1] = 7
[5,1,3] = 9
[1,3,2] = 6

Answer
9


Sliding Window Idea

1️⃣ first window ka sum nikalo
2️⃣ next window ke liye

previous sum
- left element
+ new element



public class MaxSumSubarray {

    public static void main(String[] args) {

        int arr[] = {2,1,5,1,3,2};
        int k = 3;

        int sum = 0;

        // first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int maxSum = sum;

        for(int i = k; i < arr.length; i++){

            sum = sum - arr[i-k]; 
            sum = sum + arr[i];

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}


Dry Run

Array

2 1 5 1 3 2

First window

2 + 1 + 5 = 8

maxSum = 8

Slide window

8 - 2 + 1 = 7

maxSum = 8

Slide window

7 - 1 + 3 = 9

maxSum = 9

Slide window

9 - 5 + 2 = 6

Final Answer

9

Question 2️⃣
Find Average of Subarray of Size K

Array

arr = [1,3,2,6,-1,4,1,8,2]
k = 5

Find average of each subarray.

Windows
[1,3,2,6,-1] → 11/5 = 2.2
[3,2,6,-1,4] → 14/5 = 2.8
[2,6,-1,4,1] → 12/5 = 2.4
[6,-1,4,1,8] → 18/5 = 3.6
[-1,4,1,8,2] → 14/5 = 2.8


public class AverageSubarray {

    public static void main(String[] args) {

        int arr[] = {1,3,2,6,-1,4,1,8,2};
        int k = 5;

        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        System.out.println(sum / (double)k);

        for(int i = k; i < arr.length; i++){

            sum = sum - arr[i-k];
            sum = sum + arr[i];

            System.out.println(sum / (double)k);
        }
    }
}

Dry Run

First window

1 3 2 6 -1
sum = 11
avg = 2.2

Slide window

11 - 1 + 4 = 14
avg = 2.8

Slide window

14 - 3 + 1 = 12
avg = 2.4


Sliding Window ka pattern

Almost har question me ye pattern hota hai:

sum = sum - arr[i-k]
sum = sum + arr[i]

Window slide ho rahi hai.
