class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        # This method allows printing of the linked list in a readable way
        result = []
        current = self
        while current:
            result.append(str(current.val))
            current = current.next
        return " -> ".join(result)

def remove(head):
    dummy = ListNode()
    tail = dummy
    while head != None:
        if head.next and head.val == head.next.val:
            head = head.next
        else:
            tail.next = head
            tail = tail.next
            head = head.next
    tail.next = None
    return dummy.next

l = ListNode(1, ListNode(1, ListNode(2,ListNode(3,ListNode(3,ListNode(3))))))
ans = remove(l)
print(ans)
