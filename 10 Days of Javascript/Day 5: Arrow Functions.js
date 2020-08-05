

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    return nums.map((currentElement)=>(currentElement%2 === 0)?currentElement*2:currentElement*3 );
}

