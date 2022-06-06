/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  /*
   * Input: nums = [3,2,4], target = 6
   *
   * map = {3:0, 2:1}
   * i = 2
   * value = 4
   * complement_pair = 6 - 4 = 2
   * result = [1,2]
   */

  let map = {};
  for (let i = 0; i < nums.length; i++) {
    let value = nums[i];
    let complement_pair = target - value;
    if (map[complement_pair] !== undefined) {
      return [map[complement_pair], i];
    } else {
      map[value] = i;
    }
  }
};
