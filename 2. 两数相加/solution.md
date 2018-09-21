给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：
```
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
```

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0; // 进位
        while (q != null || p != null) {
            int x = p != null ? p.val:0; // 不存在就为0
            int y = q != null ? q.val:0; // 不存在就为0
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10); // sum可能进位了，所以取余
            curr = curr.next;
            if (q != null) {
                q = q.next;
            }
            if (p != null) {
                p = p.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry); // 最后一次相加还有进位
        }
        return dummyHead.next; // 返回链表开头
    }
}
```

```python
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry = 0
        curr = dummyHead = ListNode(0)
        while l1 != None or l2 != None or carry > 0:
            num1 = l1.val if l1 else 0
            num2 = l2.val if l2 else 0
            plus = carry + num1 + num2
            carry = plus // 10
            curr.next = ListNode(plus % 10)
            curr = curr.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        return dummyHead.next
```