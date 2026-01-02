class Node():
    def __init__(self,data):
        self.data = data
        self.next = None

class Linkedlist():
    def __init__(self):
        self.head = None
    
    def add(self,data):
        new_node = Node(data)
        # if the list is empty, let the new node be its head
        if not self.head:
            self.head = new_node
            return
        #insert the new node at the end of list
        last = self.head
        while last.next: # traverse to the end of the list
            last = last.next
        last.next = new_node
    
    def display(self):
        current = self.head
        while current:
            print(current.data, end="->")
            current = current.next
        print("None")

    def reverse(self):
        previous = None
        current = self.head
        while current:
            next = current.next 
            current.next = previous
            previous = current
            current = next
        self.head = previous

    def delete_head(self):
        if self.head is None:
            print("List is empty.")
            return
        self.head = self.head.next

    def delete_by_value(self,value):
        # if the list is empty
        if self.head is None:
            print("List is empty.")
            return
        
        # if the value is the head
        if self.head.data == value:
            self.head = self.head.next
            return
        
        current =  self.head
        previous = None
        while current and current.data != value:
            previous = current
            current = current.next

        # if current is null, that means the value wanted is not found.
        if current:
            previous.next = current.next
        else:
            print("Node with value",value,"not found.")
    
    def delete_last(self):
        # if the list is empty
        if self.head is None:
            print("List is empty.")
            return

        if self.head.next is None:
            self.head = None
            return

        last = self.head
        while last.next.next:
            last = last.next
        last.next = None

def mergeTwoLists(list1,list2):
    ans = Linkedlist()

    # if list1 is None and list2 is None:
    #     return ans
    
    c1 = list1.head
    c2 = list2.head
    while c1:
        if c1.data>=c2.data:
            temp = c1.data
            c1.next
            temp2 = c2.data
            c2.next
            ans.add(temp)
            ans.add(temp2)
    print(ans.display())
    # c1 = list1.head
    # while c1:
    #     ans.add(c1.data)
    #     c1 = c1.next

    # print(ans.display())
    # c2 = list2.head
    # while c2:
    #     if c2.data >= c1.data:


l1 = Linkedlist()
l1.add(1)
l1.add(2)
l1.add(4)
l1.display()
l2 = Linkedlist()
l2.add(1)
l2.add(3)
l2.add(4)
l2.display()
print(mergeTwoLists(l1,l2))
