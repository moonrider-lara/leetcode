class Solution {
    func majorityElement(_ nums: [Int]) -> Int {
        var dict: [Int: Int] =  [:]
        
        for num in nums {
            if let value = dict[num] {
                dict[num] = value + 1
            } else {
                dict[num] = 1
            }
        }
        
        let half = nums.count / 2
        
        for key in dict.keys {
            if let value = dict[key], value > half {
                return key
            }
        }
        
        return 0
    }
}