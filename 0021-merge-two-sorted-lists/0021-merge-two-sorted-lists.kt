/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        
        if (list1.`val` < list2.`val`) {
            return list1.apply { next = mergeTwoLists(list1.next, list2) }
        } else {
            return list2.apply { next = mergeTwoLists(list1, list2.next) }
        }
    }
}