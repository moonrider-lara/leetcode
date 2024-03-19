class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        let l = nums.count
        
        for i in 0 ..< l {
            for j in i + 1 ..< l {
                if nums[i]+nums[j] == target{
                    return [i, j]
                }
            }
        }
        
        return []
    }
}