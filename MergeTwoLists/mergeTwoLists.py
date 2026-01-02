class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def mergeTwoLists(list1, list2):
    # Check if both lists are empty
    if list1 is None and list2 is None:
        # print("Both lists are empty.")
        return False

    # Debugging: Print the initial lists
    # print("Initial List 1:", end=" ")
    # print_list(list1)
    # print("Initial List 2:", end=" ")
    # print_list(list2)

    # Initialize a dummy node to simplify the merge process
    dummy = ListNode()
    tail = dummy

    # Merge the lists
    while list1 and list2:
        # print(f"Comparing {list1.val} and {list2.val}")
        if list1.val <= list2.val:
            # print(f"Appending {list1.val} from List 1")
            tail.next = list1
            list1 = list1.next
        else:
            # print(f"Appending {list2.val} from List 2")
            tail.next = list2
            list2 = list2.next
        tail = tail.next
        # print("Merged List so far:", end=" ")
        # print_list(dummy.next)

    # Attach any remaining nodes
    if list1:
        # print("List 1 has remaining nodes. Attaching remaining nodes from List 1.")
        tail.next = list1
    elif list2:
        # print("List 2 has remaining nodes. Attaching remaining nodes from List 2.")
        tail.next = list2

    # print("Final Merged List:", end=" ")
    # print_list(dummy.next)
    return dummy.next

# Helper function to print a linked list
# def print_list(node):
#     current = node
#     while current:
#         print(current.val, end=" -> ")
#         current = current.next
#     print("None")

# Test the function
l1 = ListNode(1, ListNode(2, ListNode(4)))
l2 = ListNode(1, ListNode(3, ListNode(4)))

# If both lists are None, it will print False; otherwise, it will print the merged list
# merged_list = mergeTwoLists(l1, l2)
# if not merged_list:
#     print(False)
# else:
#     print("Merged List Result:")
#     print_list(merged_list)

