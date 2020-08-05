

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/

function sortNumber(a, b) {
  return a - b;
}

function getSecondLargest(nums) {
    // Complete the function


    nums.sort(sortNumber);

    let secondMax=nums[0];
    let max=nums[nums.length-1];
    let diff=max-nums[0];
     
    for(let i=0;i<nums.length;i++)
    {
        if(max-nums[i] < diff && nums[i] != max)
        {
            secondMax=nums[i];
            diff=max-nums[i];
        }
        
    }



    return secondMax;
}

