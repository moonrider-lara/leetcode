class Solution {
    func isPalindrome(_ x: Int) -> Bool {
        return x == Int(String(String(x).reversed()))
    }
}